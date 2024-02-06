package colectii.exListe;

import colectii.list.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainSort {
    public static void main(String[] args) {

        // putem sorta o lista doar daca tipul de date al listei implementeaza interfata Comparable<Person>
        // comparam persoane cu persoane ( <Person> )

        List<Person> personList = Arrays.asList(new Person("2784839857", "Maria", 42),
                new Person("156748678", "Andrei", 36),
                new Person("267849068", "Ana", 20));

        Collections.sort(personList);
        System.out.println(personList);

        List<String> strings = Arrays.asList("abs", "b", "A", "ab");
        Collections.sort(strings);
        System.out.println(strings);

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(23,3,4);
        List<Integer> rezultat = create(list1,list2);
        Collections.sort(rezultat);
        System.out.println(rezultat);
    }
    // se dau 2 liste de integer de aceeasi dim. (1,2,3) , (23,3,4).
    // intoarcem o lista care are pe poz i suma elem de pe pozitiile i din listele initiale
    // pt noua lista primul elem va fi : 1+23 = 24, al doilea: 2+3 = 5, al treilea: 3+4= 7
    // dupa care ordonam cescator elem din noua lista

    public static List<Integer> create(List<Integer> list1, List<Integer> list2) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            newList.add(list1.get(i) + list2.get(i));
        }
        return newList;
    }
}
