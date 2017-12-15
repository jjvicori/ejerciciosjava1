
package eejercicio427;


public class EEjercicio427 {


    public static void main(String[] args) {
        // Simulad 100 tiradas de un dado y contar las veces que aparece el nº 6. 
        int dado,c=0;
        for(int i=0;i<100;i++){
            dado=(int)Math.floor(Math.random()*7);//pongo 7 para quedarme con la parte entera del 6 incluido
            
            if (dado==6)
                c++;
            
        }
        System.out.println("Las veces que ha salido 6:"+ c);
        
        
        
    }

}
