package enums;

public enum ZiSaptamana {
    LUNI(1),
    MARTI(2),
    MIERCURI(3),
    JOI(4),
    VINERI(5),
    SAMBATA(6),
    DUMINICA(7);

    public final int nrZi;

    private ZiSaptamana(int nrZi) {
        this.nrZi = nrZi;
    }


}
