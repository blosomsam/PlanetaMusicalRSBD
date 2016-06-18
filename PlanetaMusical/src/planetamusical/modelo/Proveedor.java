package planetamusical.modelo;
import java.util.Date;

/**
 * @author sandrojc
 */
public class Proveedor {

    private long   id_proveedor;
    private String nombresProveedor;
    private String apellidosProveedor;
    private String cedulaProveedor;
    private String direccionProveedor;
    private String nombreEmpresa;
    private String telefonoCelularProveedor;
    private String telefonoCasaProveedor;
    private String correrElectronicoProveedor;
    private Date   FechaRegistroProveedor;

    public long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombresProveedor() {
        return nombresProveedor;
    }

    public void setNombresProveedor(String nombresProveedor) {
        this.nombresProveedor = nombresProveedor;
    }

    public String getApellidosProveedor() {
        return apellidosProveedor;
    }

    public void setApellidosProveedor(String apellidosProveedor) {
        this.apellidosProveedor = apellidosProveedor;
    }

    public String getCedulaProveedor() {
        return cedulaProveedor;
    }

    public void setCedulaProveedor(String cedulaProveedor) {
        this.cedulaProveedor = cedulaProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoCelularProveedor() {
        return telefonoCelularProveedor;
    }

    public void setTelefonoCelularProveedor(String telefonoCelularProveedor) {
        this.telefonoCelularProveedor = telefonoCelularProveedor;
    }

    public String getTelefonoCasaProveedor() {
        return telefonoCasaProveedor;
    }

    public void setTelefonoCasaProveedor(String telefonoCasaProveedor) {
        this.telefonoCasaProveedor = telefonoCasaProveedor;
    }

    public String getCorrerElectronicoProveedor() {
        return correrElectronicoProveedor;
    }

    public void setCorrerElectronicoProveedor(String correrElectronicoProveedor) {
        this.correrElectronicoProveedor = correrElectronicoProveedor;
    }

    public Date getFechaRegistroProveedor() {
        return FechaRegistroProveedor;
    }

    public void setFechaRegistroProveedor(Date FechaRegistroProveedor) {
        this.FechaRegistroProveedor = FechaRegistroProveedor;
    }
}