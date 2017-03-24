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
public class Principal {

    
    public static void main(String[] args) {
        Trigonometricas trigo=new Trigonometricas();
        Interfaz miInterfaz=new Interfaz();
        miInterfaz.setVisible(true);
        miInterfaz.funciones=trigo;
    }
    
}
