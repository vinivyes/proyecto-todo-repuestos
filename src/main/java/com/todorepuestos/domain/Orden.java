
package com.todorepuestos.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Orden implements Serializable{
    
    public Long idOrden;
    
    public Date fechaPedido;
    
    public String correoElectronico;
    
    public String estado;

    public Date fechaEntrega;
    
    public Date ultimaActualizacion;
    
    public List<Repuesto> repuestos;
    
    public String tipoEntrega;
    
    public String direccionEntrega;
    
    public Long idTallerEntrega;
    
    public String metodoPago;
     
    public Orden() {
    }

    public Orden(Date fechaPedido, String correoElectronico, String estado, Date fechaEntrega, Date ultimaActualizacion, List<Repuesto> repuestos, String tipoEntrega, String direccionEntrega, Long idTallerEntrega, String metodoPago) {
        this.fechaPedido = fechaPedido;
        this.correoElectronico = correoElectronico;
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
        this.ultimaActualizacion = ultimaActualizacion;
        this.repuestos = repuestos;
        this.tipoEntrega = tipoEntrega;
        this.direccionEntrega = direccionEntrega;
        this.idTallerEntrega = idTallerEntrega;
        this.metodoPago = metodoPago;
    }
    
}
