import java.io.*;
import java.net.*;

class EchoClient {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java EchoClient <host>");
      System.exit(1);
    }
    try {
      Socket sock = new Socket(args[0], 7);
      InputStream in = sock.getInputStream();
      OutputStream out = sock.getOutputStream();
      sock.setSoTimeout(300);  // Timeout setzen
      OutputThread th = new OutputThread(in);  // Ausgabethread erzeugen
      th.start();
      // Schleife für Benutzereingaben
      BufferedReader conin = new BufferedReader(
                                  new InputStreamReader(System.in));
      String line = "";
      while (true) {
        line = conin.readLine();    // Eingabezeile lesen
        if (line.equalsIgnoreCase("QUIT"))
          break;
        out.write(line.getBytes());  // Eingabezeile an ECHO-Server
        out.write('\r');
        out.write('\n');
        th.yield();  // Ausgabe abwarten
      }
      // Programm beenden
      System.out.println("terminating output thread...");
      th.requestStop();
      th.yield();
      try { Thread.sleep(1000); } catch (InterruptedException e) { }
      in.close();
      out.close();
      sock.close();
    } catch (IOException e) {
      System.err.println(e.toString());
      System.exit(1);
    }

  }  // end main
}

class OutputThread extends Thread {
  InputStream in;
  boolean stoprequested;

  public OutputThread(InputStream in) {
     super();
     this.in = in;
     stoprequested = false;
  }

  public synchronized void requestStop() {
     stoprequested = true;
  }
  public void run() {
    int len;
    byte[] b = new byte[100];
    try {
      while (!stoprequested) {
        try {
          if ((len = in.read(b)) == -1) break;
          System.out.write(b, 0, len);
        } catch (InterruptedIOException e) {
          // nochmal versuchen
        }
      }
    } catch (IOException e) {
      System.err.println("OutputThread: " + e.toString());
    }
  }
}
