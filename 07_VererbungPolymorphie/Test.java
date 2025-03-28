/** 3. Implementieren Sie eine Klasse namens Test, die in main() ein
    Objekt k der Klasse Kreis mit dem Radius 2 erzeugt und dann die
    Oberfläche mit der Methode getFlaeche von k ausgibt. 
    PI ? */

class Test {
  public static void main(String[] s) {
    System.out.println( Figur.PI );
  }
}

/** 1. Implementieren Sie eine Schnittstelle Figur, die ein Attribut
    namens PI mit dem Wert 3.1415 und eine Methode namens
    getFlaeche() hat, die eine Variable mit Typ double zurückgibt. */

interface Figur {
  double PI = 3.1415;
  double getFlaeche();
}

/** 2. Implementieren Sie eine Unterklasse von Figur, genannt Kreis,
    die ein Attribut radius und die Methode getFlaeche hat. */

class Kreis implements Figur {
  private double radius;
  public Kreis( double r ) { radius = r; }
  public double getFlaeche() {
    return radius * radius * PI;
  }
}
