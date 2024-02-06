package colectii.map;

import recap.Masina;

import java.nio.file.SecureDirectoryStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // map ul tine o lista de mapare ( K - cheie si V - valoare ) ( de ex un nr de tel - key si numele proprietarului - valoare )
        // unei chei ii corespunde o singura valoare
        // cheia este unica; nu ptem avea aceeasi cheie la 2 valori
        //  Map<String, String>
        // 075478934 - Ionut
        // 075735728 - Andrei
        // daca introducem aceeasi mapare dar cu alta valoare ( alt nume dar acelasi nr de tel ), se va modifica valoarea initiala
        // 075478934 - Maria -> 075478934 - Ionut
        // capacitatea initiala e de 16 elemente
        // daca ajungem la capacitate de 75% el isi face resize la dublu automat

        // HashMap: nu pastreaza ordinea
        Map<String, String> map = new HashMap<>();
        String telefon = "075478934";

        // pt inserari in map avem metoda put
        map.put(telefon, "Ionut");
        System.out.println(map);
        map.put(telefon, "Ionut2");
        System.out.println(map);

        // metoda get ne da val de la cheia data ca parametru
        System.out.println(map.get(telefon));

        // daca 2 ob sunt equals inseamna ca au acelasi hashcode
        // daca 2 ob au acelasi hashcode nu inseamna ca sunt equals

        // daca adaugam o mapare unde cheia are acelasi hashcode ca o alta cheie care deja exista, dar nu sunt equals
        // atunci elementul se va pune intr un linkedlist legat la bucket ul initial - coliziune de hash

        // LinkedHashMap: lista dublu inlantuita;
        // pastreaza elem in ordinea inserarii

        Map<String, Masina> map2 = new LinkedHashMap<>();
        map2.put("F46248672" , new Masina());

        // TreeMap: arbore binar de cautare ( are doar 2 copii - cautam in jumatati )
        // arborele este echilibrat ( nr copiilor din stanga este aproximativ egal cu nr copiilor din dreapta )
        // elem din stanga sunt mai mici decat radacina, iar cele din dreapa sunt mai mari decat radacina
        // by default ele sunt ordonate dupa cheie; daca vrem alta ordonare trebuie sa implementam Comparable

        Map<Integer, Masina> map3 = new TreeMap<>();
        map3.put(1, new Masina());
        map3.put(-1, new Masina());
        System.out.println(map3);
        // Map ul este de tipul Set<Map.Entry>; Entry este un inner interface
        // Map<String, String> <=> Set<Map.Entry<String, String>>;

        map3.clear(); // goleste map ul

        Map<String,String> ex = new HashMap<>();
        ex.put("str15" , "str5");
        ex.put("str22" , "str30");
        ex.put("str10" , "str7");
        ex.put("str3" , "str4");
        ex.containsKey("str15"); // verifica daca map ul contine cheia

        Map.Entry<String,String> entry = Map.entry("5674", "bgnv"); // creem un entry manual

        // entrySet - intoarce o colectie(set) de map.entry
        // keySet - intoarce un set de chei;
        ex.keySet();
        // values - intoarce un set de valori;
        ex.values();

        // putIfAbsent - adauga in map doar daca nu exista cheia; daca deja exista cheia nu face nimic

        // replace - inlocuieste si cheia si valoarea
    }
}
