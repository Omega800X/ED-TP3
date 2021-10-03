
package punto8;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
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
            pilaParam.pop();
        }        
    
    }
    
    /** Invierte el orden de los elementos de la estructura. */
    @Override
    public void invertirOrden(){
        ColaPorEnlaces<T> aux= new ColaPorEnlaces();
        while(!this.isEmpty()){
            aux.enqueue((T) this.top());
            this.pop();
        }
        while(!aux.isEmpty()){
            this.push(aux.getFront());
            aux.dequeue();
        }

        }
    }