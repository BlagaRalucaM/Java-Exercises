package ex;

public class Cerc implements SuprafataCalculabila {

    private double r;

    public Cerc(double r) {
        this.r = r;
    }

    @Override
    public double calculeazaAria() {
        return Math.PI * r * r;
    }

    @Override
    public double calculeazaPerimetrul() {
        return 2 * Math.PI * r;
    }
}
