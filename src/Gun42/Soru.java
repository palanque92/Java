package Gun42;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;


public class Soru {
    // Dijotal saat yapimi internetten buldum
    static void display() {
        // create window for clock
        JFrame clockFrame = new JFrame("Digital Clock");
        clockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create label to print time
        JLabel timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setPreferredSize(new Dimension(400, 100));
        timeLabel.setFont(new Font("Calibri", Font.BOLD, 50));
        clockFrame.getContentPane().add(timeLabel,BorderLayout.CENTER);

        // Display the window
        clockFrame.setLocationRelativeTo(null);
        clockFrame.pack();
        clockFrame.setVisible(true);

        int delay = 100;
        Timer timer = new Timer(delay, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                String formattedDateTime = now.format(formatter);
                timeLabel.setText(formattedDateTime);
            }
        });

        timer.start();
    }

    public static void main(String args[]) {
        display();
    }
}
