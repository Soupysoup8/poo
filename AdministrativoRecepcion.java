package com.mycompany.proyecto_poo;

public class AdministrativoRecepcion extends Administrativo {
    public DesarrolladorBackend(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void realizarTarea() {
        System.out.println(getNombre() + " está desarrollando el backend.");
    }

    @Override
    public void mostrarBonificacion() {
        System.out.println(getNombre() + " ha recibido una bonificación: " + calcularBonificacion(0.12));  // Bonificación del 12%
    }
}