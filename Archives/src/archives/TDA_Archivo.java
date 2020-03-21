
package archives;

import java.io.File;

/**
 *
 * @author angel
 */
public class TDA_Archivo {
    
    File archivo = null;

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
