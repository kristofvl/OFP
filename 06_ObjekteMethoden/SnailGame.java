/** Anfang eines Spiels in AWT, als Beispiel für Objekte und Methoden
    */

import java.awt.*;  // Abstract Window Toolkit
import javax.swing.*;  // Swing Toolkit for JPanel
import java.awt.event.*;  // keylistener events

class SnailGame extends JPanel implements KeyListener {

  private Snail player;
  private Snail[] enemy;
  private boolean bang = false;

  public SnailGame() {
    // Erstellen Sie den Player und die Enemies hier:
    player = new Snail( (short)7, 400, 400 );
    enemy = new Snail[4]; // to do
    enemy[0] = new Snail( (short)5, 200, 200 );
  }

  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
       case KeyEvent.VK_LEFT:
            // Verwenden Sie die Methoden getPosX, getPosY und moveHead() des Players
            player.moveHead( player.getPosX((short)0)-20 , player.getPosY((short)0) );
            break;
       case KeyEvent.VK_RIGHT:
            // Verwenden Sie die Methoden getPosX, getPosY und moveHead() des Players
            player.moveHead( player.getPosX((short)0)+20 , player.getPosY((short)0) );
            break;
       case KeyEvent.VK_DOWN:
            // Verwenden Sie die Methoden getPosX, getPosY und moveHead() des Players
            player.moveHead( player.getPosX((short)0) , player.getPosY((short)0)+20 );
            break;
       case KeyEvent.VK_UP:
            // Verwenden Sie die Methoden getPosX, getPosY und moveHead() des Players
            player.moveHead( player.getPosX((short)0) , player.getPosY((short)0)-20 );
            break;
    }
    repaint();  // execute paintComponent
  }
  public void keyReleased(KeyEvent e) {}
  public void keyTyped(KeyEvent e) {}

  public void paintComponent( Graphics g ) {
    super.paintComponent(g);
    g.setColor( Color.RED );
    // Zeichne hier jedes Segment der Schnecke als Rechteck
    // mit g.fillRect( X Position, Y Position, Breite, Höhe)
    for (int i = 0; i < player.getLength(); i++) {
      g.fillRect( player.getPosX((short)i), player.getPosY((short)i), 20, 20 );
    }
  }

  public static void main(String[] a) {
    SnailGame game = new SnailGame();
    game.setFocusable(true);
    game.addKeyListener(game);
    JFrame frame = new JFrame("Game on!");
    frame.setSize(1200, 800);
    frame.getContentPane().add(game);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class Snail {
  public Snail(short len) {
    this.len = len;
    xPos = new int[this.len];
    yPos = new int[this.len];
  }
  public Snail(short len, int x, int y) {
    this(len);
    for (int i = 0; i < len; i++) {
      xPos[i] = x; yPos[i] = y;
    }
  }

  public int getPosX(short i) { return xPos[i]; }
  public int getPosY(short i) { return yPos[i]; }
  public short getLength() { return len; }

  public void moveHead(int x, int y) {
    moveBody();
    xPos[0] = x;
    yPos[0] = y;
  }
  public void moveBody() {
    for (int i = len-1; i > 0; i--) {
      xPos[i] = xPos[i-1]; yPos[i] = yPos[i-1];
    }
  }

  boolean isOverlapped( Snail s ) {
    return false;
  }

  private int[] xPos;  // snail's
  private int[] yPos;  // position of rectangles
  private short len;   // length of snail
}
