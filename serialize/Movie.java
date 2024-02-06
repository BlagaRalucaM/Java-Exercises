package serialize;

import java.io.Serializable;

public class Movie implements Serializable {
    private String nume;
    private String tip;
    protected int an;

    public Movie(String nume, String tip, int an) {
        this.nume = nume;
        this.tip = tip;
        this.an = an;
    }

    public Movie() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }
}
