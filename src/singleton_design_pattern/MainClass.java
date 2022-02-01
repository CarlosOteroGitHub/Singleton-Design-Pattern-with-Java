/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_design_pattern;

/**
 *
 * @author CarlosOteroRamírez
 */

public class MainClass {
    
    public static void main(String[] args){
        //Procedimiento para invorcar por primera vez el mensaje de la clase "Singleton"
        System.out.println(singleton.getInstance().mensaje);

        //Procedimiento para modificar la variable "mensaje" sin la necesidad de crear otra instancia de objeto.
        singleton.getInstance().mensaje = "Patron de Diseño Singleton 2";
        System.out.println(singleton.getInstance().mensaje);
    }
}

/*

Programa de patrones de diseño que ejemplifica la utilidad de "Singleton"

*/
