package exGenerics;

// avem 3 arrayuri : unul de inturi ,unul de stringuri
// Integer
// String
public class Printer<T> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public Printer(T[] array) {
        this.array = array;
    }
}
