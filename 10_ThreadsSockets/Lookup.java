import java.net.*;
public class Lookup {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java Lookup <host>");
      System.exit(1);
    }
    try {  // Get requested address
      InetAddress addr = InetAddress.getByName(args[0]);
      System.out.println(addr.getHostName());
      System.out.println(addr.getHostAddress());
    } 
    catch (UnknownHostException e) {
      System.err.println(e.toString());
      System.exit(1);
    } 
  }
}
