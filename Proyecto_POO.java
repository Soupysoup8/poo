package com.mycompany.proyecto_poo;

public class Proyecto_POO {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        try {
            // Instanciamos distintos tipos de empleados
            Empleado desarrolladorFullstack = new DesarrolladorFullstack("Juan", 30, 50000);
            Empleado gerenteProyecto = new GerenteProyecto("Ana", 40, 70000);
            Empleado administrativo = new Administrativo("Luis", 35, 30000);

            // Agregamos empleados a la empresa
            empresa.agregarEmpleado(desarrolladorFullstack);
            empresa.agregarEmpleado(gerenteProyecto);
            empresa.agregarEmpleado(administrativo);

            // Mostramos las tareas de cada empleado
            empresa.mostrarTareasEmpleados();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}