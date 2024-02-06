package probleme.Limbi;

public class Engleza implements Traductibil {

    @Override
    public String traduce(String text) {
        return "Traducerea textului " + text + " in engleza";
    }
}
