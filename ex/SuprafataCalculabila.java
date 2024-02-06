package ex;

public interface SuprafataCalculabila {

    double calculeazaAria();

    double calculeazaPerimetrul();

    default void metoda1() {
        System.out.println("abc");
    }
}
