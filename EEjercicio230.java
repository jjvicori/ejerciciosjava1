
package eejercicio230;

import java.util.Scanner;


public class EEjercicio230 {


    public static void main(String[] args) {
        int n,numero=0,intentos=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para averiguar el numero correcto");
        n = sc.nextInt();
        for(int i=0;i<100;i++){
            numero=(int)Math.floor(Math.random()*101);
        if(n==numero)
            System.out.println("Enhorabuena has adivinado el número:"+numero);
        else 
            System.out.println("Has fallado, vuelve a intentarlo");
            intentos++;
           
    } 
        if(intentos==5)
            System.out.println("Lo siento, has perdido...");
    }
        
}
