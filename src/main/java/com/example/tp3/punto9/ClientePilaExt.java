package punto9;

import punto8.PilaExtImp;

public class ClientePilaExt {
    public static void main(String[] args) {
        //System.out.println("test AgregarTodos");
        PilaExtImp<Integer> pila = new PilaExtImp();
        PilaExtImp<Integer> pila2 = new PilaExtImp();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        //-------------
        pila2.push(5);
        pila2.push(6);
        pila2.push(7);
        pila2.push(8);

        //System.out.println("Pila1: " + pila.toString());
        //System.out.println("\n");
        //System.out.println("despues de agregar todos los elementos de pila 1 en pila2");
        //pila.agregarTodos(pila2);
        System.out.println("");
        System.out.println(pila.toString());
        
//        System.out.println("testInvertirOrden");
//        //se invierte el orden de la pila 2, deberia mostrar 5,6,7,8
        pila.invertirOrden();
        System.out.println("pila invertida");
        System.out.println(pila.toString());
    }
    
    
    
//    public static void testPilaExtImp() {
//         
//        System.out.println("test AgregarTodos");
//        PilaExtImp<Integer> pila = new PilaExtImp();
//        PilaExtImp<Integer> pila2 = new PilaExtImp();
//        pila.push(1);
//        pila.push(2);
//        pila.push(3);
//        pila.push(4);
//        //-------------
//        pila2.push(5);
//        pila2.push(6);
//        pila2.push(7);
//        pila2.push(8);
//
//        System.out.println("Pila1: " + pila.toString());
//        
//        System.out.println(pila.toString());
//        System.out.println("");
//        System.out.println("agregar todos los elementos de pila 1 en pila2");
//        pila.agregarTodos(pila2);
//        System.out.println("");
//        System.out.println(pila.toString());
//
//    }

//    public void testIntercalar() {
//        System.out.println("testInvertirOrden");
//        PilaExtImp<Integer> pila = new PilaExtImp();
//        PilaExtImp<Integer> pila2 = new PilaExtImp();
//        pila.push(1);
//        pila.push(2);
//        pila.push(3);
//        pila.push(4);
//        //-------------
//        pila2.push(5);
//        pila2.push(6);
//        pila2.push(7);
//        pila2.push(8);
//
//    }

//    public void testInvertirOrden() {
//        System.out.println("testInvertirOrden");
//        PilaExtImp<Integer> pila = new PilaExtImp();
//        pila.push(1);
//        pila.push(2);
//        pila.push(3);
//        pila.push(4);
//
//        pila.invertirOrden();
//        System.out.println("pila invertida");
//        System.out.println(pila.toString());
//    }

    
}
