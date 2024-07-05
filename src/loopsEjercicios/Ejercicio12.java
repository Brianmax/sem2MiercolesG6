package loopsEjercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        String cadena = "Hola a todos";
        char letra = 't';
        String letra2 = "t";
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++)
        {
            if (letra == cadena.charAt(i))
            {
                contador++;
            }
        }
        System.out.println("Repeticiones: " + contador);
    }
}
