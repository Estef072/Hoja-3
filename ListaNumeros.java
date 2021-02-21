/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefania
 */
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 */
public class ListaNumeros {
    
    
    public int[] Azar(){
        int valorEntero= (int)(Math.random()*3000+1);
        int[] ListaNum = new int[valorEntero];
        for (int i=0; i<ListaNum.length; i++){
        
            int valorEntero2 = (int)(Math.random()*3000+1); 
            ListaNum[i]=valorEntero2;
            //ListaNum.add(valorEntero2); 
            
      
        
        }
        
    return ListaNum;
    }

    
}

