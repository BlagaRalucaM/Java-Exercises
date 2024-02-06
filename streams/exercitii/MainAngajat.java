package streams.exercitii;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainAngajat {
    public static void main(String[] args) {

        Angajat a1 = new Angajat("departament1", "nume1");
        Angajat a2 = new Angajat("departament2", "nume2");

        Angajat a3 = new Angajat("departament1", "nume3");
        Angajat a4 = new Angajat("departament3", "nume4");
        Angajat a5 = new Angajat("departament2", "nume5");

        Angajat a6 = new Angajat("departament1", "nume6");
        Angajat a7 = new Angajat("departament2", "nume7");
        Angajat a8 = new Angajat("departament2", "nume8");

        Companie c1 = new Companie("companie1", Arrays.asList(a1, a2), 2005);
        Companie c2 = new Companie("companie2", Arrays.asList(a3, a4, a5), 1995);
        Companie c3 = new Companie("companie3", Arrays.asList(a6, a7, a8), 2015);

        List<Companie> companii = Arrays.asList(c1, c2, c3);

        System.out.println(c1.getAndFromDep("departament1"));
        System.out.println(c2.getAndFromDep("departament3"));
        System.out.println(c3.getAndFromDep("departament2"));

        System.out.println(companii.stream().filter(comp -> comp.getAngajati().size() > 2).collect(Collectors.toList()));

        // Companie::getNume - in stanga clasa, in dreapta metoda folosita
        // deoarece metoda getNume este pe clasa companie
        // metode reference
        List<String> numeCompanii = companii.stream().filter(comp -> comp.getAnInfiintare() > 2000).map(Companie::getNume).collect(Collectors.toList());
        System.out.println(numeCompanii);

        System.out.println(companii.stream().allMatch(comp -> {
            for(Angajat a : comp.getAngajati()){
                if(a.getNume().startsWith("n")){
                    return true;
                }
            }
            return false;
        }));

        Optional<Angajat> opt = c1.findAng("departament1");
        if(opt.isPresent()){
            System.out.println(opt.get());
        } else {
            System.out.println("Nu exista");
        }

        System.out.println(c3.getNumeDep());
    }
}
