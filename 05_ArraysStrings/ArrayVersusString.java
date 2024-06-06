
class ArrayVersusString {
  public static void main( String[] s) {

    {
      char[] s1 = {'H','e','y','!'};
      char[] s2 = s1;

      s2[3] = '?';

      /* Was wird in der Konsole ausgegeben und warum?
         Was muss oben geändert werden, damit s2 eine
         echte Kopie von s1 wird? */
      System.out.println(s1);
    }

    {
      String s1 = "Hey!";
      String s2 = s1;

      s2.replace('!','?');

      /* Was wird in der Konsole ausgegeben und warum?
         */
      System.out.println(s1);
    }
  }
}
