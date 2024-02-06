package io;

public class Main {
    public static void main(String[] args) {

        // clase care lucreaza cu fisiere: FileReader, FileWriter
        // putem citi sau scrie in fisier, caracter cu caracter ( cate un caracter pe operatie )
        // exista clase care lucreaza cu bytes, scriu sau citesc cu cate un byte
        // BufferedWriter, BufferedReader
        //                                - fol un buffer care contine un anumit nr de bytes;
        //                                - avem un cos in care punem bytes, nu ducem cosul pana nu este plin
        //                                - cand ajunge la nr de elem maxim, el se goleste => nu mai trebie sa facem apeluri de sistem
        // se face un sg apel de sistem, bytes se pun in buffer, iar urm apel de sistem va fi cand se goleste buffer ul
    }
}
