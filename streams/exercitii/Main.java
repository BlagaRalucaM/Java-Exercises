package streams.exercitii;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = Arrays.asList(
                new Student(20, "Ionut", 9.50),
                new Student(22, "Adrian", 7.77),
                new Student(19, "Maria", 8.60),
                new Student(23, "Andrei", 6.00)
        );

        List<Student> s1 = studenti.stream().filter(a -> a.getMedie() > 7).collect(Collectors.toList());
        List<Student> s2 = studenti.stream().filter(a -> a.getAge() > 20).collect(Collectors.toList());
        // collect(Collectors.toList() - returneaza o lista; operatie terminala

        studenti.forEach(q -> q.setMedie(q.getMedie() + 1));
        System.out.println(studenti);

        // transforma stream ul de studenti intr un stream de double uri cu mediile lor
        List<Double> medii = studenti.stream().map(p -> p.getMedie()).collect(Collectors.toList());
        System.out.println(medii);

        System.out.println(s1);
        System.out.println(s2);

    // trans stream ul de studenti intr un stream de numere unde fiecare nr rep nr de caract din numele elevului
        List<Integer> list = studenti.stream().map(t -> t.getNume().length()).collect(Collectors.toList());
        System.out.println(list);

    // sortam stud dupa medie sau dupa nume
        List<Student> sortat = studenti.stream().sorted((a,b) ->(int)(a.getMedie() - b.getMedie())).collect(Collectors.toList());
        System.out.println("aaa");
        System.out.println(sortat);

    // studentul cu cea mai mare medie
        // max ul intoarce un Optional, care poate lua 2 valori: optional.empty( daca stream ul nu are maxim )
        // nu exista null la Optional
        Optional<Student> sortat2 = studenti.stream().max((a, b) ->(int)(a.getMedie() - b.getMedie()));

        Optional<Student> opt = studenti.stream().filter(a -> a.getMedie()>10).findFirst();
        opt.get();   // va da exceptie pt ca nu avem un student cu medie mai mare de 10.
                     // get intoarce primul elem din interiorul lui optional care indeplineste conditia
        // isPresent() - verifica daca exista elementul
    }

    //studentii care au media peste 7
    // stud care au peste 20 ani
    // maresc media tuturor cu 1 si returnam rez
}
