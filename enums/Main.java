package enums;

public class Main {
    public static void main(String[] args) {
        ElementChimic helium = ElementChimic.HE;
        System.out.println(helium.nume);
        System.out.println(helium.nrAtomic);

        ElementChimic sodiu = ElementChimic.NA;
        System.out.println(sodiu.nume);

        decide(ZiSaptamana.MARTI);

        getVreme(Anotimp.PRIMAVARA);
    }

    static void decide(ZiSaptamana ziSaptamana) {
        System.out.println(ziSaptamana.nrZi);
        switch (ziSaptamana) {
            // ziSaptamana == ZiSaptamana.LUNI
            case LUNI:
                System.out.println("Avem ore");
                break;
            case MARTI:
                System.out.println("Avem ore");
                break;
            case MIERCURI:
                System.out.println("Avem ore");
                break;
            case JOI:
                System.out.println("Avem ore");
                break;
            case VINERI:
                System.out.println("Nu avem ore");
                break;
            default:
        }
    }

    static void getVreme(Anotimp anotimp) {
//        if (anotimp == Anotimp.PRIMAVARA) {
//            System.out.println("E caldut");
//        } else if (anotimp == Anotimp.VARA) {
//            System.out.println("E cald");
//        } else if (anotimp == Anotimp.TOAMNA) {
//            System.out.println("E frigut");
//        } else if (anotimp == Anotimp.IARNA) {
//            System.out.println("E frig");
//        }

        // conversie din string in ENUM
        Anotimp an = Anotimp.valueOf("VARA"); //Anotimp.VARA
        System.out.println(an.lunaInceput);
        System.out.println(an.lunaSfarsit);

        // conversie din ENUM in string
        String anotimpAsString = anotimp.toString();
        if(Anotimp.PRIMAVARA.toString().equals(anotimpAsString)) {
            System.out.println("E caldut");
        }
    }
}
