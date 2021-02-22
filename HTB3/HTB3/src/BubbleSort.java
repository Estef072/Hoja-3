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

/*
 */
public class BubbleSort {
    
    public int [] ordenar(int[] ListaNum, int n){
        
            /* Bucle desde 0 hasta la longitud del array -1 */
            for (int i = 0; i <n-1; i++) {
                /* Bucle anidado desde 0 hasta la longitud del array -1 */
                for (int j = 0; j <n-1; j++) { 
                        
                        
                        if (ListaNum[j] > ListaNum[j+1]){
                            int temp = ListaNum[j+1]; 
                            
                            ListaNum[j + 1]= ListaNum[j];
                            ListaNum[j] = temp;
                            
                        }
                    }
                
                }
       return ListaNum; 
    }
}