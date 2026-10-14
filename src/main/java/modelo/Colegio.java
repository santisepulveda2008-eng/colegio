/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author santi
 */

import java.util.ArrayList;

public class Colegio {

    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;

    public Colegio() {
        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
    }
        public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
        public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }
}
