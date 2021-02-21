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
        MergerSort merge = new MergerSort();
        QuickSort quick = new  QuickSort(); 
        Radix radix  = new Radix (); 
        
        
        
        
        
        int [] ListaNum=Lista.Azar();
        System.out.println("Lista de numeros al azar");
         for(int i=0;i<ListaNum.length;i++) {
           System.out.print(ListaNum[i]+" ");
         }
        //System.out.println(ListaNum);
        
        
        
        //Sigue el primer ordenamiento Gnome sort
        
        
        System.out.println("\nOrdenamiento Gnome Sort");
        int [] ListaGnome=Gnome.ordenar(ListaNum, ListaNum.length);
        
        
        for(int i=0;i<ListaGnome.length;i++) {
            System.out.print(ListaGnome[i]+" ");
           
           
       

                    
            }
        
        
         System.out.println("\n Ordenamiento Bubble");
            int []ListaBubble =Bubble.ordenar(ListaNum, ListaNum.length);
        
        
        for(int i=0;i<ListaGnome.length;i++) {
            System.out.print(ListaBubble[i]+" ");
           
           
                    
            }
        
        System.out.println("\n Ordenamiento Merge");
        int b = 0;       
        int [] ListaMerge = merge.sort(ListaNum, b , ListaNum.length-1 );
        
         for(int i=0;i<ListaMerge.length;i++) {
            System.out.print(ListaMerge[i]+" ");
  
                    
            }
          System.out.println("\n Ordenamiento Quick");
         int [] ListaQuick = quick.sort(ListaNum, b , ListaNum.length-1 );
        
         for(int i=0;i<ListaQuick.length;i++) {
            System.out.print(ListaQuick[i]+" ");
  
                    
            }
        
         System.out.println("\n Ordenamiento Radix");
         int [] ListaRadix = radix.radixsort(ListaNum, ListaNum.length-1 );
        
         for(int i=0;i<ListaRadix.length;i++) {
            System.out.print(ListaRadix[i]+" ");
  
                    
            }
    }
}
