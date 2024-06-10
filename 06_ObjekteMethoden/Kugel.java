class Kugel {
  // Klassenattribute:
  final static double PI = 3.14159265;
  static int anzahl = 0; // zählt erzeugte Kugeln
  // Attributes:
  double xMitte, yMitte, zMitte, radius;
  // Parameterloser Konstruktor (Default−Konstruktor):
  Kugel() {
    radius = 1;	   // setze Radius des neuen Objekts,
				   // andere Attribute sind mit 0 initialisiert
    anzahl++;  // Klassenvariable erhöhen	
  }
  Kugel(double x, double y, double z) {
    this(); 	         // ruft Konstruktor Kugel() auf
    xMitte = x;		// Aufruf von this() muss die
    yMitte = y; 		// allererste Anweisung sein
    zMitte = z;
  }
  Kugel(double x, double y, double z, double r) {
    this(x, y, z); 	// ruft Kugel(x,y,z) auf
    radius = r; 		// ändert Wert des Radius auf r
  }
  public static void main(String[] s) {

    
  }
}
