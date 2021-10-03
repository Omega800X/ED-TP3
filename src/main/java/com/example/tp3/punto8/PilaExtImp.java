
package punto8;
import ar.edu.uner.fcad.ed.edlineales.NodoLista;
import ar.edu.uner.fcad.ed.edlineales.pilas.Pila;
import ar.edu.uner.fcad.ed.edlineales.pilas.PilaPorEnlaces;


public class PilaExtImp <T> extends PilaPorEnlaces implements PilaExtInterfaz<T>{
        
     /** Mezcla los elementos la estructura con los de pilaParam.
     * @param pilaParam */
    public void intercalar(PilaPorEnlaces <T> pilaParam){
        
        
        
        
        
    }
    /** Agrega al final de la estructura los elementos de pilaPam
     * @param pilaParam */
    @Override
    public void agregarTodos(PilaPorEnlaces <T> pilaParam){
        
        while (!pilaParam.isEmpty()){
            this.push(pilaParam.top());
        }      
    
    }
    
    /** Invierte el orden de los elementos de la estructura. 
     ---------------------------revisar-----------------------------------------------------
     */
    @Override
    public void invertirOrden(){
        NodoLista tope1= this.tope;
        Pila<Object> aux = new PilaPorEnlaces();
        while(!this.isEmpty()){
            aux.push(this.tope.getElemento());
            this.tope=this.tope.getSiguiente();
        }
        this.tope=tope1;
            
        }
    }


/***
 * 
 */