
package eejercicio426;

import java.util.Scanner;


public class EEjercicio426 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorDado;
        System.out.println("INTRODUCE 0 PARA FINALIZAR PROGRAMA");
        do{
        valorDado =  (int)( Math.floor(Math.random()*2));
        System.out.println("valor:"+Math.floor(Math.random()*2)+"valor:"+valorDado);
        switch (valorDado) {
            case 1: System.out.println ("Cara"); break;
            case 2: System.out.println ("Cruz"); break;
             default: System.out.println ("Adiosss"); break;
        }
    
        }while(valorDado!=0);
}
}
