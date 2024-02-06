package abstractVSInterface;

public abstract class Animal {

    protected String nume;

    public Animal(String a, String b){

    }


    public Animal(){

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    abstract void mananca();

    public boolean auBlana() {
        return true;
    }
}
