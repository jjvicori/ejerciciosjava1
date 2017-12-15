
package eejercicio61;

public class Cola extends Lista {
    //extraeDeCola(), ponEnCola(Object ob), vacia() y frente().
    public Object extraeDeCola(){
     
        Object dato=null;
        if(super.size()>0){
            dato=super.extraeUltimo();
            super.setSize(super.size() -1);
        }
        else
            System.out.println("Ya no hay elementos en la cola");
        return dato;
    }
    public void ponEnCola(Object ob){
            super.add(ob);
    }
    public boolean vacia(){
            return super.estaVacia();
    }
    public Object frente(){
            return super.extraeUltimo();
    }
     
}

