package generics;

public class MainReparator {

    public static void main(String[] args) {
        Reparator<Laptop> reparator = new Reparator<Laptop>();

        Reparator<Calculator> ionut = new Reparator<>();

        repara(ionut, new Gadget("B23F"));
    }

    // ? -> wildcard
    static void repara(Reparator<? extends Gadget> reparator, Gadget g) {

    }
}
