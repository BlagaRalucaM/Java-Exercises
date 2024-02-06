package ex;

public class Patrat implements SuprafataCalculabila {

    private double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    @Override
    public double calculeazaAria() {
        return latura * latura;
    }

    @Override
    public double calculeazaPerimetrul() {
        return 4 * latura;
    }
}
