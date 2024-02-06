package probleme.Limbi;

public class Romana implements Traductibil {

    @Override
    public String traduce(String text) {
        return "Traducerea textului " + text + " in romana";
    }
}
