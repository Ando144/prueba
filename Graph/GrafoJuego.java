package Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class GrafoJuego {
    private HashMap<Integer, ArrayList<Casilla>> Adyacentes;
    //clave: valor de la casilla
    //valor: lista de casillas adyacentes

    public SimpleLinkedList<Casilla> camino(Casilla comienzo, Casilla end)
    {
        ArrayList<Casilla> auxArray = new ArrayList<>();
        SimpleLinkedList<Casilla> camino = new SimpleLinkedList<>();
        Casilla Root = new Casilla();
        comienzo.nivel = 0;
        Root= comienzo;
        int kont=0;
        boolean flag=true;

        Casilla puntero;
        puntero=comienzo;
        while(flag)
        {
            auxArray=Adyacentes.get(puntero.valor);
            Adyacentes.remove(puntero);
            //tiene que ir vaciando el hashmap e ir reyenando el arbol con las casillas adyacentes de distinto color
            for(int i=0;i<auxArray.size();i++)
            {

            }
            
            if(kont==20)
            {
                flag=false;
            }else
            {
          
                    
            }
        }
            
        return camino;
    }
}
