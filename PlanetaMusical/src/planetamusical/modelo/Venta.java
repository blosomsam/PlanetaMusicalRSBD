/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetamusical.modelo;

import java.util.Date;

/**
 *
 * @author sandrojc
 */
public class Venta {
    private long   id_venta;
    private Date   fechaVenta;
    private String catidad;
    private String nombreProducto;
    private String valorUnitario;
    private String valorTotalUnitario;
    private String subtotal;
    private String iva12;
    private String descuento;
    private String total;

    
    //Añadiendo metodos set y get
    public long getId_venta() {
        return id_venta;
    }

    public void setId_venta(long id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getCatidad() {
        return catidad;
    }

    public void setCatidad(String catidad) {
        this.catidad = catidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getValorTotalUnitario() {
        return valorTotalUnitario;
    }

    public void setValorTotalUnitario(String valorTotalUnitario) {
        this.valorTotalUnitario = valorTotalUnitario;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getIva12() {
        return iva12;
    }

    public void setIva12(String iva12) {
        this.iva12 = iva12;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}