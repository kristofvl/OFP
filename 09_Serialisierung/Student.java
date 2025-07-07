/**
 * Die Klasse 'Student' repräsentiert einen Studierenden mit Namen, Vornamen,
 * Matrikelnummer und Note. Sie bietet Methoden zum Einlesen von Studentendaten
 * aus einem Eingabestrom (z.B. Datei oder Konsole) sowie zum Schreiben dieser
 * Daten in einen Ausgabestrom.
 *
 * Funktionen im Überblick:
 * - Konstruktor für die manuelle Initialisierung eines Studentenobjekts
 * - Konstruktor zum Einlesen der Daten aus einer Textzeile mit CSV-Format:
 *   "Name,Vorname,MatrNr,Note"
 * - Fehlerbehandlung bei unvollständigen oder fehlerhaften Eingaben
 * - Ausgabe der Studentendaten im CSV-Format über PrintWriter
 *
 * In main wird ein Student erzeugt, die Daten werden auf die Konsole und in
 * eine Datei ('out.txt') geschrieben. Diese Datei wird ausgelesen und ein
 * Objekt mit CSV-Format via System.in eingelesen.
 */

import java.io.*;

class Student {
	protected String name, vorname;
	protected int matrNr;
	protected double note;

	public Student(String name, String vorname, int matrNr) {
    this.name=name;  this.vorname = vorname;  this.matrNr = matrNr;
   }

	public Student(BufferedReader reader) throws IOException {
		try {
			String line = reader.readLine();
			String[] fields = line.split(",");
			name = fields[0];
			vorname = fields[1];
			matrNr = Integer.parseInt(fields[2]);
			note = Double.parseDouble(fields[3]);
		}
		catch (NullPointerException e) {
			throw new IOException("Unerwartetes Dateiende");
		}
		catch (NumberFormatException e) {
			throw new IOException("Falsches Elementformat");
		}
		catch (IndexOutOfBoundsException e) {
			throw new IOException("Zu wenig Datenelemente");
		}
	}

	public void writeToStream(PrintWriter pw) {
		pw.println(name + "," + vorname + "," + matrNr + "," + note);
		pw.flush();
	}

	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			Student s = new Student("Hugo", "Test", 12345678);
			s.writeToStream(new PrintWriter(System.out));
			pw = new PrintWriter( new FileWriter("out.txt") );
			s.writeToStream(pw);
		}
		catch (FileNotFoundException e) {/*...*/}
		catch (IOException e) {/*...*/}
		finally {
			if (pw != null) pw.close();   // Keine IOException
		}
		BufferedReader reader = null;
		try {
        reader = new BufferedReader( new FileReader("out.txt") );
        Student s1 = new Student(reader);
        System.out.println("Name,Vorname,matrNr,Note:");
        Student s3 = new Student(new BufferedReader(
                                    new InputStreamReader(System.in) ) );
        System.out.println(s1);
        System.out.println(s3);
      }
      catch (FileNotFoundException e) {/*...*/}
      catch (IOException e) {/*...*/}
      finally {
        try { reader.close(); } catch (Exception e) {/*...*/}
      }
	}
}
