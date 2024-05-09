package edu.badpals.FigurasGeometricas;

public class Circulo extends FiguraGeometrica implements Drawable{
    private double radio=0d;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public Circulo(double radio) {
        super();
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(getRadio(),2);
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
