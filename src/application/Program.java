package application;

import entities.Carro;
import entities.Pista;
import services.Corrida;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        Carro c1 = new Carro("Ferrari");
        Carro c2 = new Carro("McLaren");
        Pista pista = new Pista(20);

        Corrida corrida = new Corrida();

        do {

            corrida.gerarVelocidadeAleatoria(c1, c2);
            corrida.atualizarCorrida(c1, c2, pista);

            Thread.sleep(800);
        } while(c1.getDistancia() < pista.getTamanho() && c2.getDistancia() < pista.getTamanho());

        corrida.relatorioCorrida(c1, c2, pista);
    }
}
