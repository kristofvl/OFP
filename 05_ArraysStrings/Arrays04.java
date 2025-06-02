/**  Vervollständige das unten stehende Programm, so dass nach
     Übereinstimmungen mit der Sequenz im DNA-Array gesucht wird.
  */

import java.util.Scanner;  // lese Strings aus in der Konsole

class Arrays04 {
  public static void main( String[] str ) {

    // Dieses Array enthält die DNA-Sequenz:
    char[] dna = {'a','t','c','g','c','g','c','g','a','a','t','t'};
    // Dieses Array enthält die Sequenz, nach der gesucht werden soll:
    char[] seq;

    /* Der folgende Java-Code liest mehrere Zeichen von der Konsole,
       bis der Benutzer die Return-Taste drückt, und legt diese in das
       char-Array seq: */
    System.out.print( "Sequenz? ");
    Scanner scan = new Scanner(System.in);
    seq = scan.next().toCharArray();

    /* Gehe die DNS-Sequenz durch und suche nach Stellen, an denen die
    Sequenz genau mit der DNS-Sequenz übereinstimmt. Für die Sequenz
    'at' zum Beispiel sollte die Ausgabe Übereinstimmungen an den
    Positionen 0 und 9 ergeben: */

  }
}
