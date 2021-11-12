import Esdla.*;

public class Main {

    public static void main (String[] args){

        Ejercito heroes = new Ejercito();
        Ejercito bestias = new Ejercito();

        heroes.reclutarSoldado(new Elfos("Legolas", 150, 30));
        heroes.reclutarSoldado(new Humano("Aragorn", 150, 50));
        heroes.reclutarSoldado(new Humano("Boromir",100, 60));
        heroes.reclutarSoldado(new Humano("Gandalf",300, 10));
        heroes.reclutarSoldado(new Hobbits("Frodo", 20, 10));

        bestias.reclutarSoldado(new Orcos("Lurtz", 200, 60));
        bestias.reclutarSoldado(new Orcos("Shagrat", 220, 50));
        bestias.reclutarSoldado(new Trasgo("Uglúk", 120, 30));
        bestias.reclutarSoldado(new Trasgo("Mauhúr", 100, 30));

        Batalla.batallar(heroes, bestias);

    }
}
