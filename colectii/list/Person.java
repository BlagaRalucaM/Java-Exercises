package colectii.list;

public class Person implements Comparable<Person>{

    private String cnp;
    private String nume;
    private int varsta;

    public Person(String cnp, String nume, int varsta) {
        this.cnp = cnp;
        this.nume = nume;
        this.varsta=varsta;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cnp='" + cnp + '\'' +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.varsta - o.varsta;
    }
}
