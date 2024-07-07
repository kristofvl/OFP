public class Listing extends Thread {
  static int cnt = 0;
  public static void main(String[] args) {
    Thread t1 = new Listing();
    Thread t2 = new Listing();
    t1.start();
    t2.start();
  }
  public void run() {
    while (true) System.out.print(cnt+++" ");
  }
}
