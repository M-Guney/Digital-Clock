package DigitalClock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Clock extends JFrame{
    private JPanel panel;
    private JTextArea textArea1;
    private JLabel darkLabel;
    Timer timer = new Timer();

    String modePath;
    Clock(){
        add(panel);
        setTitle("Guney's Clock");
        setSize(490,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea1.setForeground(new Color(0,128,0));
        modePath = "src\\nightmode.png";
        darkLabel.setIcon(new ImageIcon(modePath));


        TimerTask timertask = new TimerTask(){
            @Override
            public void run() {
                updateClock();
            }
        };
        darkLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(modePath.equals("src\\daymode.png")) {
                    modePath = "src\\nightmode.png";
                    darkLabel.setIcon(new ImageIcon(modePath));
                    textArea1.setForeground(Color.BLACK);
                    panel.setBackground(Color.WHITE);
                    System.out.println("Night mode: ON");

                }
                else if (modePath.equals("src\\nightmode.png")){
                    modePath="src\\daymode.png";
                    textArea1.setForeground(new Color(0,128,0));
                    panel.setBackground(new Color(60,60,60));
                    darkLabel.setIcon(new ImageIcon(modePath));
                    System.out.println("Day mode: ON");
                }
            }
        });
        timer.schedule(timertask,0,1000);
    }

    private void updateClock() {
        String currentTime = Digital_Clock.Digitalize();
        textArea1.setText(currentTime);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Clock f = new Clock();
                f.setVisible(true);
            }
        });
    }
}
