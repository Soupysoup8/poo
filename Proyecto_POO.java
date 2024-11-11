package com.mycompany.proyecto_poo;

public class Proyecto_POO {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        try {
            Empleado desarrolladorBackend = new DesarrolladorBackend("Carlos", 28, 55000);
            Empleado desarrolladorFrontend = new DesarrolladorFrontend("Laura", 25, 52000);
            Empleado desarrolladorFullstack = new DesarrolladorFullstack("Juan", 30, 60000);
            Empleado gerenteProyecto = new GerenteProyecto("Ana", 40, 70000);
            Empleado gerenteGeneral = new GerenteGeneral("María", 45, 90000);
            Empleado gerenteRH = new GerenteRecursosHumanos("Pedro", 38, 65000);
            Empleado asistenteAdministrativo = new AdministrativoAsistente("Sofía", 32, 28000);
            Empleado contadorAdministrativo = new AdministrativoContador("José", 50, 40000);
            Empleado recepcionistaAdministrativo = new AdministrativoRecepcion("Marta", 29, 27000);

            empresa.agregarEmpleado(desarrolladorBackend);
            empresa.agregarEmpleado(desarrolladorFrontend);
            empresa.agregarEmpleado(desarrolladorFullstack);
            empresa.agregarEmpleado(gerenteProyecto);
            empresa.agregarEmpleado(gerenteGeneral);
            empresa.agregarEmpleado(gerenteRH);
            empresa.agregarEmpleado(asistenteAdministrativo);
            empresa.agregarEmpleado(contadorAdministrativo);
            empresa.agregarEmpleado(recepcionistaAdministrativo);

            // Mostramos las tareas de cada empleado
            empresa.mostrarTareasEmpleados();

            // Mostrar las bonificaciones si se aplican
            if (gerenteProyecto instanceof Bonificable) {
                ((Bonificable) gerenteProyecto).mostrarBonificacion();
            }
            if (gerenteGeneral instanceof Bonificable) {
                ((Bonificable) gerenteGeneral).mostrarBonificacion();
            }
            if (gerenteRH instanceof Bonificable) {
                ((Bonificable) gerenteRH).mostrarBonificacion();
            }
            if (desarrolladorBackend instanceof Bonificable) {
                ((Bonificable) desarrolladorBackend).mostrarBonificacion();
            }
            if (desarrolladorFrontend instanceof Bonificable) {
                ((Bonificable) desarrolladorFrontend).mostrarBonificacion();
            }
            if (desarrolladorFullstack instanceof Bonificable) {
                ((Bonificable) desarrolladorFullstack).mostrarBonificacion();
            }
            if (asistenteAdministrativo instanceof Bonificable) {
                ((Bonificable) asistenteAdministrativo).mostrarBonificacion();
            }
            if (contadorAdministrativo instanceof Bonificable) {
                ((Bonificable) contadorAdministrativo).mostrarBonificacion();
            }
            if (recepcionistaAdministrativo instanceof Bonificable) {
                ((Bonificable) recepcionistaAdministrativo).mostrarBonificacion();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
