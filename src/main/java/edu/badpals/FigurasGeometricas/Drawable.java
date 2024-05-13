package edu.badpals.FigurasGeometricas;

public interface Drawable {
    default void applyTheme(){
        throw new UnsupportedOperationException("Operacion applyTheme sin implementar");
    }
    void draw();

}
