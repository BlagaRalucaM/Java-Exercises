package probleme.companie;

public class Angajat extends Om {

    private int nrOreLucrate;

    private int nrZileLucrate;

    private int baniPerOra;

    public Angajat(int nrOreLucrate, int nrZileLucrate, int baniPerOra) {
        this.nrOreLucrate = nrOreLucrate;
        this.nrZileLucrate = nrZileLucrate;
        this.baniPerOra = baniPerOra;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = nrOreLucrate;
    }

    public int getNrZileLucrate() {
        return nrZileLucrate;
    }

    public void setNrZileLucrate(int nrZileLucrate) {
        this.nrZileLucrate = nrZileLucrate;
    }

    public int getBaniPerOra() {
        return baniPerOra;
    }

    public void setBaniPerOra(int baniPerOra) {
        this.baniPerOra = baniPerOra;
    }

    @Override
    public double calculeazaSalariul() {
        return 0;
    }
}
