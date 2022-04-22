/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_unidad01_03_gswg_rnwe;

/**
 *
 * @author HP
 */
public class Carrera {
    String nombreCarrera;
    int numeroHoras;
    int numeroAlumnos;
    public int cantidadMaximaAlumnos(){
        var retorno=numeroAlumnos;
        if (numeroAlumnos>0 && numeroAlumnos<=120){
            return retorno;
        }else{
            if(numeroAlumnos>120){
               return retorno; 
            }
        }    
        return retorno;
    }
}
