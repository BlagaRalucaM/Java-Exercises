package generics;

public class Ceasca<T> {
    //        List<String> str = new ArrayList<>()

    private final T lichid;

    public Ceasca(T lichid) {
        this.lichid = lichid;
    }

    void bea() {
        System.out.println("Bem " + this.lichid.getClass().getCanonicalName());
    }
}
