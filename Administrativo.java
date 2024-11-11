package com.mycompany.proyecto_poo;

public class Administrativo extends Empleado implements Responsabilidades {
    private String proyecto;

    public Administrativo(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void realizarTarea() {
        System.out.println(getNombre() + " está gestionando tareas administrativas.");
    }

    @Override
    public void asignarProyecto(String proyecto) {
        this.proyecto = proyecto;
        System.out.println(getNombre() + " ha asignado el proyecto: " + proyecto);
    }
}
