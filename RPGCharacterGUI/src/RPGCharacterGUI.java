import javax.swing.*;
import java.awt.*;

public class RPGCharacterGUI {
    /*
    4 label, 4 inputs and a button to click which calculates and displays
    the battle stats.
     */

    JFrame window = new JFrame("Character Sheet");
    JPanel panel = new JPanel();
    JButton button1 = new JButton(" button");
    JButton button2 = new JButton(" button");
    JButton button3 = new JButton(" button");
    JButton button4 = new JButton(" button");
    JLabel label1 =  new JLabel("Strength");
    JTextArea field1 = new JTextArea();

    public RPGCharacterGUI() {
        window.setSize(500, 250);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setBackground(Color.black);

        panel.add(field1);
        panel.add(label1);
        panel.add(button1);
        window.add(panel);

        window.setVisible(true);
    }


    }






