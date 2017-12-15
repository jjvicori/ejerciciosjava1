
package eejercicio61;

import java.util.Vector;


public class Lista extends Vector {

   
        public Lista() {
            super(); 
            
        }
       public void ponPrimero(Object ob){
           super.insertElementAt(ob,0);
       }
       
        public void ponUltimo(Object ob){
            super.addElement(ob);
          
       }
       
       public boolean estaVacia(){
           return super.isEmpty();
       }
       public Object extraePrimero(){
           return super.firstElement();
       }
       public Object extraeUltimo(){
           return super.lastElement();
       }
       public void visualizaElementos(){
           for(int i=0;i<super.size();i++){
               System.out.println("el elmento en la posicion "+i+":"+super.indexOf(i));
            }
           
           
       }
       
       
       
       
       
       
       
        
      //public void addElement(Object obj)
        
        /*
       void ponUltimo(Object ob). Crea un nuevo nodo del tipo NodoLista, donde almacena ob, y lo coloca como último nodo de nuestra lista.
- boolean estaVacia(). Devuelve verdadero si la lista está vacía y falso en caso contrario.
- Object extraePrimero(). Devuelve el primer elemento almacenado en la lista, eliminándolo de esta.
- Object extraeUltimo(). Devuelve el último elemento almacenado en la lista, eliminándolo de esta.
- void visualizaElementos. Visualiza todos los elemntos almacenados en la lista.
Haced un programa para comprobar el buen funcionamiento de dicha clase.
2. Utilizando la clase Lista, anteriormente creada, construid la clase Pila con la siguiente interface: pop(), push(Object ob), vacia() y cima(). Haced un programa para comprobar el buen funcionamiento de dicha clase.
3. Utilizando la clase Lista, anteriormente creada, construid la clase Cola con la siguiente interface: extraeDeCola(), ponEnCola(Object ob), vacia() y frente(). Haced un programa para comprobar el buen funcionamiento de dicha clase.
4. Cread la clae carácter con los dos métodos estáticos siguientes:
- int ordinal(char c).
- char ascii(int i).
5. Cread la clase Cadena de forma que nos permita almacenar una cadena de caracteres, con al menos la siguiente interface:
- inviertecadena(). Invierte la cadena miembro.
- encriptaCadena(). Encripta la cadena miembro.
- desencriptaCadena(). Desencripta la cadena miembro.
- visualizaCadena(). Visualiza la cadena miembro.
       */
       
        
}


