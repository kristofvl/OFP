/** Beispiel: Zahlungsabwicklung mit Polymorphismus
    Schreibe die Methode 'bezahlen' in Zahlungsmethode so um, dass die
    Methoden 'bezahlen' der untergeordneten Klassen effizienter bzw.
    kürzer werden.
    */

// Abstrakte Basisklasse
abstract class Zahlungsmethode {
  abstract void bezahlen(double betrag);
}

// Abgeleitete Klasse: Kreditkarte
class Kreditkarte extends Zahlungsmethode {
  void bezahlen(double betrag) {
    System.out.println("Bezahlt: " + betrag + " Euro mit Kreditkarte.");
  }
}

// Abgeleitete Klasse: PayPal
class PayPal extends Zahlungsmethode {
  void bezahlen(double betrag) {
     System.out.println("Bezahlt: " + betrag + " Euro mit PayPal.");
  }
}

// Abgeleitete Klasse: Bitcoin
class Bitcoin extends Zahlungsmethode {
  void bezahlen(double betrag) {
    System.out.println("Bezahlt: " + betrag + " Euro mit Bitcoin.");
  }
}

class Bezahlung {
  static void zurKasse(Zahlungsmethode methode, double betrag) {
    methode.bezahlen(betrag);
  }
  public static void main(String[] args) {
    Zahlungsmethode methode = null;

    methode = new Kreditkarte();
    zurKasse(methode, 99.99);   // Ausgabe: Bezahlt: 99.99 Euro mit Kreditkarte.

    methode = new PayPal();
    zurKasse(methode, 49.99);   // Ausgabe: Bezahlt 49.99 Euro mit PayPal.

    methode = new Bitcoin();
    zurKasse(methode, 0.005);   // Ausgabe: Bezahlt 0.005 Euro mit Bitcoin.
  }
}
