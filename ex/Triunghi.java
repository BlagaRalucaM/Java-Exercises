package ex;

public class Triunghi implements SuprafataCalculabila {

    private double l;
    private double h;

    public Triunghi(double l, double h) {
        this.l = l;
        this.h = h;
    }

    @Override
    public double calculeazaAria() {
        return l * h / 2;
    }

    @Override
    public double calculeazaPerimetrul() {
        return 3 * l;
    }
}
