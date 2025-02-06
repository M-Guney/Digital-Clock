package DigitalClock;

import java.time.LocalTime;

public class DigitalClock {

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
