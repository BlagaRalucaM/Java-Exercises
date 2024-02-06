package probleme.companie;

public class Main {

    public static void main(String[] args) {
        Traducator t1 = new Traducator(250, 10, 30);
        Angajat a1 = new Angajat(10, 30, 20);
        System.out.println(compara(t1, a1));
        // o metoda care calculeaza maximul salariului intre un angajat , manager si traducator
        // intr-o luna in care traducatorul a tradus X pagini , iar Angajatul a lucrat Y ore pe zi in fiecare zi.


        // o metoda care compara salariile salariatilor.
    }

    public static boolean compara(Salariat s1, Salariat s2) {
        return s1.calculeazaSalariul() > s2.calculeazaSalariul();
    }
}
