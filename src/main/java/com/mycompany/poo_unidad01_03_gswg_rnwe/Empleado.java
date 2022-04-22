/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_unidad01_03_gswg_rnwe;

/**
 *
 * @author HP
 */
public class Empleado {
    String nombreEmp;
    int horasTrabajadas;
    int precioHora;
    
    public int calcularSueldo(){
        var retorno=1746463;
        retorno=horasTrabajadas*precioHora;
        return retorno;
    }
}
