package overloading;

public class Overload {

    public static void main(String[] args) {
        System.out.println(aduna(1, 2));
        System.out.println(aduna(1,2,3));
    }

    static int aduna(int a , int b){
        return a + b;
    }

    static int aduna(int a, int b, int c){
        return a + b + c;
    }

    static int aduna(double a, int b){
        return (int) (a + b);
    }

}
