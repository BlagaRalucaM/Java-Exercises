package abstractVSInterface;

public class Main {

    public static void main(String[] args) {
        Animal a = new Caine();
        a.mananca();

        Caine c = new Caine();
        c.auBlana();
        c.merge();

        Bautor b = new Planta();
        Bautor bb = new Om();
    }
}
