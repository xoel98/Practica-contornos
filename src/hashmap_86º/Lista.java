/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap_86º;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author dam109
 */
public class Lista {
    private HashMap lista = new HashMap();
    
    public void añadir(Persona p){
        String clave = p.getDNI();
        lista.put(clave, p);
    }
    
    public void listarPersonas1(){
        Persona[]datos=this.obtenerTabla();
            for(Persona i:datos){
                System.out.println(i.toString());
            }
    }

    private Persona[] obtenerTabla() {
        Collection valores = this.lista.values();
        
        Persona[] tabla = new Persona[0];
            tabla= (Persona[])valores.toArray(tabla);
        return tabla;
    }
    
    public Persona obtener(String clave){
        if( lista.containsKey(clave)){
            return (Persona)lista.get(clave);
        }
        else return null;
    }
    
    public void eliminar(String clave){
        if(lista.containsKey(clave)){
            lista.remove(clave);
        }
        else{
            System.out.println("No existe ninguna persona con ese DNI");
        }    
    }
    
    public void borrarLista(){
        lista.clear();
    }
    
    public Object[] listarClaves (){
        Set conjunto = lista.keySet();
        return conjunto.toArray();
    }
    
    public void mostrarClaveYValor(){
        System.out.println("Mostrar clave y valor");
        System.out.println(lista.entrySet());
    
    }
    
    public void modificar(String DNI, String nombre){
        Persona p;
        if(lista.containsKey(DNI)){
            p=(Persona)lista.get(DNI);
            System.out.println("refer obtenida =>");
            System.out.println("=> "+p.toString());
            p.setNombre(nombre); //modifico
            System.out.println(" "+p.getDNI()+" "+p.getNombre());
            System.out.println("refer objeto modificado =>");
        }
    }
    
}
