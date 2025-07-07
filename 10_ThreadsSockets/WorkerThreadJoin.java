/**
 * Aufgabe: Synchronisation von Threads mit join()
 *
 * In diesem Programm wird ein Array von Threads erzeugt, die gleichzeitig eine
 * rechenintensive Aufgabe ausführen. Anschließend wird die Methode join() verwendet,
 * um auf das Beenden aller Threads zu warten.
 */

class WorkerThreadJoin {
  public static void main(String[] args) {
    // TODO: Ein Array mit mehreren Threads (z. B. 5 Stück) deklarieren
    // und mit Instanzen der Klasse WorkThread füllen.

    // TODO: Alle Threads mit start() starten, sodass sie gleichzeitig laufen.

    System.out.println("Alle Threads wurden gestartet.");
    // TODO: Für jeden Thread join() aufrufen, um auf dessen Beendigung zu warten.

    System.out.println("Alle Threads sind abgeschlossen.");
  }
}

class WorkThread extends Thread {
  // Implementiere eine Thread-ID id, die in dem Konstruktor gesetzt wird

  // run() wird nebenläufig zur main-Methode ausgeführt
  public void run() {
    System.out.println("Thread " + id + " startet Arbeit...");
    double v = 1.000000001;
    for (double i = 0; i < 500000000.0; i++) {  // ggf. kleinere Zahl zum Testen
      v *= v;
    }
    System.out.println("Thread " + id + " ist fertig.");
  }
}
