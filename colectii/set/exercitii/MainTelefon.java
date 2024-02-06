package colectii.set.exercitii;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainTelefon {
    public static void main(String[] args) {

        List<Telefon> list1 = new ArrayList<>();
        List<Telefon> list2 = new ArrayList<>();

        Telefon t1 = new Telefon<>("Samsung", "S20" , "Maria");
        Telefon t2 = new Telefon<>("Samsung", "S22" , "Ana");
        Telefon t3 = new Telefon<>("Iphone", "13" , "Maria");
        Telefon t4 = new Telefon<>("Huawei", "P60" , "Maria");
        Telefon t5 = new Telefon<>("Huawei", "P60" , "Ionut");

        list1.add(t1);
        list1.add(t2);
        list1.add(t3);
        list2.add(t4);
        list2.add(t5);

        System.out.println(alipeste(list1,list2).toString());
    }

    public static Set<Telefon> alipeste (List<Telefon> list1, List<Telefon> list2){
        list1.addAll(list2); // la lista 1 s a adaugat lista 2
        Set<Telefon> rezultat = new HashSet<>(list1); // transformam lista 1 intr un set
        return rezultat;
    }
}
