
package archives;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class TDA_Archivo {
    
    File archivo = null;
    ArrayList<Investigador> listaInv = new ArrayList();

    public TDA_Archivo(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
}
