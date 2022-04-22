/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_unidad01_03_gswg_rnwe;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Profesor {
    String nombre;
    String cedula;
    int añoNacimiento;
    public int calcularEdad(){
          return LocalDate.now().getYear()-this.añoNacimiento;
    }
}
