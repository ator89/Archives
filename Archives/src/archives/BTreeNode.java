
package archives;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class BTreeNode implements Serializable{
    
    protected int num_hijos;
    protected int num_llaves;
    protected BTreeNode root;
    protected BTreeNode[] hijos = new BTreeNode[4];
    protected Key[] llaves = new Key[3];
    protected boolean Hoja;

    //Constructors
    public BTreeNode() {
    }

    public BTreeNode(int num_hijos, int num_llaves, BTreeNode root, boolean Hoja) {
        this.num_hijos = num_hijos;
        this.num_llaves = num_llaves;
        this.root = root;
        this.Hoja = Hoja;
    }
    
    //Getters and setters
    public int getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(int num_hijos) {
        this.num_hijos = num_hijos;
    }

    public int getNum_llaves() {
        return num_llaves;
    }

    public void setNum_llaves(int num_llaves) {
        this.num_llaves = num_llaves;
    }

    public BTreeNode getRoot() {
        return root;
    }

    public void setRoot(BTreeNode root) {
        this.root = root;
    }

    public BTreeNode[] getHijos() {
        return hijos;
    }

    public void setHijos(BTreeNode[] hijos) {
        this.hijos = hijos;
    }

    public Key[] getLlaves() {
        return llaves;
    }

    public void setLlaves(Key[] llaves) {
        this.llaves = llaves;
    }

    public boolean isHoja() {
        return Hoja;
    }

    public void setHoja(boolean Hoja) {
        this.Hoja = Hoja;
    }
    
    //Agregar llave
    public void addLlave(Key Lla, BTreeNode nodo) {
        if (nodo.getNum_llaves() < 5) {
            llaves[nodo.num_llaves] = Lla;
            num_llaves++;
        } else {
        }
    }

    //Agregar hijo
    public void addHijo(BTreeNode nodo) {
        if (nodo.getNum_hijos() < 5) {
            hijos[nodo.num_hijos] = nodo;
            num_hijos++;
        } else {
        }
    }
    
    
    
}
