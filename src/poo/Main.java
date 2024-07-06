package poo;

import java.util.function.Predicate;

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

        Producto producto1 = new Producto("Laptop hp", "Electrodomestico");

        Producto producto3 = new Producto("Macbook", 2.4f);
        int a = 10;
        float b = 12.4f;
        System.out.println("_________________");
        System.out.println(a);
        System.out.println(producto3);
        System.out.println("_________________");

        float precioFinal = producto1.aplicarDescuento(20);
        System.out.println(precioFinal);
    }
}
