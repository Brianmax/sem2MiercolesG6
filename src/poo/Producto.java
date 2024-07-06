package poo;

import javax.sound.sampled.Port;
// public, private, protected
public class Producto {
    private String nombre;
    private float precio;
    private String tipo;
    private int stock;
    private String descripcion;

    Producto(String nombre, float precio, String tipo)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }
    Producto(String nombre, String tipo)
    {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    Producto(String nombre, float precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }
    Producto()
    {

    }
    // metodo que me retorna el valor del precio despues
    // de aplicar un descuento
    public float aplicarDescuento(float porcentaje)
    {
        float newPrecio = precio - precio * porcentaje/100;
        return newPrecio;
    }
    // metodos getters y setters

    public String getNombre()
    {
        return nombre;
    }
    public float getPrecio()
    {
        return precio;
    }
    public String getTipo()
    {
        return tipo;
    }
    public int getStock()
    {
        return stock;
    }
    public String getDescripcion()
    {
        return descripcion;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setPrecio(float precio)
    {
        this.precio = precio;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
}
