import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MainClass extends JFrame{

    MainClass(){

        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        JPanel controls = new JPanel();
        controls.add(leftButton);
        controls.add(rightButton);

        drawSpaceShip ship = new drawSpaceShip();
        ship.setPreferredSize(new Dimension(500, 500));


        add(ship);
        // leftButton.setBounds(100, 400, 100, 50);
        // rightButton.setBounds(300, 400, 100, 50);
        add(controls, BorderLayout.SOUTH);

        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ship.moveLeft();
            }
        });

        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ship.moveRight();
            }
        });

        setSize(500, 500);
        setVisible(true);

    }
    public static void main(String[] args) {
        new MainClass();
    }
}