\/** Beispiel Klasse Student als Unterklasse von Object (Alle Klassen erben
    von Object, auch ohne extends). Methode toString() ermöglicht
    menschenlesbare Darstellung. Methode equals() vergleicht Inhalte,
    nicht Referenzen.
    */

class Student {
  private String name;
  private long matrnr;
  public Student(String name, long matrnr) {
    this.name = name;
    this.matrnr = matrnr;
  }
  // überschreibe toString() von Object:
  public String toString() {
    return "Student{name='" + name + "', matr.nr.=" + matrnr + "}";
  }
  // equals() überschreiben, um Vergleich nach Inhalt zu ermöglichen
  public boolean equals(Object obj) {
    // Schreibe hier anweisungen, so dass s1.equals(s2) unten in main() true ausgibt
    return super.equals(obj);  // wieso funktioniert dies nicht?
  }
}

class Studenten {
  public static void main(String[] args) {
    Student s1 = new Student("Lena", 1234567);
    Student s2 = new Student("Lena", 1234567);
    Student s3 = new Student("Max",   678901);
    // Automatisch mit toString()
    System.out.println(s1); // → Student{name='Lena', matr.nr.=12345}
    // Vergleich mit equals()
    System.out.println("s1.equals(s2)? " + s1.equals(s2)); // true
    System.out.println("s1.equals(s3)? " + s1.equals(s3)); // false
    // Vergleich mit == (Referenzvergleich)
    System.out.println("s1 == s2? " + (s1 == s2)); // false, da unterschiedliche Objekte
  }
}
