package inheritance;

public class Patrat extends FormaGeometrica {
    private int l;

    public Patrat(int l) {
        super();
        System.out.println("Se apeleaza constructorul din patrat");
        this.l = l;
    }

//    @Override
//    public void calculateArea() {
//        this.area = l * l;
//        System.out.println(this.area);
//    }
}
