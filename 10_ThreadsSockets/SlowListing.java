public class SlowListing extends Thread {
  private String name;
  private Counter counter;
  public SlowListing(String name, Counter counter) {
    this.name = name; this.counter = counter;
  }
  public static void main(String[] args) {
    Thread[] t = new Thread[5];
    Counter cnt = new Counter(10);
    for (int i = 0; i < 5; ++i) {
      t[i] = new SlowListing("Thread-"+i, cnt); t[i].start();
    }
  }
  public void run() {
    while (true)
      System.out.println(counter.nextNumber()+" for "+name);
  }
}
class Counter {
  int cnt;
  public Counter(int cnt) {  this.cnt = cnt; }
  public int nextNumber() {
    int ret = cnt;
    // zeitaufwändige Berechnung um langwierige Operation zu simulieren:
    double x = 1.0, y, z;
    for (int i= 0; i < 9000000; ++i) {
      x = Math.sin((x*i%35)*1.13);
      y = Math.log(x+10.0);
      z = Math.sqrt(x+y);
    }
    cnt++;
    return ret;
  }
}

