package com.mycompany.proyecto_poo;

public class Desarrollador extends Empleado implements Responsabilidades {
    private String proyecto;

    public Desarrollador(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void realizarTarea() {
        System.out.println(getNombre() + " está desarrollando software.");
    }

    @Override
    public void asignarProyecto(String proyecto) {
        this.proyecto = proyecto;
        System.out.println(getNombre() + " ha asignado el proyecto: " + proyecto);
    }
}
