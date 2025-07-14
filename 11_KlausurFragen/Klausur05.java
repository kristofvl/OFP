/** Was ist die Ausgabe dieses Programms?
    */
class Klausur05 {
  public static void main(String[] s) {
    MyInt i = new MyInt();
    do {
      System.out.println( i.print(i.me < 9, i) );
    } while (i.me < 12);
  }
}
class MyInt {
  public int me;
  public MyInt() { me = 7; }
  public int add3() { me = me + 3; return me;}
  public String print(boolean b, MyInt of) {
    if (!b) return "1" + "-" + of.add3();
    else    return "2" + "+" + of.add3();
  }
}
