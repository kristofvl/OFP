
class Karte {
  private String farbe;
  protected short nummer;
  private static int anzahl;
}

class Stapel {
  private Karte[] karten;
  private boolean istLeer;
  public Stapel() {
    karten = new Karte[108];
  }
}

class Spieler {
  private String name;
  private Hand hand;
  public String getName() { return name; }
  private boolean gewonnen;
}

