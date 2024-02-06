package streams;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    // scopul este de a face mai multe operatii pt a transforma sirul initial
    // sunt unice; dupa creere nu il mai putem folosi, trb creat altul
    // exista stream uri finite si infinite ( multimea nr nat )
    // suporta op inlantuite pe el; se poate manipula cu interf funct
    // fiecare rez pe stream primeste rezultatul operatiei anterioare
    // nu modifica sirul initial
    // are operatii intermediare ( nu se executa pana cand nu se executa operatia finala) si finale ( lazy loading )

    public static void main(String[] args) {
        Stream<Integer> infiniteStream1 = Stream.iterate(0, s -> s+3 );
//        List<Integer> list = infiniteStream1.skip(3).limit(5).toList();
//        System.out.println(list);
        // primul elem este elem de la care sa inceapa stream ul ( 0 ),
        // iar al doilea este functia ( lambda expresie ) aplicata pe elem anterior pt a ne da urmatorul element
        //infiniteStream1.forEach(a -> System.out.println(a));

        // metodele limit si skip - intorc tot un stream
        // limit - limiteaza stream ul la nr de caractere pe care il dam noi
        //infiniteStream1.limit(5);
        // skip face skip la primele n elemente
        //infiniteStream1.skip(3);

        // filter - testeaza o conditie pe elem curent. primeste un predicate si intoarce un stream
        // intoarce un stream cu elem care matchuiesc conditia din predicate

        // map - primeste un funtion; aplica o functie pe fiecare elem din stream
        // map ul transforma elem pe baza functiei date

       // returneaza un stream infinit cu elem diviz cu 2
       List<Integer> rez = infiniteStream1.filter(a -> a%2 == 0).limit(10).toList();
       System.out.println(rez);
    }
}
