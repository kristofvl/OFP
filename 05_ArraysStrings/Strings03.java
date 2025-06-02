/**
   Überprüfe, ob eine Zeichenkette ein Palindrom ( ein Wort
   dass sich vorwärts und rückwärts gleich liest) ist.
   Als Beispiel: "lagerregal" ergibt "Palindrom"
 */
class Strings03 {
    public static void main(String[] s) {
        String text = "lagerregal";
        String umgekehrt = "";

        // Code kommt hier

        if (!text.equals(umgekehrt)) {
          System.out.print("Kein ");
        }
        System.out.println("Palindrom");
    }
}
