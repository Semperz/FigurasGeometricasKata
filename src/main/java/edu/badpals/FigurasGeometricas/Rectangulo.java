package edu.badpals.FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica{
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
}
