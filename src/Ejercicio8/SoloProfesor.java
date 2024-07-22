package Ejercicio8;

import java.util.ArrayList;

public class SoloProfesor extends Persona implements Profesor{

    private ArrayList<Curso> cursosImpartidos;
    public SoloProfesor(String nombre, String apellido, byte edad)
    {
        super(nombre, apellido, edad);
        cursosImpartidos = new ArrayList<>();
    }
    @Override
    public void calificarExamen() {

    }

    @Override
    public void asignarTarea() {

    }

    @Override
    public void iniciarSesion() {

    }

    @Override
    public void cerrarSesion() {

    }
}
