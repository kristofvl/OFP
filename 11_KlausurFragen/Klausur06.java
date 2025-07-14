/** Was ist die Ausgabe dieses Programms?
 */

class Klausur06 {

  public static double calc(int[] array, int number) {
    for (int z = 2; z > 0; z-=2)
      array[z]--;
    return number;
  }

  public static void main(String[] s) {
    int[] myArray = { 1, 33, 7};
    myArray[0] = myArray.length + 1;
    while (myArray[2] > 5)
      System.out.println( calc(myArray, myArray[2]) );
  }

}
