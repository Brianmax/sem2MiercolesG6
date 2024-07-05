package loopsEjercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Ingrese el valor de n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != 1)
        {
            if (n % 2 == 0)
            {
                n /= 2;
            }
            else {
                n = n * 3 + 1;
            }
            System.out.println(n);
        }
    }
}
