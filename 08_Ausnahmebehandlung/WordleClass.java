/**  WordleClass: das komplette Wordle-Spiel mit Wörterliste
  */

import java.util.Scanner;  // scan strings in der Konsole
import java.util.Random;   // Random Number Generator
import java.io.File;

class WordleClass {
  private String loesung = "weary"; // default Loesunswort
  private String hint = "-----";    // Hinweis mit gefundenen Buchstaben
  private String[] words = null;    // Wörterarray
  private static final int MAX_WORDS = 10000; // Maximum # Wörter

  public static String dialog( String hint ) {  // Zeige Hinweis, Eingabe
    System.out.print( hint + ", what is your guess? ");
    Scanner scan = new Scanner(System.in);
    return scan.next();
  }
  private void loadWords(String filename) {
    int len = 0;
    try {  // lade Wörter aus filename (z.B. "words.txt"):
      words = new String[MAX_WORDS];
      Random rnd = new Random();
      Scanner scanner = new Scanner(new File(filename));
      while ( (scanner.hasNextLine()) && (len<MAX_WORDS) ) {
        words[len] = scanner.nextLine();
        if (rnd.nextInt(100)<1) { loesung = words[len]; }
        len++;
      }
      scanner.close();
      System.out.println((len-1) + " Wörter gelesen");
    }
    catch (java.io.IOException e) {  // backup Wörter falls Datei nicht besteht
      len = 3;
      words = new String[len];
      words[0] = "worse";
      words[1] = "worth";
      words[2] = "words";
    }
  }
  public void run() {
    String in;           // Eingabe Benutzer
    char[] hintChar;     // Array von char fuer hint zu aendern
    loadWords("words.txt");

    do {
      in = dialog( hint );
      hintChar = hint.toCharArray();
      if ( in.length() >= loesung.length() ) {
        for (int i = 0; i < loesung.length(); i++ ) {  // Kontrolliere einzelne
          if ( in.charAt(i) == loesung.charAt(i) ) {   // Buchstaben von in
            hintChar[i] = in.charAt(i);                // und zeige sie in hintChar
          } else {                                     // wenn richtig
            boolean found = false;
            for (int j = 0; j < loesung.length(); j++ ) {  // suche Buchstaben an  
               if ( in.charAt(i) == loesung.charAt(j) ) {  // andere Stellen in loesung
                 found = true;
               }
            }
            hintChar[i] = (found?'?':'-');
          }
        }
      } else {
        System.out.println("word too short.");
      }
      hint = new String(hintChar);
    } while ( ! in.equals( loesung ) );
  }

  public static void main( String[] str ) {  // main ist eine Klassenmethode
    WordleClass w = new WordleClass();
    w.run();
  }
}
