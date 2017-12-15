
package eejercicio413;

import java.util.Scanner;


public class EEjercicio413 {

    public static void main(String[] args) {
    double n1,n2,n3, suma,r;
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce un numero natural");
    n1= Double.parseDouble(sc.next());
    System.out.println("Introduce otro numero natural para sumar los numeros intermedios con respecto al anterior");
    n2= Double.parseDouble(sc.next());
    suma=0;
    n3=n1;
    
    do{
     r=n3%3;
        if(r==0){
             suma=suma+n3;
            }
            n3=n3+1;
        }while(n3<=n2);    

System.out.println("El total es "+suma);
    
    
    }
    
}
