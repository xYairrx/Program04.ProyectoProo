/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;


/**
 *
 * @author Yair
 */
public class ProyectoPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta001 = new Cuenta("Yair", "Almanza", 20, 1000.0);
        
        Cuenta cuenta002 = new Cuenta();
        cuenta002.setNombre("Ernesto");
        cuenta002.setApellido("Guzmán");
        cuenta002.setEdad(21);
        cuenta002.setCantidad(489.2);
        
        System.out.println("Nombre: " + cuenta002.getNombre());
        System.out.println("Apellido: " + cuenta002.getApellido());
        System.out.println("Edad: " + cuenta002.getEdad());
        System.out.println("Cantidad: " + cuenta002.getCantidad());
        
        
    }
    
}
