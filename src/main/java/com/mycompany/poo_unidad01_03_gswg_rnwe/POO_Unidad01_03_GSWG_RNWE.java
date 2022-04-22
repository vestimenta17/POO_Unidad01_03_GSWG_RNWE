/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_unidad01_03_gswg_rnwe;

/**
 *
 * @author HP
 */
public class POO_Unidad01_03_GSWG_RNWE {

    public static void main(String[] args) {
        var asignatura= new Asignatura();
        asignatura.nombreAsignatura="Matematicas";
        asignatura.creditos=120;
        var carrera= new Carrera();
        carrera.nombreCarrera="Derecho";
        carrera.numeroAlumnos=100;
        carrera.numeroHoras=120;
        var maestro= new Profesor();
        maestro.nombre="Felix";
        maestro.cedula="0105472471";
        maestro.añoNacimiento=1979;
        System.out.println("La edad que tiene es:"+maestro.calcularEdad()+" años");
        System.out.println("El numero maximo de alumnos es:"+carrera.cantidadMaximaAlumnos());
        var secciones= new Departamento();
        secciones.nombreDep="Recursos Humanos";
        secciones.codigo=1254;
        secciones.numeroEmpleados=3;
        var trabajador= new Empleado();
        trabajador.nombreEmp="Juan";
        trabajador.horasTrabajadas=18;
        trabajador.precioHora=3;
        System.out.println("El sueldo es:"+trabajador.calcularSueldo()+" Dolares");

        
        
                
    }
}
