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
public class Cuenta {
    private long   id_cuenta;
    private String nombreUsuario;
    private String clave;
    private Date   fechaCreacion;
    private Date   fechaModificacion;
    private String estado;

    //Añadiendo métodos set y get
    public long getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(long id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
