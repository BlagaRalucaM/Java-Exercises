package enums;

public enum Anotimp {
    PRIMAVARA("MARTIE", "MAI"),
    VARA("IUNIE", "AUGUST"),
    TOAMNA("SEPTEMBRIE", "NOIEMBRIE"),
    IARNA("DECEMBRIE", "FEBRUARIE");

    public final String lunaInceput;
    public final String lunaSfarsit;

    Anotimp(String lunaInceput, String lunaSfarsit) {
        this.lunaInceput = lunaInceput;
        this.lunaSfarsit = lunaSfarsit;
    }
}
