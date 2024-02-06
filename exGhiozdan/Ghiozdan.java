package exGhiozdan;

public class Ghiozdan<T> {
    T[] obiecte;

    public T[] getObiecte() {
        return obiecte;
    }

    public void setObiecte(T[] obiecte) {
        this.obiecte = obiecte;
    }

    public Ghiozdan(T[] obiecte) {
        this.obiecte = obiecte;
    }
}
