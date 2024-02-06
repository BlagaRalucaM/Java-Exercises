package innerClasses;


class Echipe {
    String echipa1;
    String echipa2;

    class Meci {
        String rezultat;
    }

    @Override
    public String toString(){
        return echipa1 + " " + echipa2;
    }

}

public class Main {
    public static void main(String[] args) {
        Echipe echipe = new Echipe();
        echipe.echipa1 = "Steaua";
        echipe.echipa2 = "Dinamo";
        Echipe.Meci meci = echipe.new Meci();
        meci.rezultat = "2-1";
        System.out.println(echipe);
        System.out.println(meci.rezultat);
    }
}
