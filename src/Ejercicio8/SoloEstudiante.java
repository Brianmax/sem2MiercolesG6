package Ejercicio8;

import java.util.ArrayList;

public class SoloEstudiante extends Persona implements Estudiante{
    private ArrayList<Curso> cursos;

    public SoloEstudiante(String nombre, String apellido, byte edad)
    {
        super(nombre, apellido, edad);
        cursos = new ArrayList<>();
    }
    @Override
    public void matricularCurso() {

    }

    @Override
    public void entregarTarea() {

    }

    @Override
    public void iniciarSesion() {

    }

    @Override
    public void cerrarSesion() {

    }
}
