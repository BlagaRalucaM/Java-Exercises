package inheritance;

public class Main {

    public static void main(String[] args) {
//        Cerc c = new Cerc(5);
        //
//        c.calculateArea();
//
//        Patrat p = new Patrat(22);
//        p.calculateArea();
//
//
//        Cerc cc = new Cerc(3);
//
//        cc.abc();
//        cc.calculateArea();

        Patrat p = new Patrat(3);

        FormaGeometrica forma = new Cerc(3);
        forma.calculateArea();
    }
}
