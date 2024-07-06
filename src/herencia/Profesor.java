package herencia;

public class Profesor extends Persona{
    private float salario;

    Profesor(String nombre, String apellido, float salario)
    {
        super(nombre, apellido);
        this.salario = salario;
    }
}
