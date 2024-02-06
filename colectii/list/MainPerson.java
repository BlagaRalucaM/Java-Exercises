package colectii.list;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        // creem o lista de persoane
        List<Person> persoane = new ArrayList<>();

        // adaugam pers in lista
        persoane.add(new Person("2312542345", "Ion Popescu", 20));
        persoane.add(new Person("4654364355", "Madalin Mocanu", 19));
        persoane.add(new Person("7657654355", "Florin", 35));
        persoane.add(new Person("1235324444", "Adrian", 42));

        System.out.println(generate(persoane));
    }

    // pentru fiecare element din list ade persoane, vreau sa mi creez o lista care contine nume -> CNP
//    Ion Popescu -> 2312542345
//    Madalin Mocanu -> 4654364355
    static List<String> generate(List<Person> persoane) {
        List<String> mapari = new ArrayList<>();
        for (Person persoana : persoane) {  // parcurgem lista initiala
            String mapare = persoana.getNume() + " -> " + persoana.getCnp();
            mapari.add(mapare);  // adaugam stringul construit in noua lista
        }
        return mapari;
    }
}
