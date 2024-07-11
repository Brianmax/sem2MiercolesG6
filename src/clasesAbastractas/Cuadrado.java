package clasesAbastractas;

public class Cuadrado extends Figura {
    private float lado;

    Cuadrado(String color, float  lado) {
        super(color);
        this.lado = lado;
    }
    @Override
    public float area() {
        return lado * lado;
    }
}
