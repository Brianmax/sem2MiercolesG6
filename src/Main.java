import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int a = 3;
//        while (a < 20)
//        {
//            System.out.println("Hola a todos");
//            a++;
//        }
        int[] array = {2,224,23,45};
        int[] array2 = new int[7];

        for(int i = 0; i < array.length ; i++)
        {
            System.out.println(array[i]);
        }
        // while
        // iterar el array usando el bucle while
        System.out.println("++++++++++++++++++++++++");
        int a = 0;
        int tamanio = array.length;
        while(a < tamanio)
        {
            System.out.println(array[a]);
            a++;
        }
        System.out.println("_________________________");
        // array dinamico
        ArrayList<Integer> arrayDinamico = new ArrayList<>();

        arrayDinamico.add(14);
        arrayDinamico.add(5);
        arrayDinamico.add(9);

        System.out.println(arrayDinamico);

        System.out.println(arrayDinamico.get(1));

        arrayDinamico.remove(1);

        System.out.println(arrayDinamico.get(1));
        Collections.sort(arrayDinamico);

        System.out.println(arrayDinamico);

        // strings como arrays

        String nombre1 = "George";
        String nombre2 = "George";
        System.out.println(nombre1.charAt(2));
        // char != String

        // comparar strings

        System.out.println(nombre1.equals(nombre2));
        System.out.println(nombre1.startsWith("G"));
        System.out.println(nombre1.substring(2));
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        linkedList.add(19);
//        linkedList.add(7);

        // matrices
        System.out.println("______________________");
        int[][] matriz = {{1,2,3}, {2,42,3}, {9,48,3}};

        for (int i = 0; i < matriz.length; i++)
        {
            int[] arr = matriz[i];
            for (int e = 0; e < arr.length; e++)
            {
                System.out.println(matriz[i][e]);
            }
        }
        //
    }
}