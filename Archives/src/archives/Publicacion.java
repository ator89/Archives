
package archives;

/**
 *
 * @author angel
 */
public class Publicacion {
    
    private int codigo;
    private int codigoProyecto;
    private String fecha;
    private String tipoPublicacion; //revista, conferencia

    public Publicacion() {
    }

    public Publicacion(int codigo, int codigoProyecto, String fecha, String tipoPublicacion) {
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

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
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
