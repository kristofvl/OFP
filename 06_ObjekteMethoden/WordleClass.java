/**  WordleClass: Implementieren Sie das einfache Wordle-Spiel jetzt als Klasse:
  */
import java.util.Scanner;  // scan strings in der Konsole
import java.util.Random;   // random number generator

class WordleClass {
  private String loesung = "weary"; // Loesunswort
  private String hint = "-----";    // Hinweis mit gefundenen Buchstaben
    // Implementiere ein Schleife, die dialog ausführt & aufhört

  private String dialog() {
    System.out.print( hint + ", what is your guess? ");
    Scanner scan = new Scanner(System.in);
    return scan.next();
  }

  public void run() {
    while (!loesung.equals(hint)) {
      String s = dialog();
      for (int i = 0; i < loesung.length(); i++) {
        if ( loesung.charAt(i) == s.charAt(i) ) {
          hint = hint.substring(0,i) + loesung.charAt(i)
                 + hint.substring(i+1,loesung.length()) ;
        }
      }
    }
  }  // public Methode

  public static void main( String[] str ) {  // main ist eine Klassenmethode
    WordleClass w = new WordleClass();
    w.run();
  }
}


