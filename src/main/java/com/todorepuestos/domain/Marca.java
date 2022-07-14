
package com.todorepuestos.domain;

public class Marca {
    private Long idMarca;
    
    private String nombre;
    private String logo_url;
    private String descripcion;

    public Marca() {
    }

    public Marca(String nombre) {
        this.nombre = nombre;
    }
    
    public Marca(String nombre, String logo_url, String descripcion) {
        this.nombre = nombre;
        this.logo_url = logo_url;
        this.descripcion = descripcion;
    }
    
}
