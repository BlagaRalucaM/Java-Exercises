package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static javax.management.Query.in;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        // citire caracter cu caracter
        FileReader in = null;
        FileWriter out = null;

        try {
           // in = new FileReader(C:\Users\Raluca\OneDrive\Desktop\Advanced_58\Advanced_58\src\io\input);
           // out = new FileWriter(C:\Users\Raluca\OneDrive\Desktop\Advanced_58\Advanced_58\src\io\input);

           int c;
           int nextChar;
           while ((nextChar = in.read()) != -1){
               out.append((char) nextChar);
           }
        } finally {
            if (in != null){
                in.close();
            }
            if( out != null){
                out.close();
            }
        }
    }
}
