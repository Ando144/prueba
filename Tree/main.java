package Tree;

public class main {
    public static void main(String[] args) {
        binaryTree<Integer> tree= new binaryTree<>();
        Nodo<Integer> N1 = new Nodo<>();
        Nodo<Integer> N2 = new Nodo<>();
        Nodo<Integer> N3 = new Nodo<>();
        Nodo<Integer> N4 = new Nodo<>();
        Nodo<Integer> N5 = new Nodo<>();
        Nodo<Integer> N6 = new Nodo<>();
        Nodo<Integer> N7 = new Nodo<>();
        Nodo<Integer> N8 = new Nodo<>();
        Nodo<Integer> N9 = new Nodo<>();

        N1.data=3;
        N2.data=2;
        N3.data=6;
        N4.data=4;
        N5.data=5;
        N6.data=33;
        N7.data=7;
        N8.data=102;
        N9.data=1;

        tree.addElement(N1);
        tree.addElement(N2);
        tree.addElement(N3);
        tree.addElement(N4);
        tree.addElement(N5);
        tree.addElement(N6);
        tree.addElement(N7);
        tree.addElement(N8);
        tree.addElement(N9);

        System.out.println("imprimir el arbol de izq a der");
        tree.printTree();
        System.out.println("imprimir el arbol por niveles");
        tree.printTreeLevels();
        }
}
