import java.awt.BorderLayout;
import javax.swing.*;

class MainClass extends JFrame{

    MainClass(){

        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        JPanel controls = new JPanel();
        controls.add(leftButton);
        controls.add(rightButton);

        drawSpaceShip ship = new drawSpaceShip();
        add(ship);
        // leftButton.setBounds(100, 400, 100, 50);
        // rightButton.setBounds(300, 400, 100, 50);
        add(controls, BorderLayout.SOUTH);

        setSize(500, 500);
        setVisible(true);

    }
    public static void main(String[] args) {
        new MainClass();
    }
}