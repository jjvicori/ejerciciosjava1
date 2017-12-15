
package eejercicio61;


public class Pila extends Lista {
    //pop(),push(Object ob), vacia() y cima().
    public Object pop(){
     
        Object dato=null;
        if(super.size()>0){
            dato=super.extraeUltimo();
            super.setSize(super.size() -1);
        }
        else
            System.out.println("Ya no hay elementos en la pila");
        return dato;
    }
    public void push(Object ob){
            super.add(ob);
    }
    public boolean vacia(){
            return super.estaVacia();
    }
    public Object cima(){
            return super.extraeUltimo();
    }
     
}
