/**
 * Aufgabe: Parallele Verarbeitung mit mehreren Threads
 *
 * Dieses Programm demonstriert die Erzeugung und gleichzeitige Ausführung
 * mehrerer Threads. Jeder Thread führt eine rechenintensive Operation aus
 * und gibt dabei seine eigene Thread-ID aus.
 */

class WorkerThread {
  public static void main(String[] s) {
    // Erstelle ein Array mit 5 Threads, die gleichzeitig ausgeführt werden.
    // Hinweis: Mit "Thread t = new WorkThread();" wird ein neues Thread-Objekt erstellt,
    // und durch "t.start()" wird dessen run()-Methode in einem eigenen Thread gestartet.
    // Implementiere einen Konstruktor und ein Attribut in der Klasse WorkThread,
    // sodass in der run()-Methode die Thread-ID ausgegeben wird.


  }
}
class WorkThread extends Thread {
  public void run() {  // wird nebenläufig zum Aufrufer ausgeführt


    System.out.println("Working in "+threadNum+"...\n");
    double v = 1.000000001;
    for (double i=0; i<5000000000.0; i++) { v *= v; }  // komplexe Berechnung
    System.out.println("Done!\n");
  }
}
