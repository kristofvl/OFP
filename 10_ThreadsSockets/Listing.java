/**
 * Beispielprogramm zur Demonstration von Race Conditions bei gemeinsamem Zugriff
 * mehrerer Threads auf eine gemeinsame (statische) Variable ohne Synchronisation.
 *
 * Zwei Threads greifen gleichzeitig auf die statische Variable `cnt` zu,
 * inkrementieren sie und geben den Wert aus. Da keine Synchronisation erfolgt,
 * kann es zu nicht-deterministischen Ausgaben, Überschneidungen oder
 * doppelten bzw. fehlenden Werten kommen.
 *
 * Ziel: Veranschaulichung von Nebenläufigkeitsproblemen (Race Conditions)
 * bei gemeinsam genutzten Daten ohne Schutzmechanismen.
 */

 class Listing extends Thread {
  public static void main(String[] args) {
    Thread t1 = new Listing();
    Thread t2 = new Listing();
    t1.start();
    t2.start();
  }
  public void run() {
    while (cnt < 99) System.out.print(cnt+++" ");
  }
  static int cnt = 0;  // Klassenattribut: Besteht 1x für alle Objekte
}
