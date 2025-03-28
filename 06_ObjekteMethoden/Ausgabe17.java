// Was ist die Ausgabe dieses Programms?
class Ausgabe17 {
  private final static short MAX = 9;
  private static int anzahl = 4;
  protected double note;

  public Ausgabe17() {
    switch(anzahl) {
      case 6:
        this.note = (++anzahl) / 2;
        break;
      default:
        this.note = (++anzahl) / 2.0;
        break;
    }
  }

  public double getNote()  {
    return note;
  }

  public static void main(String[] s) {
    Ausgabe17[] ausgabe = new Ausgabe17[MAX];
    for (int k = 6; k < MAX; ++k) {
      ausgabe[k] = new Ausgabe17();
      System.out.println( ausgabe[k].getNote() );
    }
  }

}
