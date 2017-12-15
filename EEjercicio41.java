/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eejercicio4.pkg1;
import java.util.Scanner ;
// calculadora de la hipotenusa del teorema de Pitagoras
public class EEjercicio41 {
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    //declaracion de las variables
    Double a=0.0 , b=0.0 , c=0.0 ;
    //pedimos el 1 valor de cateto
    System.out.println("Dame los dos valores a calcular");
    // Convertimos la variable a tipo double y lo pasamos a la variable b
    b= sc.nextDouble();
    //Pred
    c = sc.nextDouble();
    a=Math.sqrt(b*b+Math.pow(c,2));
    //imprimimos el resultado
    System.out.println("La hipotenusa es:"+a);
    }
}

