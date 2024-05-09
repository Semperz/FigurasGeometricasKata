package edu.badpals.FigurasGeometricas;

public class Elipse extends FiguraGeometrica implements Drawable{
    private double ejeMayor=0d;
    private double ejeMenor=0d;

    public Elipse(String nombre, double ejeMenor, double ejeMayor) {
        super(nombre);
        this.ejeMenor = ejeMenor;
        this.ejeMayor = ejeMayor;
    }

    public Elipse(double ejeMenor, double ejeMayor) {
        super();
        this.ejeMenor = ejeMenor;
        this.ejeMayor = ejeMayor;
    }

    public double getEjeMayor() {
        return ejeMayor;
    }

    public double getEjeMenor() {
        return ejeMenor;
    }


    @Override
    public double area() {
        return Math.PI*getEjeMayor()*getEjeMenor();
    }


    @Override
    public void draw() {
        System.out.println("Esto es un: "+ getNombre());
    }
}

