package probleme.Sport;

public class Meci {
    private Sport s1;
    private Sport s2;

    public Meci(Sport s1, Sport s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public Sport getS1() {
        return s1;
    }

    public void setS1(Sport s1) {
        this.s1 = s1;
    }

    public Sport getS2() {
        return s2;
    }

    public void setS2(Sport s2) {
        this.s2 = s2;
    }
}
