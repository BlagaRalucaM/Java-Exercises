package ex;

public class Main {

    public static void main(String[] args) {
        SuprafataCalculabila[] figuri = new SuprafataCalculabila[5];

        figuri[0] = new Cerc(3);
        figuri[1] = new Patrat(4);
        figuri[2] = new Romb(2, 7, 3);
        figuri[3] = new Triunghi(8, 8);
        figuri[4] = new Romb(2, 2, 2);

        for (int i = 0; i < figuri.length; i++) {
            System.out.println(figuri[i].calculeazaPerimetrul());
        }

        figuri[0].metoda1();
        figuri[1].metoda1();
    }
    // git clone https://github.com/verdictus/Spring
}
