package Esdla;

import java.util.ArrayList;

public class Ejercito {

    public ArrayList<Soldado> soldados;

    public Ejercito() {
        soldados = new ArrayList<Soldado>();
    }

    public void reclutarSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public Soldado getSoldado(int pos) {
        try {
            return soldados.get(pos);
        }
        catch(Exception e) {
            return null; //No hay soldado en esa posición
        }
    }

    public void comprobarEjercito() {
        int soldadoMuerto = -1; //Posicion de posible soldado muerto
        //Comprobamos si hay alguna baja
        for (int pos = 0; pos < soldados.size(); pos++)
            if (soldados.get(pos).estaMuerto()) //Baja confirmada
                soldadoMuerto = pos; //Guardamos posicion
        /*
         * Para evitar inconsistencias, hay que eliminar al soldado
         * muerto DESPUÉS del bucle for.
         * Si lo eliminasemos DENTRO del bucle for, mientras aún se está
         * recorriendo, se podría producir una excepcion porque el indice
         * que usa el bucle FOR podría ser inconsistente con el nuevo
         * tamaño del ArrayList tras eliminar al soldado.
         */
        if (soldadoMuerto != -1) //Se encontró una baja, hay que eliminar
            soldados.remove(soldadoMuerto);
        //Al eliminar del ArrayList, automáticamente suben una posición los soldados posteriores
    }

    public boolean esDerrotado() {
        //Si ya no quedan soldado, el ejercito ha sido derrotado
        return soldados.size() == 0;
    }
}