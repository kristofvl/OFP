/**
 * Beispielprogramm: Produzenten-Konsumenten-Problem mit gemeinsamen Speicher.
 *
 * In diesem Programm arbeiten zwei Threads – ein Produzent und ein Konsument –
 * auf gemeinsamem Speicher (ein `Vector`-Objekt). Der Produzent erzeugt zufällige
 * Zeichenketten und fügt sie der gemeinsamen Datenstruktur hinzu. Der Konsument
 * entnimmt die erzeugten Werte und verarbeitet sie.
 *
 * Die Synchronisierung erfolgt über den `synchronized`-Block, der auf dem `Vector`
 * selbst basiert. Die Methoden `wait()` und `notify()` steuern die Kommunikation
 * zwischen den Threads.
 *
 * Einschränkung:
 * Dieses Beispiel verwendet die Klasse `Vector`, die zwar synchronisiert ist,
 * aber für moderne Anwendungen gelten `BlockingQueue` oder `ConcurrentLinkedQueue`
 * als geeignetere Alternativen.
 */

import java.util.Vector;

public class ProdConListing {
  public static void main(String[] args) {
    Vector v = new Vector();
    Producer p = new Producer(v);
    Consumer c = new Consumer(v);
    p.start();
    c.start();
  }
}

// Produzent-Thread: erzeugt zufällige Werte und legt sie im gemeinsamen Vector ab
class Producer extends Thread {
  private Vector v;
  public Producer(Vector v) { this.v = v; }  // Referenz auf den gemeinsamen Puffer
  public void run() {
    String s;
    while (true) {
      synchronized (v) {
        s = "Wert "+Math.random();  // Erzeuge neuen zufälligen String
        v.addElement(s);
        System.out.println("Produzent erzeugte "+s);
        v.notify();  // Wecke eventuell wartende Konsumenten (.wait())
      }
      try {
        Thread.sleep((int)(1000*Math.random()));  // Zufällige Pause
      } catch (InterruptedException e) {  }
    }
  }
}

// Konsument-Thread: entnimmt Werte aus dem gemeinsamen Vector und verarbeitet sie
class Consumer extends Thread {
  private Vector v;
  public Consumer(Vector v) { this.v = v; }  // Referenz auf den gemeinsamen Puffer
  public void run() {
    while (true) {
      synchronized (v) {
        if (v.size() < 1)
          try { v.wait(); }  // Wartet, bis der Produzent notify() aufruft
          catch (InterruptedException e) {  }
        System.out.print("Konsument fand "+(String)v.elementAt(0));
        v.removeElementAt(0);
        System.out.println(" (verbleiben: "+v.size()+")");
      }
      try {
         Thread.sleep((int)(1000*Math.random()));  // Zufällige Pause
      } catch (InterruptedException e) {  }
    }
  }
}
