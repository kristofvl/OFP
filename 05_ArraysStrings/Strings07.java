/**
   Entferne alle HTML-Tags aus einem String.
   Zum Beispiel, "<h1>Hallo</h1><p>Dies ist ein <b>Test</b></p>"
   soll als Ausgabe haben: "HalloDies ist ein Test"
 */
class Strings07 {
    public static void main(String[] s) {
        String html = "<h1>Hallo</h1><p>Dies ist ein <b>Test</b></p>";
        String ohneHTMLTags = "";

        // Code kommt hier

        System.out.println("Ohne HTML-Tags: " + ohneHTMLTags);
    }
}
