package colectii.set.exercitii;

import java.util.Objects;

public class Masina<T> {
    private String model;
    private String marca;
    private int anFabricatie;
    private String motor;

    public Masina(String model, String marca, int anFabricatie, String motor) {
        this.model = model;
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Masina<?> masina = (Masina<?>) o;
        return Objects.equals(motor, masina.motor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motor);
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", marca='" + marca + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", motor='" + motor + '\'' +
                '}';
    }
}
