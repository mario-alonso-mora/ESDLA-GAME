package Esdla;

public abstract class Soldado {

    private String nombre;
    private int puntosVida;
    private int nivelResistencia;

    public Soldado(String nombre, int puntosVida, int nivelResistencia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivelResistencia = nivelResistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaMuerto() {
        return puntosVida <= 0;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void recibirAtaque(int ataque) {
        if (ataque > nivelResistencia)
            puntosVida -= ataque - nivelResistencia;

        if (puntosVida < 0)
            puntosVida = 0; //Evitamos valores negativos
    }

    @Override
    public String toString() {
        return String.format("%s (Vida=%d Armadura=%d)", nombre, puntosVida, nivelResistencia);
    }

    //Este método lo han de sobreescribir Esdla.Heroe y Esdla.Bestia, porque será distinto para cada uno
    public abstract int atacar();

    public abstract void atacar(Soldado enemigo);
}