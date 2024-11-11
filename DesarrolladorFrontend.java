package com.mycompany.proyecto_poo;

public class DesarrolladorFrontend extends Desarrollador {
    public DesarrolladorFrontend(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void realizarTarea() {
        System.out.println(getNombre() + " está desarrollando el frontend.");
    }

    @Override
    public void mostrarBonificacion() {
        System.out.println(getNombre() + " ha recibido una bonificación: " + calcularBonificacion(0.10));  // Bonificación del 10%
    }
}
