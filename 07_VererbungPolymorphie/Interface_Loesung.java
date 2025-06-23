/** Schreiben Sie ein Java-Programm, um eine Schnittstelle Figur
    mit der Methode getFlaeche() zu erstellen. Erstellen Sie drei
    Klassen, Rechteck, Kreis und Dreieck, die die Figur-
    Schnittstelle implementieren. Implementieren Sie dann die
    Methode getFlaeche() für jede der drei Klassen.
    */

interface Figur {
  double getFlaeche();
}

class Rechteck implements Figur {
  private double laenge, breite;
  public Rechteck(double laenge, double breite) {
     this.laenge = laenge;
     this.breite = breite;
  }
  public double getFlaeche() {
     return laenge * breite;
  }
}

class Interface_Loesung {
  public static void main(String[] s) {
    Rechteck r = new Rechteck(10.0, 15.0);
    System.out.println( "Fläche: " + r.getFlaeche() );
  }
}

