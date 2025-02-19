package org.example;

public class Aviao implements Voador {
    String modelo;
    double velocidaKmPorHora;

    public Aviao(String modelo, double velocidaKmPorHora) {
        this.modelo = modelo;
        this.velocidaKmPorHora = velocidaKmPorHora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidaKmPorHora() {
        return velocidaKmPorHora;
    }

    public void setVelocidaKmPorHora(double velocidaKmPorHora) {
        this.velocidaKmPorHora = velocidaKmPorHora;
    }


    @Override
    public double voar() {
        System.out.println("Voando a velocidade de:");
        return 800.00;

    }

    @Override
    public void planar() {
        System.out.println("Planando");

    }

    @Override
    public boolean pousar() {
        System.out.println("não está pousando");
        return false;
    }
}
