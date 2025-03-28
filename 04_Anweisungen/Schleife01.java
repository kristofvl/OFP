/**
  Implementiere ein Programm, dass von 1 bis 26 zählt, aber statt der Zahl
  "hoppla" ausgibt, wenn diese Zahl ein Vielfaches von 7 ist.
  System.out.println() ..
  */

class Schleife01 {
  public static void main( String[] str ) {
    for (int i = 1; i <= 26; i++) {
      if (i % 7 == 0) {  // teilbar durch 7 ?
        System.out.println("hoppla");
      } else {
        System.out.println(i);
      }
    }
  }
}
