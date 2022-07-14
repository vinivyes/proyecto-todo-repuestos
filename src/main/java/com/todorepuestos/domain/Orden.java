
package com.todorepuestos.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Orden implements Serializable{
    
    private Long idOrden;
    
    private Date fechaPedido;
    
    private String correoElectronico;
    
    private String estado;

    private Date fechaEntrega;
    
    private Date ultimaActualizacion;
    
    private List<Repuesto> repuestos;
    
    private String tipoEntrega;
    
    private String direccionEntrega;
    
    private Long idTallerEntrega;
    
    private String metodoPago;
     
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
