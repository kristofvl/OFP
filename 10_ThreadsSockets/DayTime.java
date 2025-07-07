/**
 * Beispielprogramm: Verbindung zu einem Daytime-Zeitserver (RFC 867).
 *
 * Dieses Programm stellt eine TCP-Verbindung zum Server `time.nist.gov`
 * auf Port 13 her, um die aktuelle Uhrzeit im ASCII-Format abzurufen.
 * Der sogenannte "Daytime Service" ist ein einfaches textbasiertes
 * Netzwerkprotokoll, das von manchen Servern zur Verfügung gestellt wird.
 *
 * Nach dem Aufbau der Verbindung liest das Programm die Antwort vom Server
 * (typischerweise eine Datums- und Zeitangabe) und gibt sie auf der Konsole aus.
 *
 * Hinweis: Der Port 13 wird nicht mehr von allen Servern unterstützt
 * und kann in modernen Netzwerken (z. B. durch Firewalls) blockiert sein.
 */

import java.net.*;
import java.io.*;

public class DayTime {
  public static void main(String[] args) {
    String hostname = "time.nist.gov";
    try {
      Socket sock = new Socket(hostname, 13);
      InputStream in = sock.getInputStream();
      int len;
      byte[] b = new byte[100];
      while ( (len=in.read(b)) != -1) {
        System.out.write(b, 0, len);
      }
      in.close();
      sock.close();
    }
    catch (IOException e) {
      System.err.println(e.toString());
    }
  }
}
