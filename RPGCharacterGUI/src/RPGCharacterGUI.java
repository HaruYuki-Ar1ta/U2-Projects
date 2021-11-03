import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacterGUI {
    /*
    4 label, 4 inputs and a button to click which calculates and displays
    the battle stats.
     */

    JFrame window = new JFrame("Character Sheet");
    JPanel panel = new JPanel();
    JButton submitScores = new JButton("Submit");

    JLabel strengthLabel =  new JLabel("Strength");
    JTextArea strengthInput = new JTextArea("Enter Strength Score Here");

    JLabel dexLabel = new JLabel("Dexterity");
    JTextArea dexInput = new JTextArea("Enter Dexterity Here");

    JLabel intLabel = new JLabel("Intelligence");
    JTextArea intInput = new JTextArea("Enter Intelligence Here");

    JLabel conLabel = new JLabel("Constitution");
    JTextArea conInput = new JTextArea("Enter Constitution Here");

    public RPGCharacterGUI() {
        window.setSize(500, 250);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setBackground(Color.black);


        submitScores.addActionListener(new scoreSubmission());

        panel.add(strengthLabel);
        panel.add(strengthInput);
        panel.add(dexLabel);
        panel.add(dexInput);
        window.add(panel);

        window.setVisible(true);
    }
        private class scoreSubmission implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent){
                int strengthVal = Integer.parseInt(strengthInput.getText());
                int dexterityVal = Integer.parseInt(dexInput.getText());
            }

        }

    }






