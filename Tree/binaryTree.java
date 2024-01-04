package Tree;
public class binaryTree<T> {
    private Nodo<T> raiz;
    public boolean isEmpty()
    {   
        return !(raiz==null);
    }
    public void addElement(Nodo<T> elem)
    {
        if(!isEmpty())
        {
            raiz=elem;
        }
        else
        {
            addRec(elem, raiz);
        }
    }
    public void addRec(Nodo<T> elem, Nodo<T> raiz)
    {
        if(elem.data<raiz.data)
        {
            if(raiz.left==null)
            {
                raiz.left=elem;
            }
            else
            {
                addRec(elem, raiz.left);
            }
        }
        else
        {
            if(raiz.right==null)
            {
                raiz.right=elem;
            }
            else
            {
                addRec(elem, raiz.right);
            }
        }
    }
    public void printTree()
    {
        printTreeRec(raiz);
    }
    public void printTreeRec(Nodo<T> raiz)
    {
        if(raiz.left!=null)
        {
            printTreeRec(raiz.left);
        }
        System.out.println(raiz.data);
        if(raiz.right!=null)
        {
            printTreeRec(raiz.right);
        }
    }
    //imprimir el arbol por niveles
    public void printTreeLevels()
    {
        printTreeLevelsRec(raiz);
    }
    public void printTreeLevelsRec(Nodo<T> raiz)
    {
        //imprimir el nivel actual 
        System.out.println(raiz.data);
        //imprimir el nivel izquierdo
        if(raiz.left!=null)
        {
            printTreeLevelsRec(raiz.left);
        }
        //imprimir el nivel derecho
        if(raiz.right!=null)
        {
            printTreeLevelsRec(raiz.right);
        }

    }
}
