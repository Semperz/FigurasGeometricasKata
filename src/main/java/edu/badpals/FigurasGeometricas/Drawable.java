package edu.badpals.FigurasGeometricas;

public interface Drawable {
    default void applyTheme(){
        throw new UnsupportedOperationException();
    }
    void draw();

}
