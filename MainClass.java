import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

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
                System.out.println("Left");
            }
        });

        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Right");
            }
        });

        setSize(500, 500);
        setVisible(true);

    }
    public static void main(String[] args) {
        new MainClass();
    }
}