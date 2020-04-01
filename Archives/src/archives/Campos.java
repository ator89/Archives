
package archives;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class Campos implements Serializable{
    
    String nombre;
    int edad;
    long telefono;

    public Campos() {
    }

    public Campos(String nombre, int edad, long telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    
}
