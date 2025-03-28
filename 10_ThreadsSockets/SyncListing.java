public class SyncListing extends Thread {
  static int cnt = 0;
  public static void main(String[] args) {
    Thread t1 = new SyncListing();
    Thread t2 = new SyncListing();
    t1.start();
    t2.start();
  }
  public void run() {
    while (true) {
      //synchronized (getClass()) {
      //  System.out.print(cnt+++" ");
      //}
      addOne();
    }
  }
  public synchronized void addOne() {
    System.out.print(cnt+++" ");
  }
}
