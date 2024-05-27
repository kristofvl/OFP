/**
  Mit UniCode können mehr Symbole gedruckt werden (wenn das Terminal
  UniCode akzeptiert): https://en.wikipedia.org/wiki/List_of_Unicode_characters
  https://docs.oracle.com/javase/6/docs/api/java/lang/Character.html#unicode
  https://stackoverflow.com/questions/5903008/what-is-a-surrogate-pair-in-java
  */

class Smiley {
  public static void main( String[] str ) {
    char c1 = 0x7117;  // Unicode Zeichen für: Soße aus Sojasoße, Mirin und Zucker
    System.out.println( c1 );

    char c2 = 0xD83D;  // Unicode Zeichen 'GRINNING FACE' in hexadezimal,
    char c3 = 0xDE00;  // als "surrogate pair"
    System.out.println( c2 + "" + c3 );  // für später: Wieso ""?
  }
}
