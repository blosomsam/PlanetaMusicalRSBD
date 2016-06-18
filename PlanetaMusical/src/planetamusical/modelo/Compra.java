package planetamusical.modelo;
import java.util.Date;

/**
 * @author sandrojc
*/

public class Compra {
    private long   id_compra;
    private Date   fechaCompra;
    private Date   fechaIngresoCompra;
    private String descripcionCompra;
    private String totalProductos; 
    private String valorTotalCompra;
    
    public long getId_compra() {
        return id_compra;
    }

    public void setId_compra(long id_compra) {
        this.id_compra = id_compra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaIngresoCompra() {
        return fechaIngresoCompra;
    }

    public void setFechaIngresoCompra(Date fechaIngresoCompra) {
        this.fechaIngresoCompra = fechaIngresoCompra;
    }

    public String getDescripcionCompra() {
        return descripcionCompra;
    }

    public void setDescripcionCompra(String descripcionCompra) {
        this.descripcionCompra = descripcionCompra;
    }

    public String getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(String totalProductos) {
        this.totalProductos = totalProductos;
    }

    public String getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(String valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }   
}
