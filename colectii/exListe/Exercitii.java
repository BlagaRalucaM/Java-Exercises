package colectii.exListe;

import java.util.ArrayList;
import java.util.List;

public class Exercitii {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("hdcnj");
        strings.add("kckw");
        strings.add("rhjwm");
        System.out.println(reverse(strings));

        List<Calculator> calculators = List.of(new Calculator(2019, "bnd", "ndc"),
                new Calculator(2020, "nc", "msnc"),
                new Calculator(2021, "bnc", "bnc"),
                new Calculator(2022, "bnc", "bncm"));

        Calculator rezultat = find(calculators, 2020);
        System.out.println(rezultat.toString()); // printam un obiect de tip Calculator;
                                                 //  solutia este sa adaugam metoda toString in clasa Calculator
    }

    public static List<String> reverse(List<String> input) {
        List<String> rezultat = new ArrayList<>();
        for (int i = input.size() - 1; i >= 0; i--) {
            rezultat.add(input.get(i));
        }
        return rezultat;
    }

    public static Calculator find(List<Calculator> input, int x) {
        Calculator rezultat = null;
        for (Calculator n : input) {
            if (n.getAnFabricatie() > x) {
                rezultat = n;
                break;
            }
        }
        return rezultat;
    }
}
