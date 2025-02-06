package DigitalClock;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
// *  Sayıların arasına nokta eklemeyi başardım

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
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    // ANLAMADIM ama nedense bu şekildeyken program geç kapanıyor
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
            public void mouseReleased(MouseEvent e) {
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
                // ANLAMADIM NEDEN İSE İLK TIKLAMAYI ALGILAMIYOR
                // release yerine clicked denedim olmadı
                // ve nedense program kapan dedikten biraz sonra tam olarak kapanıyo sanırsam nedeni Thread in ram de tutmasından kaynaklı
            }
        });
        timer.schedule(timertask,0,1000);
    }

    private void updateClock() {
        String currentTime = DigitalClockk.Digitalize();
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
// *  Sayıların arasına nokta eklemeyi başardım
class DigitalClockk {

    public static String Digitalize() {
        String h = String.valueOf(LocalTime.now().getHour());
        if (Integer.valueOf(h) < 10) h = 0 + h;
        String m = String.valueOf(LocalTime.now().getMinute());
        if (Integer.valueOf(m) < 10) m = 0 + m;
        String s = String.valueOf(LocalTime.now().getSecond());
        if (Integer.valueOf(s) < 10) s = 0 + s;
        String clock = h +"." + m +"." + s;

        System.out.println(clock);
        String x = "", y = x, z = x;
        for (int c : clock.getBytes()) {
            if (c==46) {
                x+=" ";
                y+=".";
                z += ".";
                continue;
            }
            c -= 48;                              //'0' karakterinin ASCII değeri: 48     '1': 49     '2': 50
            x += c == 4 | c == 1 ?                    // Üst kısmında _ var mı
                    "   " : " _ ";                        //1 or 4 = "   " else " _ "
            y += (c == 1 | c == 2 | c == 3 | c == 7 ?
                    " " : "|")                      //1 or 2 or 3 or 7 = " " else "|"
                    +
                    (c == 1 | c == 7 | c == 0 ?
                            " " : "_")
                    +
                    (c == 5 | c == 6 ?
                            " " : "|");
            z += (c == 1 | c == 3 | c == 4 | c == 7 | c == 5 | c == 9 ?
                    " " : "|")
                    +
                    (c == 1 | c == 4 | c == 7 ?
                            " " : "_")
                    +
                    (c == 2 ?
                            " " : "|");
        }
        return (x + "\n" + y + "\n" + z);

    }

    public static void main(String[] args) {

        String h = String.valueOf(LocalTime.now().getHour());
        String m = String.valueOf(LocalTime.now().getMinute());
        System.out.println(Digitalize());
        String sonuc = Digitalize();
    }

}

package DigitalClock;

import javax.swing.*;
        import java.awt.*;
        import java.time.LocalTime;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
// *  Sayıların arasına nokta eklemeyi başardım

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
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    // ANLAMADIM ama nedense bu şekildeyken program geç kapanıyor
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
            public void mouseReleased(MouseEvent e) {
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
                // ANLAMADIM NEDEN İSE İLK TIKLAMAYI ALGILAMIYOR
                // release yerine clicked denedim olmadı
                // ve nedense program kapan dedikten biraz sonra tam olarak kapanıyo sanırsam nedeni Thread in ram de tutmasından kaynaklı
            }
        });
        timer.schedule(timertask,0,1000);
    }

    private void updateClock() {
        String currentTime = DigitalClockk.Digitalize();
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
// *  Sayıların arasına nokta eklemeyi başardım
class DigitalClockk {

    public static String Digitalize() {
        String h = String.valueOf(LocalTime.now().getHour());
        if (Integer.valueOf(h) < 10) h = 0 + h;
        String m = String.valueOf(LocalTime.now().getMinute());
        if (Integer.valueOf(m) < 10) m = 0 + m;
        String s = String.valueOf(LocalTime.now().getSecond());
        if (Integer.valueOf(s) < 10) s = 0 + s;
        String clock = h +"." + m +"." + s;

        System.out.println(clock);
        String x = "", y = x, z = x;
        for (int c : clock.getBytes()) {
            if (c==46) {
                x+=" ";
                y+=".";
                z += ".";
                continue;
            }
            c -= 48;                              //'0' karakterinin ASCII değeri: 48     '1': 49     '2': 50
            x += c == 4 | c == 1 ?                    // Üst kısmında _ var mı
                    "   " : " _ ";                        //1 or 4 = "   " else " _ "
            y += (c == 1 | c == 2 | c == 3 | c == 7 ?
                    " " : "|")                      //1 or 2 or 3 or 7 = " " else "|"
                    +
                    (c == 1 | c == 7 | c == 0 ?
                            " " : "_")
                    +
                    (c == 5 | c == 6 ?
                            " " : "|");
            z += (c == 1 | c == 3 | c == 4 | c == 7 | c == 5 | c == 9 ?
                    " " : "|")
                    +
                    (c == 1 | c == 4 | c == 7 ?
                            " " : "_")
                    +
                    (c == 2 ?
                            " " : "|");
        }
        return (x + "\n" + y + "\n" + z);

    }

    public static void main(String[] args) {

        String h = String.valueOf(LocalTime.now().getHour());
        String m = String.valueOf(LocalTime.now().getMinute());
        System.out.println(Digitalize());
        String sonuc = Digitalize();
    }

}

package DigitalClock;

import javax.swing.*;
        import java.awt.*;
        import java.time.LocalTime;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
// *  Sayıların arasına nokta eklemeyi başardım

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
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    // ANLAMADIM ama nedense bu şekildeyken program geç kapanıyor
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
            public void mouseReleased(MouseEvent e) {
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
                // ANLAMADIM NEDEN İSE İLK TIKLAMAYI ALGILAMIYOR
                // release yerine clicked denedim olmadı
                // ve nedense program kapan dedikten biraz sonra tam olarak kapanıyo sanırsam nedeni Thread in ram de tutmasından kaynaklı
            }
        });
        timer.schedule(timertask,0,1000);
    }

    private void updateClock() {
        String currentTime = DigitalClockk.Digitalize();
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
// *  Sayıların arasına nokta eklemeyi başardım
class DigitalClockk {

    public static String Digitalize() {
        String h = String.valueOf(LocalTime.now().getHour());
        if (Integer.valueOf(h) < 10) h = 0 + h;
        String m = String.valueOf(LocalTime.now().getMinute());
        if (Integer.valueOf(m) < 10) m = 0 + m;
        String s = String.valueOf(LocalTime.now().getSecond());
        if (Integer.valueOf(s) < 10) s = 0 + s;
        String clock = h +"." + m +"." + s;

        System.out.println(clock);
        String x = "", y = x, z = x;
        for (int c : clock.getBytes()) {
            if (c==46) {
                x+=" ";
                y+=".";
                z += ".";
                continue;
            }
            c -= 48;                              //'0' karakterinin ASCII değeri: 48     '1': 49     '2': 50
            x += c == 4 | c == 1 ?                    // Üst kısmında _ var mı
                    "   " : " _ ";                        //1 or 4 = "   " else " _ "
            y += (c == 1 | c == 2 | c == 3 | c == 7 ?
                    " " : "|")                      //1 or 2 or 3 or 7 = " " else "|"
                    +
                    (c == 1 | c == 7 | c == 0 ?
                            " " : "_")
                    +
                    (c == 5 | c == 6 ?
                            " " : "|");
            z += (c == 1 | c == 3 | c == 4 | c == 7 | c == 5 | c == 9 ?
                    " " : "|")
                    +
                    (c == 1 | c == 4 | c == 7 ?
                            " " : "_")
                    +
                    (c == 2 ?
                            " " : "|");
        }
        return (x + "\n" + y + "\n" + z);

    }

    public static void main(String[] args) {

        String h = String.valueOf(LocalTime.now().getHour());
        String m = String.valueOf(LocalTime.now().getMinute());
        System.out.println(Digitalize());
        String sonuc = Digitalize();
    }

}

package DigitalClock;

import javax.swing.*;
        import java.awt.*;
        import java.time.LocalTime;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
// *  Sayıların arasına nokta eklemeyi başardım

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
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    // ANLAMADIM ama nedense bu şekildeyken program geç kapanıyor
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
            public void mouseReleased(MouseEvent e) {
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
                // ANLAMADIM NEDEN İSE İLK TIKLAMAYI ALGILAMIYOR
                // release yerine clicked denedim olmadı
                // ve nedense program kapan dedikten biraz sonra tam olarak kapanıyo sanırsam nedeni Thread in ram de tutmasından kaynaklı
            }
        });
        timer.schedule(timertask,0,1000);
    }

    private void updateClock() {
        String currentTime = DigitalClockk.Digitalize();
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
// *  Sayıların arasına nokta eklemeyi başardım
class DigitalClockk {

    public static String Digitalize() {
        String h = String.valueOf(LocalTime.now().getHour());
        if (Integer.valueOf(h) < 10) h = 0 + h;
        String m = String.valueOf(LocalTime.now().getMinute());
        if (Integer.valueOf(m) < 10) m = 0 + m;
        String s = String.valueOf(LocalTime.now().getSecond());
        if (Integer.valueOf(s) < 10) s = 0 + s;
        String clock = h +"." + m +"." + s;

        System.out.println(clock);
        String x = "", y = x, z = x;
        for (int c : clock.getBytes()) {
            if (c==46) {
                x+=" ";
                y+=".";
                z += ".";
                continue;
            }
            c -= 48;                              //'0' karakterinin ASCII değeri: 48     '1': 49     '2': 50
            x += c == 4 | c == 1 ?                    // Üst kısmında _ var mı
                    "   " : " _ ";                        //1 or 4 = "   " else " _ "
            y += (c == 1 | c == 2 | c == 3 | c == 7 ?
                    " " : "|")                      //1 or 2 or 3 or 7 = " " else "|"
                    +
                    (c == 1 | c == 7 | c == 0 ?
                            " " : "_")
                    +
                    (c == 5 | c == 6 ?
                            " " : "|");
            z += (c == 1 | c == 3 | c == 4 | c == 7 | c == 5 | c == 9 ?
                    " " : "|")
                    +
                    (c == 1 | c == 4 | c == 7 ?
                            " " : "_")
                    +
                    (c == 2 ?
                            " " : "|");
        }
        return (x + "\n" + y + "\n" + z);

    }

    public static void main(String[] args) {

        String h = String.valueOf(LocalTime.now().getHour());
        String m = String.valueOf(LocalTime.now().getMinute());
        System.out.println(Digitalize());
        String sonuc = Digitalize();
    }

}

