
package eejercicio42;
import java.util.Scanner;

public class EEjercicio42 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    //Variables
    double Precio, Total,fab,dis;
    int UdVendidas;
    // Inserte el precio ganado
    System.out.println("Inserte el precio");
    Precio= Double.parseDouble(sc.next());
    System.out.println("Inserte las unidades vendidas");
    UdVendidas=Integer.parseInt(sc.next());
    Total= Precio*UdVendidas;
    fab=Total/4;
    dis=fab*2;
    System.out.println("el sueldo del fabricante es:"+fab);
    System.out.println("el sueldo del diseñador  es:"+dis);
    
    
    }
    
}
