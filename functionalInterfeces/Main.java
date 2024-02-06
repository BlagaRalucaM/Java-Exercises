package functionalInterfeces;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // lambda expression ( sau metode anonime ) - sunt de ajutor la stream uri
        // sintaxa: param -> {body metoda}
        // putem folosi lambda doar la interf functionale pt ca avem doar o metoda abstracta si stim deja ce metoda implementam
        Consumer<Integer> c = t -> {
            System.out.println(t);
        };

//        Consumer<Integer> c2 = new MyConsumer();
//
//        Consumer<Integer> c3 = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };

        // Supplier - nu primeste nimic ca param si returneaza un string
        Supplier<String> s = () -> "abc";
        System.out.println(s.get());

        // Function<T,R> - aplicam o functie pe parametru (T); R este rezultatul functiei. Intoarce rezultatul
        // apply(T t)
        Function<Integer,Integer> f = param -> param +1;

        //BiFunction<T,U,R> - primeste 2 parametri si returneaza rezultatul
        // apply( T t, U u )
        BiFunction<Integer,Integer,Integer> b = (e1, e2) -> e1 + e2;
        System.out.println(b.apply(3,5));

        BiFunction<String,Integer,String> b2 = (e1,e2) -> e1.concat(e2.toString());
        System.out.println(b2.apply("abc", 2));

        // predicate<T> - testeaza anumite conditii
        // meoda abstracta (test) returneaza un boolean
        Predicate<String> p = str -> str.startsWith("c");
        System.out.println(p.test("ccw"));

        BiPredicate<String,Integer> p2 = (ss,i) -> ss.length()==i;
        System.out.println(p2.test("abc", 3));

        // se gasesc in java.util.function

    }
}
