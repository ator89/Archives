
package archives;

/**
 *
 * @author angel
 */
public class Proyecto {
    private int codigo;
    private String tema;
    private Investigador codigoInvestigador;
    private String fechaInicio;
    private String fechaFinal;
    private String estado; //iniciado, enviado, publicado, rechazado

    public Proyecto() {
    }

    public Proyecto(int codigo, String tema, Investigador codigoInvestigador, String fechaInicio, String fechaFinal, String estado) {
        this.codigo = codigo;
        this.tema = tema;
        this.codigoInvestigador = codigoInvestigador;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Investigador getCodigoInvestigador() {
        return codigoInvestigador;
    }

    public void setCodigoInvestigador(Investigador codigoInvestigador) {
        this.codigoInvestigador = codigoInvestigador;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
