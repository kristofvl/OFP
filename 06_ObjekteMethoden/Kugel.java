class Kugel {
  // Klassenattribute:
  final static double PI = 3.14159265;
  public static int anzahl = 0; // zählt erzeugte Kugeln
  // Attributes:
  private double xMitte = 1.0, yMitte, zMitte, radius;
  // Parameterloser Konstruktor (Default−Konstruktor):
  Kugel() {
    radius = 1;  // setze Radius des neuen Objekts,
				     // andere Attribute sind mit 0 initialisiert
    anzahl++;    // Klassenvariable erhöhen
  }
  Kugel(double x, double y, double z) {
    this(); 	      // ruft Konstruktor Kugel() auf
    xMitte = x;		// Aufruf von this() muss die
    yMitte = y; 		// allererste Anweisung sein
    zMitte = z;
  }
  Kugel(double x, double y, double z, double r) {
    this(x, y, z); 	// ruft Kugel(x,y,z) auf
    radius = r; 		// ändert Wert des Radius auf r
  }
  double getRadius() {
    return radius;
  }
  public static void main(String[] s) {
    Kugel k1;
    k1 = new Kugel(4.0, 6.7, 8.9, 3.0);
    k1.radius = 5.0;
    //System.out.println( Kugel.anzahl );
  }
}
