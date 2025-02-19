package org.example;

public class MainTest {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Latam", 800.00);
        aviao.planar();
        System.out.println();
        System.out.println(aviao.voar());
        System.out.println(aviao.pousar());



    }

}
