package enums;

public enum ElementChimic {
    H("Hidrogen", 1),
    HE("Helium", 2),
    NA("Sodiu", 14),
    NE("Neon", 4);

    public final String nume;
    public final int nrAtomic;

    ElementChimic(String nume, int nrAtomic) {
        this.nume = nume;
        this.nrAtomic = nrAtomic;
    }
}
