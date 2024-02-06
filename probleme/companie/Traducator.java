package probleme.companie;

public class Traducator extends Om {
    private int nrPaginiTraduse;
    private int baniPerPagina;
    private int nrZileLucrate;

    public Traducator(int nrPaginiTraduse, int baniPerPagina, int nrZileLucrate) {
        this.nrPaginiTraduse = nrPaginiTraduse;
        this.baniPerPagina = baniPerPagina;
        this.nrZileLucrate = nrZileLucrate;
    }

    public int getNrPaginiTraduse() {
        return nrPaginiTraduse;
    }

    public void setNrPaginiTraduse(int nrPaginiTraduse) {
        this.nrPaginiTraduse = nrPaginiTraduse;
    }

    public int getBaniPerPagina() {
        return baniPerPagina;
    }

    public void setBaniPerPagina(int baniPerPagina) {
        this.baniPerPagina = baniPerPagina;
    }

    public int getNrZileLucrate() {
        return nrZileLucrate;
    }

    public void setNrZileLucrate(int nrZileLucrate) {
        this.nrZileLucrate = nrZileLucrate;
    }

    @Override
    public double calculeazaSalariul() {
        return nrPaginiTraduse * baniPerPagina * nrZileLucrate;
    }
}
