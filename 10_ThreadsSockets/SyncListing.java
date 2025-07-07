/**
 * Beispielprogramm zur Demonstration von Synchronisation zwischen Threads
 * beim Zugriff auf eine gemeinsame statische Variable.
 *
 * Zwei Threads inkrementieren gemeinsam die statische Variable `cnt`
 * und geben deren Wert aus. Der Zugriff auf `cnt` erfolgt innerhalb
 * eines synchronisierten Blocks, der auf der gemeinsamen Laufzeitklasse
 * (`getClass()`) basiert.
 *
 * Ziel: Vermeidung von Race Conditions durch Synchronisation.
 * Das Beispiel zeigt, wie mit `synchronized` sichergestellt wird,
 * dass nur ein Thread zur gleichen Zeit `cnt` inkrementiert und ausgibt.
 */

 class SyncListing extends Thread {
  public static void main(String[] args) {
    Thread t1 = new SyncListing();
    Thread t2 = new SyncListing();
    t1.start();
    t2.start();
  }
  public void run() {
    while (cnt < 99) {
      synchronized (getClass()) {   // getClass() gibt die Laufzeitklasse
        System.out.print(cnt+++" "); // dieses Objekts zurück (siehe 7.4)
      }
    }
  }
  static int cnt = 0;
}
