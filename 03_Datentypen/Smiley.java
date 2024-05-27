/** 
  Mit UniCode können mehr Symbole gedruckt werden (wenn das Terminal 
  UniCode akzeptiert): https://en.wikipedia.org/wiki/List_of_Unicode_characters
  https://docs.oracle.com/javase/6/docs/api/java/lang/Character.html#unicode
  https://stackoverflow.com/questions/5903008/what-is-a-surrogate-pair-in-java
  */

class Smiley {
  public static void main( String[] str ) {
    char c1 = 0xD83D;  // Unicode Zeichen 'GRINNING FACE'
    char c2 = 0xDE00;  // 
    System.out.println( c1 + "" + c2 );  // für später: Wieso ""?  
  }
}
