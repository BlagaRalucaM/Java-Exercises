package exceptii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // Throwable - Errors -
        //                    - Execptions -> RunTimeExecptions
        //                                 -> alte exceptii
        // daca vrem sa oprim programul aruncam o exceptie; prog se va termina cu un cod de eroare
        // pot si prinse sau nu
        // daca o prinzi, ins ca nu vrei sa se termine prog, chiar daca eroarea a fost data ( nu lasi eroarea sa ti termine prog )

        // sunt 2 categori : Checked si UnChecked
        // UnChecked - runtime exceptions + errors; nu ne asteptam sa apara
        // de ex. NullPointerException
        // ArrayIndexOutOfBound - iteram printr un array si aj la elem x+1, dar el are de fapt doar x elem
        // StackOverFlow - s a terminat memoria Ram; depaseste stiva de memorie
        // OutOfMemory - cand se depaseste memoria heap ( unde sunt stocate obiectele )

        // Checked - ex pe care trb sa le mentionezi; trebuie declarate
        // sunt checked la compilare ( de ex. aio exceptions )

        // daca nu este gasit fisierul (try), se arunca o exceptie care va fi prinsa in catch
        File f = new File("abc");
        try { // se incearca executarea try; daca fail eaza try ul se va executa catch ul ( prindem exceptia )
            FileReader fr = new FileReader(f); // am anuntat in sgnatura metodei ca e posibil sa apara o eroare
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); // aruncam o exceptie care nu este prinsa => programul se inchide idif ce avem dupa
        } finally { // se va executa indiferent daca a fost executat try sau catch ( mereu )
                    // System.exit(0); - pus in try - singura exceptie in care nu se va executa finally
            System.out.println("gndxms");

        }
    }

    static void m1(){
        throw new  MyExceptions();
    }
}
