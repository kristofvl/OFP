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

class Producer extends Thread {
  private Vector v;
  public Producer(Vector v) { this.v = v; }
  public void run() {
    String s;
    while (true) {
      synchronized (v) {
        s = "Wert "+Math.random();
        v.addElement(s);
        System.out.println("Produzent erzeugte "+s);
        v.notify();
      }
      try {
        Thread.sleep((int)(100*Math.random()));
      } catch (InterruptedException e) {  }
    }
  }
}

class Consumer extends Thread {
  private Vector v;
  public Consumer(Vector v) { this.v = v; }
  public void run() {
    while (true) {
      synchronized (v) {
        if (v.size() < 1)
          try { v.wait(); } catch (InterruptedException e) {  }
        System.out.print("Konsument fand "+(String)v.elementAt(0));
        v.removeElementAt(0);
        System.out.println(" (verbleiben: "+v.size()+")");
      }
      try {
         Thread.sleep((int)(100*Math.random()));  // Warte 1 Sekunde
      } catch (InterruptedException e) {  }
    }
  }
}
