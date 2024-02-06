package streams.exercitii;

public class Student {
    private int age;
    private String nume;
    private double medie;

    public Student(int age, String nume, double medie) {
        this.age = age;
        this.nume = nume;
        this.medie = medie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", nume='" + nume + '\'' +
                ", medie=" + medie +
                '}';
    }
}
