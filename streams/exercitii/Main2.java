package streams.exercitii;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        Map<String, List<Locuinta>> mapari = new HashMap<>();

        mapari.put("2996637893", Arrays.asList(
                new Locuinta("strada1", 50, 2000),
                new Locuinta("strada2", 45, 2005),
                new Locuinta("strada3", 60, 2010)));

        mapari.put("1778499409", Arrays.asList(
                new Locuinta("strada4", 35, 1999)));

        mapari.put("2655678976", new ArrayList<>());

        System.out.println(getCnpFaraLocuinte(mapari));
        System.out.println(getLocuintaVeche(mapari, "2996637893"));
    }

    static Set<String> getCnpFaraLocuinte (Map<String, List<Locuinta>> input){
        // elem are tip de date Map.Entry
        // elem -> elem.getKey() == Map.Entry::getKey
        Set<String> cnps = input.entrySet().stream()
                .filter(elem -> elem.getValue().isEmpty())
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        return cnps;
    }

    static Locuinta getLocuintaVeche (Map<String,List<Locuinta>> input, String cnp){
        // input.get(cnp) returneaza valoarea de la cheia cnp
        Optional<Locuinta> locuinte = input.get(cnp).stream().min((a,b) -> a.getAnConstructie() - b.getAnConstructie());
        if(locuinte.isPresent()){
            return locuinte.get();
        } else return null;
    }
}
