package colectii.exMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainStrings {
    public static void main(String[] args) {
        String input1 = "speed";
        String input2 = "dpese";
        System.out.println(verifica(input1,input2));
    }

    static Map<Character, Integer> construiesteMap(String input) {
        Map<Character, Integer> rezultat = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            rezultat.putIfAbsent(input.charAt(i), 0);
            rezultat.put(input.charAt(i), rezultat.get(input.charAt(i)) + 1);
        }
        return rezultat;
    }

    static boolean verifica(String input1, String input2) {
        Map<Character, Integer> map1 = construiesteMap(input1);
        Map<Character, Integer> map2 = construiesteMap(input2);
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) { // verif daca map2 contine cheia p
                if (map2.get(entry.getKey()).intValue() != map1.get(entry.getKey()).intValue()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

}
