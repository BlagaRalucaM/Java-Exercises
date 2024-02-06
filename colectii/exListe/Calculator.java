package colectii.exListe;

public class Calculator {
    private int anFabricatie;
    private String procesor;
    private String ram;

    public Calculator(int anFabricatie, String procesor, String ram) {
        this.anFabricatie = anFabricatie;
        this.procesor = procesor;
        this.ram = ram;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "anFabricatie=" + anFabricatie +
                ", procesor='" + procesor + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
