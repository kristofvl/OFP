class Klausur10 {
  public static void main(String[] s) {
    // Schreibe unten Anweisungen, damit die Konsolenausgabe dieses
    // Programms wie folgt aussieht: "Cheerio,Hi,Gutentag,".


    for (int i = gruesse.length-1; i>=0; i--) {
      System.out.print( gruesse[i].gruss()+"," );
    }
    System.out.println();
  }
}

class Gruss {
  public String gruss() { return new String("Hi"); }
}
class EnglischGruss extends Gruss {
  public String gruss() { return new String("Cheerio"); }
}
class DeutschGruss extends Gruss {
  public String gruss() { return new String("Gutentag"); }
}
