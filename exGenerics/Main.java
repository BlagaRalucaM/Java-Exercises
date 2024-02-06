package exGenerics;

import generics.Caine;
import generics.Gadget;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1, 2, 3};
        String[] strings = new String[]{"a", "b", "c"};
        Boolean[] booleans = new Boolean[]{true, false};

        Printer<Integer> printer1 = new Printer<>(ints);
        Printer<String> printer2 = new Printer<>(strings);
        Printer<Boolean> printer3 = new Printer<>(booleans);

        print(printer1);
        print(printer2);
        print(printer3);

        ComparabilImpl<Integer> integerComparabil = new ComparabilImpl<Integer>();

        ComparabilImpl<Gadget> gadgetComparabil = new ComparabilImpl<Gadget>();

//        gadgetComparabil.compara(new Gadget("id1"), new Gadget("id2"));
//        integerComparabil.compara(1,2);
    }

    static void print(Printer<?> printer) {
        for (int i = 0; i < printer.getArray().length; i++) {
            if (!(printer.getArray()[i] instanceof Boolean)) {
                System.out.println(printer.getArray()[i]);
            }
        }
    }
}
