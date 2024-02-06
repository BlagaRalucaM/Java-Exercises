package streams.exercitii;

public class Angajat {
    private String departament;
    private String nume;

    public Angajat(String departament, String nume) {
        this.departament = departament;
        this.nume = nume;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "departament='" + departament + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }
}
