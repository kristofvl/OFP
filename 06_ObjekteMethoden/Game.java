/** Anfang eines Spiels in AWT, als Beispiel für Objekte und Methoden
    */

import java.awt.*;  // Abstract Window Toolkit
import javax.swing.*;  // Swing Toolkit for JPanel
import java.awt.event.*;  // keylistener events

class Game extends JPanel implements KeyListener {

  int xPos;
  int yPos;  // position of rectangle

  public Game() {
   xPos = yPos = 400;
  }

  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
       case KeyEvent.VK_LEFT:  xPos -= 20;
            break;
       case KeyEvent.VK_RIGHT: xPos += 20;
            break;
       case KeyEvent.VK_DOWN:  yPos += 20;
            break;
       case KeyEvent.VK_UP:    yPos -= 20;
            break;
    }
    repaint();  // execute paintComponent
  }
  public void keyReleased(KeyEvent e) {}
  public void keyTyped(KeyEvent e) {}

  public void paintComponent( Graphics g ) {
    super.paintComponent(g);
    g.setColor( Color.RED );    // draw a red rectangle
    g.fillRect(xPos, yPos, 20, 20);  //  position x, y, width, height
  }

  public static void main(String[] a) {
    Game game = new Game();
    game.setFocusable(true);
    game.addKeyListener(game);
    JFrame frame = new JFrame("Game on!");
    frame.setSize(1200, 800);
    frame.getContentPane().add(game);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
