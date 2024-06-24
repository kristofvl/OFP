import java.util.Random;

class Verteilung {
  protected int yLen = 24;
  protected int xLen = 80;
  protected int runs = 120;
  protected boolean[][] display = null;
  protected Random r;

  public Verteilung(int height, int width, int runs) {
   r = new Random();
   yLen = height; xLen = width; this.runs = runs;
   display = new boolean[xLen][yLen];
   for (int x = 0; x < xLen; x++)
     for (int y = 0; y < yLen; y++)
       display[x][y] = false;
  }

  public void print() {
   for (int y = 0; y < yLen; y++) {
     System.out.print("|");
     for (int x = 0; x < xLen; x++)
         System.out.print( (display[x][y] == true)?"\u2589":" ");
     System.out.println("|");
   }
  }
  public static void main(String[] args) {
    Verteilung v;
    if ( (args.length > 0) && (args[0].equals("u")) ) {
      v = new Uniform(24, 100, 240);
    } else {
      v = new Gauss(24, 100, 240); 
    }
    v.print();
  }
}

class Uniform extends Verteilung {
  public Uniform(int height, int width, int runs) {
    super(height, width, runs);
    for (int i = 0; i < runs; i++ ) {
      int c = r.nextInt(height);
      int j = 0;
      while (display[j][c]) { j++; }
      display[j][c] = true;
    }
  }
}

class Gauss extends Verteilung {
  public Gauss(int height, int width, int runs) {
    super(height, width, runs);
    for (int i = 0; i < runs; i++ ) {
      int c = (int)( yLen/2 + r.nextGaussian() );
      int j = 0;
      while (display[j][c]) { j++; }
      display[j][c] = true;
    }
  }
}
