/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratrigonometricas;

/**
 *
 * @author Estudiantes
 */
public class Trigonometricas {
    double angulo;
    double angradianes;
    //= Math.toRadians(angulo);
    
    public double seno(){
        angradianes= Math.toRadians(angulo);
        return Math.sin(angulo);
    }
    public double coseno(){
        angradianes= Math.toRadians(angulo);
        return Math.cos(angulo);
    }
    public double tangente(){
        angradianes= Math.toRadians(angulo);
        return Math.tan(angulo);
    }
    
}
