package probleme.Sport;

public class Handbal extends Sport {

    public Handbal(String echipa) {
        super(echipa);
    }

    @Override
    int getNrJucatori() {
        return 6;
    }

    @Override
    int getDurataInMinute() {
        return 45;
    }
}
