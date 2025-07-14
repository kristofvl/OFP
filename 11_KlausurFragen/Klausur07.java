// Was ist die Ausgabe dieses Programms?

class Klausur07 {
  private final static short MAX = 4;
  private static int anzahl = 0;

  protected double note;

  public Klausur07() {
    anzahl++;
    this.note = anzahl / 2;
  }

  public double getNote() {
    return note;
  }

  public static void main(String[] s) {
    Klausur07[] klausur = new Klausur07[MAX];
    for (int k = 0; k < MAX; k++) {
      klausur[k] = new Klausur07();
      System.out.println( klausur[k].getNote() );
    }
  }
}
