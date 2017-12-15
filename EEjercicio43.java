
package eejercicio43;

import java.util.Scanner;

public class EEjercicio43 {

   
    public static void main(String[] args) {
        double s1,s2,s3,ar;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el lado 1");
        s1= Double.parseDouble(sc.next());
        System.out.println("Introduce el lado 2");
        s2= Double.parseDouble(sc.next());
        System.out.println("Introduce el lado 3");
        s3= Double.parseDouble(sc.next());
        ar=Math.sqrt((s1+s2+s3/2)*(s2+s3/2)*(s1+s3/2)*(s1+s2/2));
        System.out.println("El área es de:"+ar);
    }
    
}
