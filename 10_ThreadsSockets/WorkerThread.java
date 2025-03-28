class WorkerThread {
  public static void main(String[] s) {
    // Erstellen Sie ein Array von Threads, die gleichzeitig ausgeführt werden:
    Thread[] t = new Thread[5];
    for (int i=0; i<5; i++) {
      t[i] = new WorkThread();
      t[i].start();  // Führe die run−Methode des Objekts in einem neuen Thread aus
    }
  }
}
class WorkThread extends Thread {
  public void run() {  // wird nebenläufig zum Aufrufer ausgeführt
    System.out.println("Working ...\n");
    double v = 1.000000001;
    for (double i=0; i<5000000000.0; i++) { v *= v; }  // komplexe Berechnung
    System.out.println("Done!\n");
  }
}
