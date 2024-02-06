package colectii.exMap;

import java.lang.reflect.Array;
import java.util.*;

public class MainMaterie {
    public static void main(String[] args) {
        Map<String, List<Materie>> eleviVsMaterii = new HashMap<>();
        List<Materie> l1 = Arrays.asList(
                new Materie("matematica", 7),
                new Materie("Franceza", 10));
        List<Materie> l2 = Arrays.asList(
                new Materie("romana", 10),
                new Materie("Franceza", 10),
                new Materie("istorie", 7));
        List<Materie> l3 = Arrays.asList(
                new Materie("matematica", 7),
                new Materie("Franceza", 6),
                new Materie("fizica", 10));

        eleviVsMaterii.put("Ion", l1);
        eleviVsMaterii.put("Adrian", l2);
        eleviVsMaterii.put("Mihai", l3);

        List<String> materii = gasesteMateriile("Adrian", 10, eleviVsMaterii);
        System.out.println(materii);
    }

    static List<String> gasesteMateriile(String numeElev, int nota, Map<String, List<Materie>> input){
List<String> materiiRezultat = new ArrayList<>();
        List<Materie> materiiElev = input.get(numeElev);
        for (Materie m : materiiElev){
            if(m.getNota() == nota){
                materiiRezultat.add(m.getNume());
            }
        }
        return materiiRezultat;
    }
}
