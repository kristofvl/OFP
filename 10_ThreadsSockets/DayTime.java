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
      while ((len = in.read(b)) != -1) {
        System.out.write(b, 0, len);
      }
      in.close();
      sock.close();
    } catch (IOException e) { System.err.println(e.toString()); }
  }
}
