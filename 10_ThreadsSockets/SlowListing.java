/**
 * Beispielprogramm zur Demonstration von Threads mit gemeinsam genutztem Objekt.
 *
 * Ein gemeinsam genutztes Objekt vom Typ `Counter` erzeugt fortlaufende Zahlen,
 * wobei jeder Zugriff eine aufwendige Berechnung simuliert.
 *
 * Fünf Threads greifen gleichzeitig auf dieses Objekt zu und geben
 * fortlaufend die von `nextNumber()` gelieferten Werte zusammen mit ihrem Namen aus.
 *
 * Ziel: Beobachtung von Nebenläufigkeit und möglicher Synchronisationsprobleme
 * beim Zugriff auf gemeinsam genutzte Daten.
 */

class Counter {
  private int cnt;
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

class SlowListing extends Thread {
  private String name; private Counter counter;
  public SlowListing(String name, Counter counter) {
    this.name = name; this.counter = counter;
  }
  public void run() {
    int count = 0;
    while (count < 99) {
      count = counter.nextNumber();
      System.out.println(count+" for "+name);
    }
  }
  public static void main(String[] args) {
    Thread[] t = new Thread[5];
    Counter cnt = new Counter(10);
    for (int i = 0; i < 5; ++i) {
      t[i] = new SlowListing("Thread-"+i, cnt); t[i].start();
    }
  }
}

