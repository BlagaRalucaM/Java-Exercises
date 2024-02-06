package colectii.exMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> elevi = Arrays.asList("x2" , "x3", "x1", "x5" ,"x7", "x3", "x5", "x1", "x1");
        System.out.println(gasesteVinovatul(elevi));
    }

    static Map<String,Integer> construiesteMaparile (List<String> elevi){
        Map<String,Integer> rezultat = new HashMap<>();
        for (String elev: elevi) {
            rezultat.putIfAbsent(elev,0);
            if (rezultat.containsKey(elev)){
                rezultat.put(elev, rezultat.get(elev) + 1);
            }
        }
        return rezultat;
    }

    static Map<String,Integer> sorteazaMapDesc(Map<String,Integer> aparitii){
        // primim map ul ca pe un Set<Map.Entry<String,Integer>>
        // fol collections.sort()
        Map<String,Integer> sortat = new LinkedHashMap<>();
        Set<Map.Entry<String,Integer>> set = aparitii.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry<String,Integer> entry : list ) {
            sortat.put(entry.getKey(),entry.getValue());
        }
        return sortat;
    }
    static  String gasesteVinovatul (List<String> elevi){
        String elevProblema = null;
        Map<String,Integer> mapNesortat = construiesteMaparile(elevi);
        Map<String,Integer> mapSortat = sorteazaMapDesc(mapNesortat);
        // luam primul element
        // Set<String> numeleElevilor = new LinkedHashSet<>(mapSortat.keySet());
        for (String s : mapSortat.keySet()){
            elevProblema = s;
            break;
        }
        return elevProblema;
    }
}
