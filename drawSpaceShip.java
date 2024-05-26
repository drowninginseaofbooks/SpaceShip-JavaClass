
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;



public class drawSpaceShip extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 250, 250);
    }
}
