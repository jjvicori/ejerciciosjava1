
package eejercicio51;
import static java.lang.Math.max;
import java.util.concurrent.ThreadLocalRandom;

public class EEjercicio51 {
     
    public static void main(String[] args) {
        int num1,num2;
       
        
       String[] color = new String[6];
        color[0] = "blanco";
        color[1] = "negro";
        color[2] = "negro";
        color[3] = "blanco";
        color[4] = "negro";
        color[5] = "blanco";
        UrnaTrampa miUrna = new UrnaTrampa(6,color);
        
      int num_bolas = 6;
       /* Urna miUrna = new Urna();
        miUrna.setNumero_bolas(num_bolas);
        miUrna.setColor_bolas(0,"blanco");
        miUrna.setColor_bolas(1,"blanco");
        miUrna.setColor_bolas(2,"negro");
        miUrna.setColor_bolas(3,"blanco");
        miUrna.setColor_bolas(4,"negro");
        miUrna.setColor_bolas(5,"negro"); */
        
        while(miUrna.getNumero_bolas() > 1){
            num1 = ThreadLocalRandom.current().nextInt(0, num_bolas+ 1);
            num2 = ThreadLocalRandom.current().nextInt(0, num_bolas + 1);
            if(num1==num2){
               num1 = ThreadLocalRandom.current().nextInt(0, num_bolas+ 1);
                num2 = ThreadLocalRandom.current().nextInt(0, num_bolas + 1); 
            }
            
            
           System.out.println("numero de bolas:"+miUrna.getNumero_bolas()+",num1:"+num1+",num2:"+num2+",numero bolas:"+miUrna.getNumero_bolas()+"color bolas:"
                   );
           
            if (miUrna.getColor_bolas(num2).equals(miUrna.getColor_bolas(num1)) ){
                miUrna.setColor_bolas(num_bolas+1,"negro");
                num_bolas++;
            }else{
                miUrna.setColor_bolas(num_bolas+1,"blanco");
                num_bolas++;
            }
             System.out.println(miUrna.getNumero_bolas());
            num_bolas = num_bolas -2;
            miUrna.setNumero_bolas(num_bolas);
        }
        //System.out.println(miUrna.getNumero_bolas());
        
        
        
    }
    
}
