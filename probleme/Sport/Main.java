package probleme.Sport;

public class Main {

    public static void main(String[] args) {
        Fotbal f1 = new Fotbal("Barcelona");
        Fotbal f2 = new Fotbal("Valencia");

        Sport b = new Basket("T1");

        Handbal h1 = new Handbal("Oltchim");
        Handbal h2 = new Handbal("CSM Bucuresti");

        Meci meci1 = new Meci(f1, f2);
        Meci meci2 = new Meci(h1, h2);

        System.out.println("Nr de jucatori pentru meci1 " +
                (meci1.getS1().getNrJucatori() + meci1.getS2().getNrJucatori()));

        System.out.println("Nr de jucatori pentru meci2 " +
                (meci2.getS1().getNrJucatori() + meci2.getS2().getNrJucatori()));

    }
}
