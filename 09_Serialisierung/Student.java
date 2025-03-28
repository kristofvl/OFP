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
	}
}
