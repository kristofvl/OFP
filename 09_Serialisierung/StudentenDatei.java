/**
 * Dieses Programm demonstriert die Serialisierung und Deserialisierung von Objekten
 * in Java mit Hilfe der Klassen `ObjectOutputStream` und `ObjectInputStream`.
 * Ein `Student`-Objekt wird erstellt und in eine Datei (`out.ser`) serialisiert.
 * Danach wird die Note des Studenten geändert, und das Objekt erneut serialisiert.
 * Ohne `reset()` würde beim zweiten Schreiben nur eine Referenz auf das bereits
 * gespeicherte Objekt geschrieben – keine neuen Daten.
 * Die gespeicherten Objekte werden anschließend aus der Datei gelesen und auf der
 * Konsole ausgegeben.
 */

import java.io.*;

// StudentenDatei enthält die main-Methode zum Testen der Serialisierung
class StudentenDatei {
  public static void main(String[] args) {
    ObjectOutputStream oos = null;
    try {
      Student s = new Student("Hugo", "Test", 12345678);
      oos = new ObjectOutputStream( new FileOutputStream("out.ser") );
      oos.writeObject(s);  // Schreibe Objekt s
      s.setNote(3.7);
      oos.reset();   // sonst wird nur eine weitere Referenz geschrieben
      oos.writeObject(s);  // Schreibe Objekt s nochmal
      oos.close();
    }
    catch ( IOException e ) { System.out.println(e.getMessage()); }
    finally { /*...*/  }
    ObjectInputStream ois = null;
    try {
      ois = new ObjectInputStream( new FileInputStream("out.ser") );
      // Objekte von Datei einlesen und Typ umwandeln
      Student s1 = (Student) ois.readObject();
      Student s2 = (Student) ois.readObject();
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s1 == s2);  // Was wird hier ausgegeben?
      ois.close();
    }
    catch ( IOException e) { /*...*/ }
    catch ( ClassNotFoundException e ) { /*...*/ }
    finally { /*...*/  }
  }
}

// Name ist ein einfacher Container für Vor- und Nachnamen, serialisierbar:
class Name implements Serializable {
  String name;
  String vorname;
  public Name(String n, String vn) { name = n; vorname = vn; }
}

// Student speichert Name (als separates Objekt), Matrikelnummer und Note:
class Student implements Serializable {
  Name name;
  int matrNr;
  double note;
  public Student(String n, String vn, int mn) {
    name = new Name(n, vn); matrNr = mn;
  }
  public void setNote(double note) { this.note = note; }
}

