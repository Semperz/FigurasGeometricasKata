package edu.badpals.FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica implements Drawable{
    private int vertical = 0;
    private int horizontal = 0;

    public Rectangulo(String nombre, int vertical, int horizontal) {
        super(nombre);
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public Rectangulo(int vertical, int horizontal) {
        super();
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    @Override
    public double area() {
        return (double) getHorizontal()*getVertical();
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

