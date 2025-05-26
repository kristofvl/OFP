
class Logops {
 public static void main(String[] s) {
  int x, y, zaehler;
  boolean leseFlag, schreibFlag;

  x = 0; y = 3; zaehler = 4;
  leseFlag = true; schreibFlag = false;

  if (leseFlag || schreibFlag)                        // logisches ODER, schreibFlag nicht
    System.out.println("leseFlag ODER schreibFlag");  // ausgewertet wenn leseFlag == true

  if (leseFlag | schreibFlag)                         // logisches ODER, immer beide
    System.out.println("leseFlag ODER schreibFlag");  // Operanden ausgewertet

  if ((x != 0) && (y / x < 5))                        // logisches UND, (y / x < 5) nicht
    System.out.println("x!=0 UND y/x<5");             // ausgewertet wenn x == 0

  if (leseFlag & (zaehler < 10))                      // logisches UND, immer beide
    System.out.println("leseFlag UND zaehler<10");    // Operanden ausgewertet

  if (!(x < 0)) 				   // entspricht  if (x >= 0)
    System.out.println("!(x<0)");

 }
}
