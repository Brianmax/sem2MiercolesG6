package Ejercicio8;

import java.util.ArrayList;

public class EstudianteProfesor extends Persona implements Estudiante, Profesor {
    private ArrayList<Curso> cursos;
    private ArrayList<Curso> cursosImpartidos;

    public EstudianteProfesor(String nombre, String apellido, byte edad, ArrayList<Curso> cursos, ArrayList<Curso> cursosImpartidos)
    {
        super(nombre, apellido, edad);
        this.cursos = cursos;
        this.cursosImpartidos = cursosImpartidos;
    }
    @Override
    public void matricularCurso() {

    }

    @Override
    public void entregarTarea() {

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
