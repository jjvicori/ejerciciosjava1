
package eejercicio51;

public class UrnaTrampa extends Urna{
   
    float cbolas;

    UrnaTrampa(int numero_bolas, String[] color_bolas) {
        super(numero_bolas, color_bolas);
       
    }
    @Override
        public String getColor_bolas(int posicion) {
            //creo un valor entre 0 y 1
            cbolas= (float) (Math.random());
            //si el valor se encuentra entre 0.0 y 0.2, cambio el color de la bola de la posicion 0
            if(cbolas<=0.2){
                if(super.color_bolas[0]=="blanco")
                    super.color_bolas[0]="negro";
                else
                     super.color_bolas[0]="blanco";
            }
            return super.color_bolas[posicion];
        }
        
    
    
}
