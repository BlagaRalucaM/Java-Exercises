package ex;

public class Romb implements SuprafataCalculabila {

    private double diag1;
    private double diag2;

    private double l;

    public Romb(double diag1, double diag2, double l) {
        this.diag1 = diag1;
        this.diag2 = diag2;
        this.l = l;
    }

    @Override
    public double calculeazaAria() {
        return diag1 * diag2;
    }

    @Override
    public double calculeazaPerimetrul() {
        return l * 4;
    }
}
