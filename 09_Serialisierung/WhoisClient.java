/** Ein einfacher WHOIS-Client in Java (via TCP). WHOIS verbindet sich mit einem
    WHOIS-Server über Port 43 und sendet eine Domain wie google.com.
    Der Server antwortet mit Infos: Registrar, Name, Ablaufdatum usw.
    */

import java.io.*;  // benutze BufferedReader, InputStreamReader, OutputStream;
import java.net.Socket;

class WhoisClient {
  public static void main(String[] str) {
    String domain = "google.com";  // Beliebige Domain
    String whoisServer = "whois.verisign-grs.com";  // WHOIS-Server für .com/.net

    try {
      Socket socket = new Socket(whoisServer, 43);
      OutputStream out = socket.getOutputStream();
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      out.write((domain + "\r\n").getBytes());  // Domain senden (WHOIS-Protokoll verlangt CRLF)

      String zeile;
      while ((zeile = in.readLine()) != null) {
        System.out.println(zeile);  // Ausgabe zeilenweise
      }

    } catch (Exception e) {
      System.err.println("Fehler: " + e.getMessage());
    }
  }
}
