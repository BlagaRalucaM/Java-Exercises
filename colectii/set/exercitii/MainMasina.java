package colectii.set.exercitii;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainMasina {
    public static void main(String[] args) {

        Masina m1 = new Masina<>("focus", "ford", 2010, "diesel");
        Masina m2 = new Masina<>("s", "audi", 2009, "benzina");
        Masina m3 = new Masina<>("monterey", "opel", 2012, "diesel");
        Masina m4 = new Masina<>("m2", "bmw", 2003, "benzina");
        Masina m5 = new Masina<>("m3", "bmw", 2003, "benzina");

        List<Masina> masini = new ArrayList<>();
        masini.add(m1);
        masini.add(m1);
        masini.add(m2);
        masini.add(m3);
        masini.add(m3);
        masini.add(m4);

        System.out.println(stergeDuplicate(masini).toString());
    }

    public static Set<Masina> stergeDuplicate ( List<Masina> input){
        Set<Masina> rezultat = new HashSet<>(input);
        return rezultat;
    }
}
