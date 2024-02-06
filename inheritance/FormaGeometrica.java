package inheritance;

public class FormaGeometrica {
    protected double area;
    protected double perimeter;

    public FormaGeometrica(){
        System.out.println("Se apeleaza constructorul din parinte");
    }

    public void calculateArea() {
        System.out.println("CALCULEAZA ARIA");
    }
}
