import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;



public class drawSpaceShip extends JPanel{

    int x = 0;
    int y = 0;

    public void moveLeft(){
        x = x-10;
        repaint();
    }

    public void moveRight(){
        x = x+10;
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 100, 100);
    }
}
