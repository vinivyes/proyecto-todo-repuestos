
package com.todorepuestos.domain;

public class Carrito {
    private Repuesto repuesto;
    
    private int cantidad;

    public Carrito() {
    }

    public Carrito(Repuesto repuesto, int cantidad) {
        this.repuesto = repuesto;
        this.cantidad = cantidad;
    }
    
}
