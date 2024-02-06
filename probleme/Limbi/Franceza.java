package probleme.Limbi;

public class Franceza implements Traductibil{

    @Override
    public String traduce(String text) {
        return "Traducerea textului " + text + " in franceza";
    }
}
