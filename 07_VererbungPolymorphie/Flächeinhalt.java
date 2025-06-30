/** Berechnung des Flächeninhalts von geometrischen Formen mit:
    -super und super(), this, Klassenattribut, Klassenmethode
    */

class Form {
  protected String name;
  public Form(String name) {
    // weise den Inhalt des Parameter name dem Attribut name zu.

  }
  // Berechnung des Flächeninhalts (wird in abgeleiteten Klassen überschrieben)
  public double berechneFlaeche() {
    System.out.println("Berechnung der Fläche für: " + name);
    return 0.0;  // Für eine allgemeine Form geben wir eine leere Fläche zurück
  }
}

class Kreis extends Form {
  private double radius;
  // Konstruktor, ruft den Konstruktor der Basisklasse mit super() auf
  public Kreis(double radius) {
    // Initialisiere name mit "Kreis" über Forms Konstruktor:
    
    this.radius = radius;
  }
  // Überschreibt die Methode zur Berechnung des Flächeninhalts für einen Kreis
  public double berechneFlaeche() {
    // Rufe erst die Methode der Basisklasse auf
    
    // Berechne dann A = π * r² (benutze Math.PI)
    double ret = 0;
    return ret;
  }
}

class Rechteck extends Form {
  private double laenge, breite;
  // Konstruktor, ruft den Konstruktor der Basisklasse mit super() auf
  public Rechteck(double laenge, double breite) {
    // Initialisiere mit "Rechteck" über Forms Konstruktor:
    
    this.laenge = laenge;
    this.breite = breite;
  }
  // Überschreibt die Methode zur Berechnung des Flächeninhalts für ein Rechteck
  public double berechneFlaeche() {
    // Rufe die Methode der Basisklasse auf
    // Berechne dann A = l * b
    double ret = 0;
    return ret;
  }
}

class Dreieck extends Form {
  private double grundseite, höhe;
  // Konstruktor, ruft den Konstruktor der Basisklasse mit super() auf
  public Dreieck(double grundseite, double höhe) {
    // Initialisiere mit "Dreieck" über Forms Konstruktor:
    
    this.grundseite = grundseite;
    this.höhe = höhe;
  }
  // Überschreibt die Methode zur Berechnung des Flächeninhalts für ein Dreieck
  public double berechneFlaeche() {
    // Rufe erst die Methode der Basisklasse auf
    
    // Berechne dann A = 1/2 * g * h
    double ret = 0;
    return ret;
  }
}

class Flächeinhalt {
  public static void main(String[] args) {
    // Erstelle Instanzen der verschiedenen Form-Klassen:
    // ein Kreis mit Radius 5
    
    // ein Rechteck mit Länge 4 und Breite 6
    
    // ein Dreieck mit Grundseite 8 und Höhe 5
    
    // Berechne und gebe die Flächeninhalte aus:
    System.out.println("--- Kreis ---\n  Flächeinhalt: ");
    System.out.println("\n--- Rechteck ---\n  Flächeinhalt: ");
    System.out.println("\n--- Dreieck ---\n  Flächeinhalt: ");
    
    // - Erstelle ein Klassenattribut anzahlFormen in Form, so dass bei jedem
    //   erstellten Form-Objekt diese Zahl um 1 erhöht wird.
    // - Erstelle eine Klassenmethode, die die Anzahl der erstellten Form-
    //   Instanzen zurückgibt, und rufe diese hier auf:

  }
}
