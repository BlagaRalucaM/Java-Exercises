package streams.exercitii;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Companie {
    private String nume;
    private List<Angajat> angajati;
    private int anInfiintare;

    public Companie(String nume, List<Angajat> angajati, int anInfiintare) {
        this.nume = nume;
        this.angajati = angajati;
        this.anInfiintare = anInfiintare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Angajat> angajati) {
        this.angajati = angajati;
    }

    public int getAnInfiintare() {
        return anInfiintare;
    }

    public void setAnInfiintare(int anInfiintare) {
        this.anInfiintare = anInfiintare;
    }

    @Override
    public String toString() {
        return "Companie{" +
                "nume='" + nume + '\'' +
                ", angajati=" + angajati +
                ", anInfiintare=" + anInfiintare +
                '}';
    }

    public List<Angajat> getAndFromDep (String departament){
        return this.angajati.stream().filter(ang -> ang.getDepartament().equals(departament)).collect(Collectors.toList());
    }
    public Optional<Angajat> findAng (String departament){
        return this.getAngajati().stream().filter(ang -> departament.equals(ang.getDepartament())).findFirst();
    }
    public List<String> getNumeDep(){
        return this.getAngajati().stream().map(Angajat::getDepartament).distinct().collect(Collectors.toList());
    }
}
