
package punto8;
import ar.edu.uner.fcad.ed.edlineales.NodoLista;
import ar.edu.uner.fcad.ed.edlineales.colas.Cola;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
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
     ---------------------------revisar-----------------------------------------------------tope.getElemento()
     */
    @Override
    public void invertirOrden(){
        ColaPorEnlaces<T> aux1= new ColaPorEnlaces();
//        NodoLista tope1= this.tope;
//        PilaPorEnlaces<T> aux = new PilaPorEnlaces();
        while(!this.isEmpty()){
            aux1.enqueue((T) this.top());
            this.pop();
//            aux.push((T) this.top());
//            this.tope=this.tope.getSiguiente();
        }
//        this.tope=tope1;
        while(!aux1.isEmpty()){
            this.push(aux1.getFront());
            aux1.dequeue();
        }

        }
    }