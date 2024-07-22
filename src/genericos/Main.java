package genericos;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(19);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Hola");

        Punto2D punto2D = new Punto2D(4,6);

        Punto2DF punto2DF = new Punto2DF(42.3f, 76.3f);

        Punto2DS punto2DS = new Punto2DS("Hola", "mundo");


        Punto2D<Integer, Integer> puntoGenerico = new Punto2D<>(3,4);
        Punto2D<Float, Integer> puntoGenerico2 = new Punto2D<>(2.3f, 32);

        //
    }
}
