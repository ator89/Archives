
package archives;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class AdminArchivo {
    
    String filee = "";
    
    TDA_Archivo file = new TDA_Archivo(filee);
    
    private static RandomAccessFile flujo;
    private static int numeroRegistros; //datos de cuantas personas se han guardado
    private static int tamanioRegistro = 80;
    ArrayList<Investigador> listaInvestigador = new ArrayList();
    ArrayList<Carrera> listaCarrera = new ArrayList();
    ArrayList<Proyecto> listaProyecto = new ArrayList();
    ArrayList<Publicacion> listaPublicacion = new ArrayList();
     
    //crear un flujo sobre archivo determinado
    public static void crearFileAlumno(File archivo) throws IOException{
        if(archivo.exists() && !archivo.isFile()){
            throw new IOException(archivo.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(archivo, "rw");
        numeroRegistros = (int)Math.ceil((double)flujo.length()/(double)tamanioRegistro);
    }
    
    public static void cerrar() throws IOException{
        flujo.close();
    }
    
    public void agregarInvestigador(Investigador inv) throws IOException{
        this.listaInvestigador.add(inv);
    }
    
    public static int getNumeroRegistros(){
        return numeroRegistros;
    }
    
    public static Investigador getInvestigador(int i) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            flujo.seek(i * tamanioRegistro);
            return new Investigador(flujo.readInt(), flujo.readUTF(), flujo.readUTF(), flujo.readUTF(), flujo.readBoolean());
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
    }
    
}
