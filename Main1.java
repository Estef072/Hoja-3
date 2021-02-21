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
 *
 * @author WALTER1
 */
public class Main1{
    
    public static void main(String [] args){
        
         
        ListaNumeros Lista= new ListaNumeros();
        GnomeSort Gnome= new GnomeSort();
        BubbleSort Bubble=new BubbleSort();
        
        
        
        
        int [] ListaNum=Lista.Azar();
        //System.out.println(ListaNum);
        
        
        
        //Sigue el primer ordenamiento Gnome sort
        
        
        System.out.println("\nOrdenamiento Gnome Sort");
        int [] ListaGnome=Gnome.ordenar(ListaNum, ListaNum.length);
        
        
        for(int i=0;i<ListaGnome.length;i++) {
            System.out.print(ListaGnome[i]+" ");
           
           
       

                    
            }
        
        
         System.out.println("Ordenamiento Gnome Sort");
            int []ListaBubble =Bubble.ordenar(ListaNum, ListaNum.length);
        
        
        for(int i=0;i<ListaGnome.length;i++) {
            System.out.print(ListaGnome[i]+" ");
           
           
       

                    
            }
        
        
        
        
        //Sigue el primer ordenamiento Gnome sort
        
        
        //System.out.println("Ordenamiento Gnome Bubble");
       
       

        
        
        
       
        
    }
    
}
