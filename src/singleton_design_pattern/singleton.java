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
public class singleton {

    //Variable para mostrar mensaje.
    public String mensaje;

    //Instancia de Objeto Nula.
    private static singleton instance = null;

    //Constructor para asignar un valor a la variable "mensaje"
    public singleton(){
        mensaje = "Patron de Diseño Singleton 1";
    }

    //Propiedad de la clase para validar la creación de una unica instancia de objeto.
    public static singleton getInstance(){
        if(instance == null){
                instance = new singleton();
        }

        return instance;
    }
}