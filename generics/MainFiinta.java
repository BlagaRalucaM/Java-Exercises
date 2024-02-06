package generics;

public class MainFiinta {
    public static void main(String[] args) {
        Fiinta fiinta = new Fiinta();
        Ingrijitor<Fiinta> madalin = new Ingrijitor<>();

        Ingrijitor<Gadget> ionut = new Ingrijitor<>();

        Ingrijitor<Pisica> florin = new Ingrijitor<>();

        hraneste(madalin, fiinta);

        hraneste(ionut);
    }

    // ? super inseamna parinti ai lui Animal upper bound wildcard
    // ? extends inseamna copii ai lui Animal lower bound wildcard
    static void hraneste(Ingrijitor<? super Animal> ingrijitor, Fiinta f) {

    }

    // wildcard

    static void hraneste(Ingrijitor<?> ingrijitor){

    }
}
