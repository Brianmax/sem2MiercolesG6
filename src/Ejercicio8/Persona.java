package Ejercicio8;

public abstract class Persona implements Usuario {
    protected String nombre;
    protected String apellido;
    protected byte edad;

    public Persona(String nombre, String apellido, byte edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
