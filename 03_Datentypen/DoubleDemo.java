/**
  Double Demo: Der folgende Java-Code verwendet die double-Syntax,
  um vier double-Variablen zu initialisieren. In der Gleitkomma-
  Arithmetik gelten Assoziativitäts- und Kommutativitätsgesetz
  nicht mehr: Welche Variable, x oder y, hat keinen Rundungsfehler?
  */

class DoubleDemo {
  public static void main( String[] str ) {
    double a = 5.0e-12;  // a = 0.000 000 000 005
    System.out.println("Der Wert der Variable a ist: " +  a );
		double b = 1.0e+5;  // b = 100 000.000 000 000 00
		System.out.println("Der Wert der Variable b ist: " +  b );
		double x = a + a + b;
		System.out.println("Der Wert der Variable x ist: " +  x );
		double y = b + a + a;
		System.out.println("Der Wert der Variable y ist: " +  y );
  }
}
