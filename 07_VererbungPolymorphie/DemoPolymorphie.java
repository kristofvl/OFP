import java.util.Random;

class DemoPolymorphie {
  public static void main(String[] args) {
    Tier[] tiere = new Tier[3];
    tiere[0] = new Hund("Waldi", "Dackel");  // tiere[] enthaelt verweise
    tiere[1] = new Hund("Hasso", "Boxer");   // auf Objekte verschiedener
    tiere[2] = new Katze("Chanty");          // Klassen (Hund, Katze)
    Random rnd = new Random();
    for (int i=0; i<5; i++) {
      Tier t = tiere[rnd.nextInt(3)]; // t ist eine polymorphe Variable
      t.print();                      // print richtet sich nach dem
    }                                  // Objekt, auf das t verweist
  }
}

abstract class Tier {
  protected String gattung;
  public Tier(String gattung) { this.gattung = gattung; }
  public void print() {
    System.out.println("Tier der Gattung " +  gattung + ".");
  }
}

class Hund extends Tier {
  protected String name, rasse;
  public Hund(String aName, String aRasse) {
    super("Hund"); name = aName; rasse = aRasse; }
  public void print() {
    System.out.println("Ich bin " + name + ", der " + rasse + ".");
  }
}

class Katze extends Tier {
  protected String name;
  public Katze(String n) { super("Katze"); name = n; }
  public void print() {
    System.out.print("Ich bin " + name + ". "); super.print(); }
}
