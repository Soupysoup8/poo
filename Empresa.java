
package com.mycompany.proyecto_poo;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarTareasEmpleados() {
        for (Empleado emp : empleados) {
            emp.realizarTarea();
        }
    }
}
