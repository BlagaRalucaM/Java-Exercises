package probleme.Limbi;

public class Main {

    public static void main(String[] args) {
        StringBuilder prop = new StringBuilder();
        Traductibil[] traductibile = new Traductibil[3];

        traductibile[0] = new Romana();
        traductibile[1] = new Franceza();
        traductibile[2] = new Engleza();

        for (int i = 0; i < traductibile.length; i++) {
            prop.append(traductibile[i].traduce("Ana are mere"));
        }
        System.out.println(prop.toString());

    }
}
