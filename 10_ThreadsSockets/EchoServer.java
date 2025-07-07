/**
 * Beispielprogramm: Einfacher Echo-Server mit Thread-basierter Verarbeitung.
 *
 * Dieses Programm implementiert einen einfachen TCP-Server, der auf Port 7
 * auf eingehende Verbindungen wartet. Für jede eingehende Verbindung wird
 * ein eigener Thread (`EchoClientThread`) gestartet, der die Kommunikation
 * mit dem jeweiligen Client übernimmt.
 *
 * Der Server liest byteweise von der Eingabe (vom Client) und sendet die Daten
 * direkt zurück (Echo-Funktion). Gleichzeitig wird die empfangene Nachricht
 * auch auf der Server-Konsole ausgegeben.
 */

import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;

class EchoServer {
  public static void main(String[] args) {
    int cnt = 0;
    try {
      System.out.println("Warte auf Verbindungen auf Port 7...");
      ServerSocket echod = new ServerSocket(7);
      while (true) {
         Socket socket = echod.accept();
         (new EchoClientThread(++cnt, socket)).start();
      }
    } catch (IOException e) {
      System.err.println(e.toString());
      System.exit(1);
    }
  }
}

class EchoClientThread extends Thread {
  private int name;
  private Socket socket;
  public EchoClientThread(int name, Socket socket) {
    this.name = name;
    this.socket = socket;
  }
  public void run() {
    String msg = "EchoServer: Verbindung " + name;
    System.out.println(msg + " hergestellt");
    try {
      InputStream in = socket.getInputStream();
      OutputStream out = socket.getOutputStream();
      out.write((msg + "\r\n").getBytes());
      int c;
      while ((c = in.read()) != -1) {
        out.write((char)c);
        System.out.print((char)c);
      }
      System.out.println("Verbindung " + name + " wird beendet");
      socket.close();
    }
    catch (IOException e) {
      System.err.println(e.toString());
    }
  }
}
