
package com.todorepuestos.domain;

public class Marca {
    private Long idMarca;
    
    public String nombre;
    public String logo_url;
    public String descripcion;

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
