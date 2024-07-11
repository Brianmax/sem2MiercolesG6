package clasesAbastractas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Rojo", 15);
        Circulo circulo = new Circulo("Azul", 13.5f);

        System.out.println(cuadrado.area());
        System.out.println(circulo.area());

        Figura figura1 = new Cuadrado("Amarillo", 20);
        Figura figura2 = new Circulo("Verde", 3.5f);

        ArrayList<Figura> arrayList = new ArrayList<>();

        System.out.println(figura1);
    }
}
