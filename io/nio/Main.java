package io.nio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // clasa path contine path ul unui fisier
        // creem un path inainte de a creea un fisier
        Path path = Paths.get("C:\\Users\\Raluca\\OneDrive\\Desktop\\Advanced_58\\Advanced_58\\src\\io\\nio\\file.txt");
        Path pathToCopy =  Paths.get("C:\\Users\\Raluca\\OneDrive\\Desktop\\Advanced_58\\Advanced_58\\src\\io\\nio\\file.txt");

        Files.createFile(path);

    }
}
