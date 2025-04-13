
import javax.swing.text.AbstractDocument;

public class Main {
    public static void main(String[] args) {
        Clock relogio = new BRLClock();
        relogio.setSecond(0);
        relogio.setMinute(0);
        relogio.setHour(25);

        System.out.println(brlClock.getTime());

        System.out.println(new USClock().convert(brlClock).getTime());
    }
}
