package colectii.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        // creem o lista de integer
        List<Integer> ints = new ArrayList<>();
        ints.add(32); // adauga in lista
        ints.add(31);
        ints.add(12);
        ints.add(0, 8);
        ints.add(3, 877);

        List<Integer> ints2 = new ArrayList<>();
        ints2.add(3);
        ints2.add(4);

        ints.addAll(ints2);

        for (int elem : ints) {
            System.out.println(elem);
        }

//        ints.clear();

//        System.out.println(ints.containsAll(ints2));
        System.out.println(ints.get(2)); // elementul de la indexul dat ca pramaetru
        System.out.println(ints.indexOf(877)); // indexul elem cu val "877"
        System.out.println(ints.isEmpty()); // true sau false daca lista e goala sau nu

        List<String> strings = new ArrayList<>();
        System.out.println(strings.isEmpty());

        List<Integer> newList = List.of(5, 6); // creeaza un unmodifieable list;
        for (int elem : newList) {             // nu o putem modifica
            System.out.println(elem);
        }
        ints.remove(0);  // stergem elem de la indexul dat ca param
        System.out.println("Lista dupa stergere");   // putem sterge si dupa val elementului
        for (int elem : ints) {
            System.out.println(elem);
        }

        List<String> str = new ArrayList<>();
        str.add("abc");
        str.remove("abc");  // stergem elem dupa valoare
        System.out.println(str.isEmpty());

        ints.set(0, 999); // updateaza elem de la indexul dat ca param cu val celui de al doilea param
        for (int elem : ints) {
            System.out.println(elem);
        }
        System.out.println(ints.subList(1, 3)); // intoarce o sublista care incepe cu indexul 1 si se termina cu index 3 ( neinclusiv)

        System.out.println(ints);

        System.out.println("Iterator");  // iteram prin lista
        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()) {   // verifica daca mai exista elem dupa
            System.out.println(iterator.next());  // ia urmatorul elem
        }
        System.out.println(sum(ints));
    }

    // suma elem unei liste
    static int sum(List<Integer> input) {
        int s = 0;
        Iterator<Integer> iterator = input.iterator();
        while (iterator.hasNext()) {
            s = s + iterator.next();
        }
        return s;
    }
}
