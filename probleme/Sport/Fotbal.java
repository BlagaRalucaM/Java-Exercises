package probleme.Sport;

public class Fotbal extends Sport {

    public Fotbal(String echipa) {
        super(echipa);
    }

    @Override
    public int getNrJucatori() {
        return 11;
    }

    @Override
    public int getDurataInMinute() {
        return 90;
    }
}
