package clasesAbastractas;

public abstract class Figura {
    protected String color;

    Figura(String color)
    {
        this.color = color;
    }
    public abstract float area();

    public void printColor()
    {
        System.out.println(color);
    }
}
