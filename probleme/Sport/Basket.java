package probleme.Sport;

public class Basket extends Sport {

    public Basket(String echipa) {
        super(echipa);
    }

    @Override
    int getNrJucatori() {
        return 5;
    }

    @Override
    int getDurataInMinute() {
        return 40;
    }
}
