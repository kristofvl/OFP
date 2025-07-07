/**
 * Beispielprogramm: DNS-Hostnamen- und IP-Auflösung.
 *
 * Dieses Programm verwendet die Klasse `InetAddress`, um für einen
 * angegebenen Hostnamen (z. B. "example.com" oder "localhost")
 * die zugehörige IP-Adresse zu ermitteln. Gleichzeitig wird auch
 * der offizielle Name des Hosts zurückgegeben.
 *
 * Es demonstriert die einfache Nutzung von DNS-Lookups in Java
 * mit Hilfe der Methode `InetAddress.getByName(String host)`.
 *
 * Beispielaufruf:
 *   java Lookup www.example.com
 *
 * Hinweis: Die IP-Adresse kann auch für lokale Adressen oder
 * numerische Eingaben wie „127.0.0.1“ verwendet werden.
 */

import java.net.*;
public class Lookup {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Verwendung: java Lookup <host>");
      System.exit(1);
    }
    try {  // Ermittle die IP-Adresse:
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
