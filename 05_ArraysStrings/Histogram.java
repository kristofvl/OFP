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
    // Zeichne dann ein Histogramm (pro-Tipp: benutze "\u2589"-Block)
  }
}
