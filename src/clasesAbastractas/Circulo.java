package clasesAbastractas;

public class Circulo extends Figura {
    private float radio;

    Circulo(String color, float radio)
    {
        super(color);
        this.radio = radio;
    }
    @Override
    public float area()
    {
        return 3.14f * radio * radio;
    }
}
