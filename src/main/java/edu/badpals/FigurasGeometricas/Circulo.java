package edu.badpals.FigurasGeometricas;

public class Circulo extends FiguraGeometrica{
    private double radio=0d;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public Circulo(double radio) {
        super();
        this.radio=radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }
}
