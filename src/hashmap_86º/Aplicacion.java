/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap_86º;

/**
 *
 * @author dam109
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.añadir(new Persona("12345678A", "Andrea", "Santiago", "612345678"));
        lista.añadir(new Persona("12345678B", "Maria", "Lugo", "612345670"));
        lista.añadir(new Persona("12345678C", "Juan", "Vigo", "612345679"));
        
        lista.listarPersonas1();
        System.out.println();
        System.out.println(lista.obtener("12345678C"));
        System.out.println();
        lista.mostrarClaveYValor();
    }
    
}
