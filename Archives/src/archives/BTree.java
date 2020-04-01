
package archives;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class BTree implements Serializable{
    
    private BTreeNode raiz=null;
    private int altura;

    //Constructor
    public BTree() {
        raiz = new BTreeNode(0, 0, null, true);
        Key o = new Key(-1, 0);
        altura = 0;
    }

    //Getters and setters
    public BTreeNode getRaiz() {
        return raiz;
    }

    public void setRaiz(BTreeNode raiz) {
        this.raiz = raiz;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Función para buscar por llave
    public Key search(BTreeNode Nodo, Key value) {

        int i = 1;
        while (i <= Nodo.getNum_hijos() && value.getKey()> Nodo.getLlaves()[i - 1].getKey()) {
            i++;
        }

        if (i <= Nodo.getNum_hijos() && value.getKey() == Nodo.getLlaves()[i - 1].getKey()) {
            return Nodo.getLlaves()[i - 1];
        }

        if (!Nodo.isHoja()) {
            return search(Nodo.getHijos()[i - 1], value);
        }
        System.out.println("no lo encontre");
        return null;
    }

    //Función split cuando llega al máximo (3)
    public void split(BTreeNode parentNode, int childIndex, BTreeNode newChild) {

        BTreeNode z = new BTreeNode(0, 0, null, true);
        
        z.Hoja = newChild.Hoja;
        z.setNum_hijos(1);
        z.getLlaves()[0] = newChild.getLlaves()[2];
        
        if (!newChild.Hoja) {
            z.getHijos()[0] = newChild.getHijos()[2];
            z.getHijos()[1] = newChild.getHijos()[3];
        }

        newChild.setNum_hijos(1);
        parentNode.getHijos()[childIndex] = z;
        
        for (int j = parentNode.getNum_hijos() + 1; j >= childIndex + 1; j--) {
            parentNode.getHijos()[j] = parentNode.getHijos()[j - 1];
            parentNode.getLlaves()[j - 1] = parentNode.getLlaves()[j - 2];
        }
        
        parentNode.getLlaves()[childIndex - 1] = newChild.getLlaves()[1];

        for (int i = 0; i <= parentNode.getHijos()[childIndex - 1].getNum_hijos(); i++) {
            parentNode.getHijos()[childIndex - 1].getLlaves()[i + 1] = null;
        }
        
        parentNode.getHijos()[childIndex - 1].setNum_hijos(1);

        int y = parentNode.getNum_hijos() + 1;
        parentNode.setNum_hijos(y);

    }

    //Insertar cuando no está lleno
    public void insert_no_full(BTreeNode nodo, Key value) {
        int i = nodo.getNum_hijos();
        if (nodo.isHoja()) {
            while (i >= 1 && value.getKey() < nodo.getLlaves()[i - 1].getKey()) {
                nodo.getLlaves()[i] = nodo.getLlaves()[i - 1];
                i--;
            }
            nodo.getLlaves()[i] = value;
            int y = nodo.getNum_hijos() + 1;
            nodo.setNum_hijos(y);
        } else {

            while (i >= 1 && value.getKey() < nodo.getLlaves()[i - 1].getKey()) {
                i--;
            }
            i++;
            if (nodo.getHijos()[i - 1].getNum_hijos() == 3) {

                split(nodo, i, nodo.getHijos()[i - 1]);

                if (value.getKey() > nodo.getLlaves()[i - 1].getKey()) {

                    i++;
                }
            }

            insert_no_full(nodo.getHijos()[i - 1], value);
        }
    }

    //Insertar
    public void insert(Key Llave) {
        BTreeNode r = raiz;
        if (r.getNum_hijos() == 3) {
            BTreeNode nodo_temp = new BTreeNode(0, 0, null, true);
            raiz = nodo_temp;
            nodo_temp.setNum_hijos(0);
            nodo_temp.Hoja = false;
            //Nuevo hijo es raiz
            nodo_temp.getHijos()[0] = r;
        
            split(nodo_temp, 1, r);
            insert_no_full(nodo_temp, Llave);
        } else {
            insert_no_full(r, Llave);
        }
    }

    //Imprimir arbol
    public void printBtree(BTreeNode node, String indent) {

        if (node == null) {
            System.out.println(indent + "El arbol esta vacío...");
        } else {
            System.out.println(indent + " ");

            String childIndent = indent + "\t";

            for (int i = node.getNum_llaves() - 1; i >= 0; i--) {
                if (!node.Hoja) {
                    printBtree(node.getHijos()[i], childIndent);
                }

                if (node.getLlaves()[i].getKey() > 0) {
                    System.out.println(childIndent + node.getLlaves()[i].getKey());
                }
            }
            if (!node.Hoja) {
                printBtree(node.getHijos()[node.getNum_llaves()], childIndent);
            }
        }

    }


    public void imprimir_arblo(BTreeNode nodo_actual, int num) {
        //se debe iniciar num en 0 a la hora de llamar el metodo
        for (int i = 0; i < nodo_actual.getLlaves().length; i++) {
            if (nodo_actual.getLlaves()[i] != null) {
                System.out.println("llave: " + nodo_actual.getLlaves()[i].getKey() + ", nivel:" + num);
            }
        }
        //si no es hoja, se llama el metodo recursivo pero ahora con su hijo
        if (nodo_actual.Hoja == false) {
            for (int i = 0; i < nodo_actual.getHijos().length; i++) {
                if (nodo_actual.getHijos()[i] != null) {
                    imprimir_arblo(nodo_actual.getHijos()[i], num + 1);
                }
            }
        }
    }

}
