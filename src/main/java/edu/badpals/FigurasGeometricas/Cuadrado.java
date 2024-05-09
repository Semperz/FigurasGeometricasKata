package edu.badpals.FigurasGeometricas;

public class Cuadrado extends FiguraGeometrica implements Drawable{

    private int lado = 0;


    public Cuadrado(String nombre, int lado) {
        super(nombre);
        this.lado = lado;
    }

    public Cuadrado(int lado) {
        super();
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }


    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }
    @Override
    public void applyTheme() {
        System.out.println("Aplicando un tema a: "+ getNombre());
    }

    @Override
    public void draw() {
        System.out.println("Esto es un: "+ getNombre());
    }
}

