package poo;

public class Main {
    public static void main(String[] args) {
        // creando una instancia de la clase jugador
        // creando un objeto de la clase jugador

        Jugador jugador1 = new Jugador();
        jugador1.nombre = "George";
        jugador1.nacionalidad = "Peruano";
        jugador1.equipo = "equipo 1";
        jugador1.edad = 18;
        Jugador jugador2 = new Jugador();

        jugador1.patear();
    }
}
