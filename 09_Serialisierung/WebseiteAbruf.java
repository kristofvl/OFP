/** Beispiel für das abrufen einer Webseite mit java.net.URL
    */

import java.io.*; // benutze BufferedReader, InputStreamReader;
import java.net.*; // benutze HttpURLConnection, URI, URL;

class WebseiteAbruf {
  public static void main(String[] s) throws Exception {
    URI uri = URI.create("https://example.com");
    URL url = uri.toURL();
    HttpURLConnection verbindung = (HttpURLConnection) url.openConnection();

    verbindung.setRequestMethod("GET");
    // verbindung.setRequestProperty("User-Agent", "MeinJavaClient/1.0"); // falls geblockt
    int status = verbindung.getResponseCode();
    if (status != 200) {
      System.out.println("Fehler beim Abrufen: HTTP " + status);
      return;
    }
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(verbindung.getInputStream()))) {
      String zeile;
      while ((zeile = reader.readLine()) != null) {
        System.out.println(zeile);  // HTML-Zeile der Webseite
      }
    }
  }
}
