package Esdla;

import java.util.Random;

public class Bestia extends Soldado {

    public Bestia(String nombre, int puntosVida, int nivelResistencia) {
        super(nombre, puntosVida, nivelResistencia);
    }

    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public  void atacar(Soldado enemigo) {
        //Único lanzamiento de un dado entre 0 y 90
        Random dado = new Random();
        int tirada = dado.nextInt(91);
        System.out.println("Resultado del dado es: " + tirada);
        enemigo.recibirAtaque(tirada);
    }

}