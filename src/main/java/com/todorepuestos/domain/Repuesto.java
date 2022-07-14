/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todorepuestos.domain;

/**
 *
 * @author Administrator
 */
public class Repuesto {
    
    private Long idRepuesto;
    
    private Marca marca;
    
    private String nombre;
    private String imagen_url;
    private String descripcion;

    public Repuesto() {
    }

    public Repuesto(Marca marca, String nombre, String imagen_url, String descripcion) {
        this.marca = marca;
        this.nombre = nombre;
        this.imagen_url = imagen_url;
        this.descripcion = descripcion;
    }    
}
