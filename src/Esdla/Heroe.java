package Esdla;

import java.util.Random;

public class Heroe extends Soldado {

    public Heroe(String nombre, int puntosVida, int nivelResistencia) {
        super(nombre, puntosVida, nivelResistencia);
    }

    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public void atacar(Soldado enemigo) {
        // El ataque será el mejor lanzamiento entre dos dados de 0 a 100
        Random dado = new Random();
        int tirada1 = dado.nextInt(101);
        int tirada2 = dado.nextInt(101);
        System.out.println("Primer dado: " + tirada1);
        System.out.println("Segundo dado: " + tirada2);
        int maximo =  Math.max(tirada1, tirada2);
        enemigo.recibirAtaque(maximo);
    }

}