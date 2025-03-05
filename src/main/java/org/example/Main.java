package areaPraticar.POO.Ppolimorfismo.Test;
import areaPraticar.POO.Exercicios.Raquel.Aviao;
import areaPraticar.POO.Exercicios.Raquel.Drone;
import areaPraticar.POO.Exercicios.Raquel.GalinhaVoadora;
import areaPraticar.POO.Exercicios.Raquel.Voador;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Voador[] voadores = new Voador[10];
        Random random = new Random();

        for (int i = 0; i < voadores.length; i++) {
            int tipo = random.nextInt(3);
            if (tipo == 0) {
                voadores[i] = new GalinhaVoadora();
            } else if (tipo == 1) {
                voadores[i] = new Drone();
            } else {
                voadores[i] = new Aviao();
            }
        }

        for (Voador v : voadores) {
            // Chamada polimórfica
            v.voar();
            // Chamada polimórfica
            v.planar();
            // Chamada polimórfica
            v.pousar();
            System.out.println("----------------------");

        }
    }
}


