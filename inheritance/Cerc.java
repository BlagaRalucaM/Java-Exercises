package inheritance;

public class Cerc extends FormaGeometrica {
    // A extends B -> A = copil, B parinte
    private int r;
    public Cerc(int r) {
        System.out.println("Se apeleaza constructorul din cerc");
        this.r = r;
    }

    @Override
    public void calculateArea() {
        this.area = 3.14 * r * r;
        System.out.println(this.area);
    }

    public void abc(){

    }

}