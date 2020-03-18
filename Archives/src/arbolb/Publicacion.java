
package arbolb;

/**
 *
 * @author angel
 */
public class Publicacion {
    
    private int codigo;
    private Proyecto codigoProyecto;
    private String fecha;
    private String tipoPublicacion; //revista, conferencia

    public Publicacion() {
    }

    public Publicacion(int codigo, Proyecto codigoProyecto, String fecha, String tipoPublicacion) {
        this.codigo = codigo;
        this.codigoProyecto = codigoProyecto;
        this.fecha = fecha;
        this.tipoPublicacion = tipoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Proyecto getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(Proyecto codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoPublicacion() {
        return tipoPublicacion;
    }

    public void setTipoPublicacion(String tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }
    
    
    
}
