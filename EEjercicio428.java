
package eejercicio428;

public class EEjercicio428 {


    public static void main(String[] args) {
        int dado1=0, dado2=0, c=0;
        for(int i=0;i<100;i++){
            dado1=(int)Math.floor(Math.random()*7);
                
        }
        for(int i=0;i<100;i++){
            dado2=(int)Math.floor(Math.random()*7);
        
        if (dado1+dado2==10)
            c++;
                }
        System.out.println(dado1+dado2);
}
}
