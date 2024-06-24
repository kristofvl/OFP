/** Schreiben Sie ein Java-Programm, um eine Schnittstelle Figur
    mit der Methode getFlaeche() zu erstellen. Erstellen Sie drei
    Klassen, Rechteck, Kreis und Dreieck, die die Figur-
    Schnittstelle implementieren. Implementieren Sie dann die
    Methode getFlaeche() für jede der drei Klassen.
    */

class App {
  public static void main(String[] s) {
    Figur f;
    f = new Rechteck(6.0, 7.0);
    System.out.println("Flaeche: " + f.getFlaeche());
  }
}

