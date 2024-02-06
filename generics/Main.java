package generics;

public class Main {

    public static void main(String[] args) {
        Cafea cafea = new Cafea();

//        c1.bea();
//        Ceasca<Apa> c1 = new Ceasca<>(apa);
        Ceasca<Cafea> c3 = new Ceasca<>(cafea);
//        Ceasca c = new Ceasca(); // raw type

        c3.bea();

        Apa apa = new Apa();
        Ceasca<Apa> c5 = umple(apa);

        Ceasca c6 = new Ceasca(apa);

        Ceasca<Suc> c2;
//        Ceasca c1 = new Ceasca()

    }

    // <T> - ii spunem ca exista un tip generic in signatura metodei
    // Ceasca<T> - return typeul metodei
    // T tipul parametrluui -> tipul lichidului cu care va fi umpluta ceasca
    static <Y> Ceasca<Y> umple(Y lichid) {
        return new Ceasca<Y>(lichid);
    }
}
