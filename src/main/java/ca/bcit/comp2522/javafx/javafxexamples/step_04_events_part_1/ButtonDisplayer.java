package ca.bcit.comp2522.javafx.javafxexamples.step_04_events_part_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ButtonDisplayer.
 *
 * @author BCIT
 * @version 2020
 */
public class ButtonDisplayer {

    /**
     * Constructs an object of type ButtonDisplayer.
     */
    public ButtonDisplayer() {
        JFrame frame = new JFrame("ButtonDisplayer");
        JPanel panel = new JPanel();
        JButton button = new JButton("Press me!");
        ButtonListener listener = new ButtonListener();
        button.addActionListener(listener); // THIS LINE HERE
        panel.add(button);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * ButtonListener implements ActionListener interface and
     * responds when a Button is pressed.
     *
     * @author BCIT
     * @version 2017
     */
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Stop that");
        }
    }
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        ButtonDisplayer program = new ButtonDisplayer();
    }
}
