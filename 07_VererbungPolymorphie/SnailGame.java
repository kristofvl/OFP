/** Version 2 eines Spiels in AWT, als Beispiel für Objekte und Methoden
    */

import java.awt.*;  // Abstract Window Toolkit
import javax.swing.*;  // Swing Toolkit for JPanel
import java.awt.event.*;  // keylistener events
import java.util.Random;  // random number generator

class SnailGame extends JPanel implements KeyListener {

  private Snail player;
  private Snail[] enemy;
  private boolean bang = false;

  public SnailGame() {
    // Erstellen Sie den Player und die Enemies hier:
    player = new Snail( (short)7, 400, 400 );
    enemy = new Snail[4];
    for (int i=0; i < enemy.length; i++)
      enemy[i] = new Snail( (short)5, ((i%2)==0)?200:600, (i<2)?200:600 );
  }

  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
       case KeyEvent.VK_LEFT:
            player.moveHead( (short)-20 , (short)0 );
            break;
       case KeyEvent.VK_RIGHT:
            player.moveHead( (short)20 , (short)0 );
            break;
       case KeyEvent.VK_DOWN:
            player.moveHead( (short)0 , (short)20 );
            break;
       case KeyEvent.VK_UP:
            player.moveHead( (short)0 , (short)-20 );
            break;
    }
    // move enemy toward player:
    Random rand = new Random();
    bang = false;
    for (int i = 0; i < enemy.length; i++) {
        if ( rand.nextInt(100) < 40 ) {
          if (player.getPosX((short)0) < enemy[i].getPosX((short)0) ) {
            enemy[i].moveHead( (short)-20, (short)0);
          } else {
            enemy[i].moveHead( (short)20, (short)0);
          }
        }
        if ( rand.nextInt(100) < 40 ) {
          if (player.getPosY((short)0) < enemy[i].getPosY((short)0) ) {
            enemy[i].moveHead( (short)0, (short)-20);
          } else {
            enemy[i].moveHead( (short)0, (short)20);
          }
        }
        bang = bang | player.isOverlapped( enemy[i] );
    }
    repaint();  // execute paintComponent
  }
  public void keyReleased(KeyEvent e) {}
  public void keyTyped(KeyEvent e) {}

  public void paintComponent( Graphics g ) {
    super.paintComponent(g);
    g.setColor( Color.BLUE );
    // Zeichne hier jedes Segment der Schnecke als Rechteck
    for (int i = 0; i < player.getLength(); i++) {
      g.fillRect( player.getPosX((short)i), player.getPosY((short)i), 20, 20 );
    }
    g.setColor( Color.RED );
    for (int i = 0; i < enemy.length; i++) {
      for (int j = 0; j < enemy[i].getLength(); j++) {
        g.fillRect( enemy[i].getPosX((short)j), enemy[i].getPosY((short)j), 20, 20 );
      }
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
    xPos[0] += x;
    yPos[0] += y;
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
