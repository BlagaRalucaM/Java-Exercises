package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {

        // citire byte cy byte; putem citi si imagini ( fisiere binare )
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // in = new FileReader(C:\Users\Raluca\OneDrive\Desktop\Advanced_58\Advanced_58\src\io\input);
            // out = new FileWriter(C:\Users\Raluca\OneDrive\Desktop\Advanced_58\Advanced_58\src\io\input);


            int nextChar;
            while ((nextChar = in.read()) != -1) {
                out.append((char) nextChar);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

