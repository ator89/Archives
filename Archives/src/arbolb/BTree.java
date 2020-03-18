
package arbolb;

/**
 *
 * @author angel
 */
public class BTree {
    
    private MiClave lista;// Auxiliar para insertar claves
    private BTreeNode listapunt;// Auxiliar para insertar claves
    private int nClaves;// Número de claves por nodo
    private int nodosMinimos;// Número de punteros mínimos para cada nodo que no sea hoja
    private BTreeNode root;// Puntero a nodo de entrada en el árbol
    
    //Funciones auxiliares internas
    
    private void insert(BTreeNode key, BTreeNode node, BTreeNode hijo1, BTreeNode hijo2){}
    
    private void BorrarClave(MiClave clave, BTreeNode nodo, BTreeNode hijo1, BTreeNode hijo2){}
    
    private void BorrarNodo(BTreeNode nodo){}
    
    private void PasarClaveDerecha(BTreeNode derecha, BTreeNode nodo, BTreeNode padre, int posClavePadre){}
    
    private void PasarClaveIzquierda(BTreeNode izquierda, BTreeNode nodo, BTreeNode padre, int posClavePadre){}
    
    private void FundirNodo(BTreeNode izquierda, BTreeNode padre, BTreeNode derecha, int posClavePadre){}
    
    private void ver(BTreeNode nodo){}
    
    // Buscar un valor de clave, devuelve la posición en el array
    public int Buscar(int key){
        return 0;
    }
    
    // Insertar una clave
    public boolean Insert(MiClave key){
        return true;
    }
    
    // Borrar la clave correspondiente a un valor
    public void Borrar(int clave){}
    
    // (Depuración) Mostrar el árbol por pantalla
    public void Mostrar(){}

}
