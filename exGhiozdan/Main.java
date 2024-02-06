package exGhiozdan;

public class Main {
    public static void main(String[] args) {
        Object[] continutGhiozdan = new Object[5];

        continutGhiozdan[0] = new Pix();
        continutGhiozdan[1] = new Caiet();
        continutGhiozdan[2] = new Carte();

        Caiet[] pixuri = new Caiet[3];
        Ghiozdan<Caiet> caietGhiozdan = new Ghiozdan<>(pixuri);
        arataGhiozdan(caietGhiozdan);

        Ghiozdan<Object> g = new Ghiozdan<>(continutGhiozdan);
        arataGhiozdan(g);
    }

    static void arataGhiozdan(Ghiozdan<?> g) {
        for(int i = 0 ; i < g.getObiecte().length; i++){
            System.out.println(g.getObiecte()[i]);
        }
    }
}
