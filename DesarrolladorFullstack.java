package com.mycompany.proyecto_poo;

public class DesarrolladorFullstack extends Desarrollador {
    public DesarrolladorFullstack(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void realizarTarea() {
        System.out.println(getNombre() + " está desarrollando tanto frontend como backend.");
    }

    @Override
    public void mostrarBonificacion() {
        System.out.println(getNombre() + " ha recibido una bonificación: " + calcularBonificacion(0.15));  // Bonificación del 15%
    }
}
