package colectii.set.exercitii;

import java.util.Objects;

public class Telefon<T> {
    private String marca;
    private String model;
    private String proprietar;

    public Telefon(String marca, String model, String procesor) {
        this.marca = marca;
        this.model = model;
        this.proprietar = procesor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProprietar() {
        return proprietar;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefon<?> telefon = (Telefon<?>) o;
        return Objects.equals(proprietar, telefon.proprietar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proprietar);
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", proprietar='" + proprietar + '\'' +
                '}';
    }
}
