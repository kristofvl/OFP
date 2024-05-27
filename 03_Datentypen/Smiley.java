/** 
  Mit UniCode können mehr Symbole gedruckt werden (wenn das Terminal 
  UniCode akzeptiert)
  */

class Smiley {
  public static void main( String[] str ) {
    char c1 = 0xD83D;  // Unicode Zeichen 'GRINNING FACE'
    char c2 = 0xDE00;  // https://en.wikipedia.org/wiki/List_of_Unicode_characters
    System.out.println( c1 + "" + c2 );  // für später: Wieso ""?  
  }
}
