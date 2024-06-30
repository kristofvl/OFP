import java.io.*;
public class Count {
  // IOException wird nicht gefangen, dies muß deklariert werden:
  public static void main(String[] args) throws IOException {
    int count = 0;
    // Zeichen einlesen mit System.in.read(), bis Stromende (Strg-D):
    
    String msg = "  Eingabe hatte " + count + " Bytes\n";
    // Nur zur Demonstration. Ausgabe als Bytearray via write():
    System.out.write(msg.getBytes());
  }
}
