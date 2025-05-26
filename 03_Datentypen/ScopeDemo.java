/**
  Eine in einer Methode deklarierte Variable (= lokale Variable) ist ab
  der Deklaration bis zum Ende des umgebenden Blocks (siehe 4.3) gültig.
  */

class ScopeDemo {
 public static void main(String[] s) {

  // Gültigkeitsbereich / Scope:
  {
   int a = 3, b = 1;
   if (a > 0) {
     // int b;  // Fehler: b bereits deklariert
	   int c;  // OK
   }
   {
     char c;  // OK
   }
     // double a;  // Fehler: a bereits deklariert
  }

 }
}
