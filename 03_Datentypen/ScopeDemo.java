class ScopeDemo {
 public static void main(String[] s) {
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
