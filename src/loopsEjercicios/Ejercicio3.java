package loopsEjercicios;

public class Ejercicio3 {
    public static void main(String[] args) {
        // forma 1
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) // veficando si es par
            {
                System.out.println(i);
            }
        }
        // forma 2
        for (int i = 2; i <= 100; i += 2)
        {
            System.out.println(i);
        }
    }
}
