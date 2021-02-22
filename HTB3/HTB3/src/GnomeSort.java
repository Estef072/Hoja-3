/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefania


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WALTER1
 */
 import java.util.ArrayList;
 
public class GnomeSort {
   
    public int[] ordenar(int[] ListaNum, int n){
        
        int index = 0; 
  
        while (index < n) { 
            
            
            if (index == 0) 
                index++; 
            if (ListaNum[index] >= ListaNum[index-1]) 
                index++; 
            else { 
                int temp = 0; 
                temp = ListaNum[index]; 
                ListaNum[index]= ListaNum[index - 1]; 
                ListaNum[index - 1]=temp; 
                index--; 
                
            }
         }
        return ListaNum;
       } 
       
        
  }
    
