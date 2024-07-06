package poo;

public class Jugador {
    // atributos
    String nombre;
    String nacionalidad;
    String equipo;
    int edad;

    public Jugador(String nombre, String nacionalidad, String equipo, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.equipo = equipo;
        this.edad = edad;
    }

    public Jugador() {
    }

    // metodos
    public void patear()
    {
        System.out.println("Pateando");
    }
    public void descansar()
    {
        System.out.println("Descansando");
    }
    // crear una clase Computadora
    // atributos: precio, almacenamiento, ram, procesador
    // instanciar y dar valores a cada atributo


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
