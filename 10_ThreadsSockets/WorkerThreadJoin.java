class WorkerThreadJoin {
  public static void main(String[] s) {
    // Erstellen Sie ein Array von Threads, die gleichzeitig ausgeführt werden:
    WorkThread t1 = new WorkThread();  // Erzeuge ein neues Thread−Objekt
    t1.start();  // Führe die run−Methode des Objekts in einem neuen Thread aus
    WorkThread t2 = new WorkThread();  // Erzeuge ein neues Thread−Objekt
    t2.start();  // Führe die run−Methode des Objekts in einem neuen Thread aus
    t1.join();
    t2.join();
    
  }
}
class WorkThread extends Thread {
  public double res = 0;
  public void run() {  // wird nebenläufig zum Aufrufer ausgeführt
    System.out.println("Working ...\n");
    double v = 1.000000001;
    for (double i=0; i<5000000000.0; i++) { v += v; }  // komplexe Berechnung
    res = v;
    System.out.println("Done!\n");
  }
}
