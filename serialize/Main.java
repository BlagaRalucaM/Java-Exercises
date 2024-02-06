package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        Movie movie = new Movie("film1", "ri[1", 2020);

        // ObjectOutputStream - se fol pt serializare

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Raluca\\OneDrive\\Desktop\\Advanced_58\\Advanced_58\\src\\serialize\\serializare.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        out.writeObject(movie);
    }
}
