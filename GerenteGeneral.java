package com.mycompany.proyecto_poo;

public class GerenteGeneral extends Gerente implements Bonificable {
    public GerenteGeneral(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void realizarTarea() {
        System.out.println(getNombre() + " está gestionando un equipo general.");
    }

    @Override
    public void mostrarBonificacion() {
        System.out.println(getNombre() + " ha recibido una bonificación: " + calcularBonificacion(0.20));  // Bonificación del 20%
    }
}
