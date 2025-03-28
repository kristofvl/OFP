class Bankkonto {
  public static void main(String args[]) {
    Konto konto = new Konto(10);  // Konto mit 10 EUR
    for (int i=0; i<3; i++) {  // dreimal 10 EUR abheben
      Banking t = new Banking(konto, 10);
      t.start();
    }
  }
}

class Banking extends Thread {
  Konto konto;   // Eingabedaten fuer
  double betrag; // den Thread
  Banking(Konto k, double b) { konto = k; betrag = b; }
  public void run() {
    konto.abheben(betrag);
    System.out.println("Kontostand: " + konto.getSaldo());
  }
}

class Konto {
  public Konto(double saldo) { this.saldo = saldo; }
  private double saldo = 0.0;
  public double getSaldo() { return saldo; }
  public boolean abheben(double betrag) {
    double neuerSaldo = saldo - betrag;
    boolean ok = true;
    if (neuerSaldo < 0) {
      // Bei Ueberziehung: Anfrage an Schufa (über Netzwerk)
      ok = frageSchufa(neuerSaldo); // kann dauern ...
    }
    if (ok)
      saldo = neuerSaldo; // Buchung durchfuehren
    return ok;
  }
  private boolean frageSchufa(double saldo) {
    try {
       Thread.sleep(1000);
    } catch (InterruptedException e) {  }
    return true;
  }
}
