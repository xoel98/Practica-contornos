/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap_86º;

import java.util.Objects;

/**
 *
 * @author dam109
 */
public class Persona {
    
    String DNI;
    String nombre;
    String direccion;
    String telefono;
    
    public Persona(String DNI, String nombre, String direccion, String telefono){
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean igual = false;
        Persona temp = (Persona) obj;
        
        if (obj == null) {
            igual = false;
        }
        if (obj.getClass() != this.getClass()) {
            igual = false;
        }
        if (temp.getDNI().equals(this.getDNI())) {
            igual = true;
        }
        return igual;
    }

    public int compareTo(Object o) {
        final int ANTES = -1;
        final int IGUAL = 0;
        final int DESPUES = 1;
        
        Persona persona = (Persona) o;
        if (this.getDNI().compareToIgnoreCase(persona.getDNI()) == 0){
            return IGUAL;
        }
        else if (this.getDNI().compareToIgnoreCase(persona.getDNI()) == -1){
            return ANTES;
        }else{
            return DESPUES;
        }
        
    }
}
