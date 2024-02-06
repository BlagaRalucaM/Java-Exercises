package streams.exercitii;

public class Locuinta {
    private String adresa;
    private int suprafata;
    private int anConstructie;

    public Locuinta(String adresa, int suprafata, int anConstructie) {
        this.adresa = adresa;
        this.suprafata = suprafata;
        this.anConstructie = anConstructie;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public int getAnConstructie() {
        return anConstructie;
    }

    public void setAnConstructie(int anConstructie) {
        this.anConstructie = anConstructie;
    }

    @Override
    public String toString() {
        return "Locuinta{" +
                "adresa='" + adresa + '\'' +
                ", suprafata=" + suprafata +
                ", anConstructie=" + anConstructie +
                '}';
    }
}
