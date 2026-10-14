/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author santi
 */
import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;
    
    public Persona() {
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String obtenerResumen() {
    return "Nombre: " + nombre
                + " | Dirección: " + direccion
                + " | Teléfono: " + telefono
                + " | Nacimiento: " + fechaNacimiento;
    }
}