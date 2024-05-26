import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;



public class drawSpaceShip extends JPanel{

    int x = 0;
    int y = 0;

    private Image spaceShip;

    drawSpaceShip(){
        super();
        // spaceShip = ImageIO.read(new File("/assets/ship2.png"));
        try{
            spaceShip = ImageIO.read(new File("./assets/ship2.png"));
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public void moveLeft(){
        x = x-10;
        repaint();
    }

    public void moveRight(){
        x = x+10;
        repaint();
    }

    public void moveUp(){
        y = y-10;
        repaint();
    }

    public void moveDown(){
        y = y+10;
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(spaceShip, x, y, 100, 100, this);
        // g.setColor(Color.BLACK);
        // g.fillRect(x, y, 100, 100);
    }
}
