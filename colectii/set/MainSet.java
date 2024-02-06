package colectii.set;

import colectii.list.Person;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        // setul nu contine duplicate, pe cand lista contine
        // nu pastreaza ordinea inserarii elementelor, pe cand lista pastreaza
        // permite null uri
        // nu poti accesa elem din set dupa index, pt ca ordinea nu este constanta
        // in general se fol pt a scapa de duplicate

        List<Integer> ints = Arrays.asList(1, 1, 2, 1, 3);
        System.out.println(ints);

        Set<String> stringsSet = new HashSet<>();
        // metoda de add verifica daca elem adaugat exista deja sau nu in set; daca exista nu il adauga din nou
        stringsSet.add("abc");
        stringsSet.add("vbb");
        stringsSet.add("vbb");
        stringsSet.add("jcna");
        stringsSet.add("tgdbnm");

        System.out.println(stringsSet);

        // daca iteram de mai multe ori nu este garantat ca se va pastra ordinea elementelor
        // prob este rezolvata de linkedHashSet, care tine elem in ordinea lor
        for (String s : stringsSet) {
            System.out.println(s);
        }

        // convertire dintr o lista intr un set; se elimina duplicatele
        Set<Integer> s1 = new HashSet<>(ints);
        System.out.println(s1);

        // convertire din set in lista
        List<Integer> s2 = new ArrayList<>(s1);
        System.out.println(s2);

        // LinkedHashSet: este implementata ca o lista dublu inlantuita
        // fata de HashSet, pastreaza ordinea inserarii elementelor
        // are initialCapacity care este cappacitatea initiala si un loadFactor (75%),
        // iar daca se ajunge la 75% din capacitate atunci isi face resize automat si isi dubleaza capacitatea

        LinkedHashSet<Integer> ints2 = new LinkedHashSet<>();
        ints2.add(1);
        ints2.add(1);
        ints2.add(2);
        ints2.add(3);
        System.out.println(ints2);

        // TreeSet: este implementat ca un arbore binar de cautare
        // e ordonat ( sortat ) by default atunci cand este creeat ( programatorul da ordinea )
        // fiecare nod are 2 copii sau niciunul ( frunze )
        // copilul din stanga e mereu mai mic decat radacina, iar cel din dreapta mai mare decat radacina
        // nu avem voie cu null uri
        // tipul de date al fiecarui elem din treeset trebuie sa implementeze interfata Comparable

        // fiind elem de tip Integer sunt by default ordonate crescator ( pt ca Integer implementeaza Comparable )
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(32);
        treeSet.add(22);
        treeSet.add(17);
        treeSet.add(245);
        System.out.println(treeSet);

        // cand creem un treeset de persoane el in spate foloseste metoda compareTo din clasa Person pt a le ordona
        TreeSet<Person> treeSet1 = new TreeSet<>();
        treeSet1.add(new Person("2784839857", "Maria", 42));
        treeSet1.add(new Person("156748678", "Andrei", 36));
        treeSet1.add(new Person("267849068", "Ana", 20));
        System.out.println(treeSet1);

    }
}
