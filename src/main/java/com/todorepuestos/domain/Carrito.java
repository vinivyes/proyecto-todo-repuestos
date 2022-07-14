
package com.todorepuestos.domain;

public class Carrito {
    public Repuesto repuesto;
    
    public int cantidad;

    public Carrito() {
    }

    public Carrito(Repuesto repuesto, int cantidad) {
        this.repuesto = repuesto;
        this.cantidad = cantidad;
    }
 
    public double precioTotal() {
        return cantidad * repuesto.precio;
    }
}
