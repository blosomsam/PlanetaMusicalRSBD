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
public class Producto {
    private Long   id_producto;
    private String nombreProducto;
    private String cantidadProducto;
    private String tipoProducto;
    private String generoPelicula;
    private String generoMusical;
    private String autorArtista;
    private String formato;
    private Date   fechaLanzamiento;
    private String precioCompra;
    private String precioVenta;

    //añadiendo métodos set y get
    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCatidad() {
        return cantidadProducto;
    }

    public void setCatidad(String catidad) {
        this.cantidadProducto = catidad;
    }

    public String getTipo() {
        return tipoProducto;
    }

    public void setTipo(String tipo) {
        this.tipoProducto = tipo;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getAutorArtista() {
        return autorArtista;
    }

    public void setAutorArtista(String autorArtista) {
        this.autorArtista = autorArtista;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }
}