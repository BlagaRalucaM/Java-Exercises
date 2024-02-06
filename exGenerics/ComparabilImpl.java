package exGenerics;

public class ComparabilImpl<T> implements Comparabil<T> {

    @Override
    public void compara(T o1, T o2) {
        System.out.println("compara " + o1.toString() + " cu " + o2.toString());
    }
}
