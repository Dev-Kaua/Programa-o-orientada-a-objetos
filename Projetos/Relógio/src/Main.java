
public class Main {

    public static void main(String[] args) {
        Clock relogio = new BRLClock();
        relogio.setSecond(00);
        relogio.setMinute(00);
        relogio.setHour(22);

        System.out.println(relogio.getTime());

        System.out.println(new USClock().convert(relogio).getTime());
    }
}
