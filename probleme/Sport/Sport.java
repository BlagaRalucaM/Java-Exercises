package probleme.Sport;

public abstract class Sport {
    protected String echipa;

    public Sport(String echipa) {
        System.out.println("Construim un tip de sport | parinte");
        this.echipa = echipa;
    }

    abstract int getNrJucatori();

    abstract int getDurataInMinute();
}
