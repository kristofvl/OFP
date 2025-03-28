/**  Histogram: Zeichnen Sie ein Histogramm:
  */
import java.util.Random;   // random number generator

class Histogram {
  public static void main( String[] str ) {
    int[] liste;  liste = new int[25];
    Random rand = new Random();
    // Fuelle liste mit beliebige Integer in [0,24]:
    for ( byte i = 0; i < liste.length; i++ ) {
      liste[i] = rand.nextInt( liste.length );
    }
    // Fuelle erst ein 2D-Array von Booleans
    boolean [][] m = new boolean[liste.length][liste.length];
    for (int zeile = 0; zeile < liste.length; zeile++) {
      for (int spalte = 0; spalte < liste.length; spalte++) {
        if ( liste[zeile] < spalte ) {
          m[zeile][spalte] = true;
        } else {
          m[zeile][spalte] = false;
        }
      }
    }
    // Zeichne dann ein Histogramm (pro-Tipp: benutze "\u2589"-Block)
    for (int zeile = 0; zeile < liste.length; zeile++) {
      System.out.print( ((liste[zeile]<10) ? "0": "" ) + liste[zeile] + " |");
      for (int spalte = 0; spalte < liste.length; spalte++) {
        if (m[zeile][spalte]) System.out.print("\u2589");
        else System.out.print(' ');
      }
      System.out.println("|");
    }
  }
}
