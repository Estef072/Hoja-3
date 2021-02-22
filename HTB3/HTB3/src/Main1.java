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
        
        
        
        long startTime = System.nanoTime();
        
        int [] ListaNum=Lista.Azar();
        System.out.println("Lista de numeros al azar");
         for(int i=0;i<ListaNum.length;i++) {
           System.out.print(ListaNum[i]+" ");
         }
         
         
         
         System.out.print("\nTiempo de inicio (numeros al azar) = ");
        long Time0 = System.nanoTime()-startTime;
        System.out.println(Time0);
        
        //System.out.println(ListaNum);
       
        //----------------------------------------------------------------------------------------
        
        //Sigue el primer ordenamiento Gnome sort
        
        
        System.out.println(" \nOrdenamiento Gnome Sort");
        int [] ListaGnome=Gnome.ordenar(ListaNum, ListaNum.length);
        
        
        for(int i=0;i<ListaGnome.length;i++) {
            System.out.print(ListaGnome[i]+" ");    
            }
        System.out.print("\nTiempo de Gnome sort = ");
        long Time1 = System.nanoTime()-startTime;
        System.out.println(Time1);
        
        
        //-----------------------------------------------------------------------------------
        
         System.out.println("\n Ordenamiento Bubble");
            int []ListaBubble =Bubble.ordenar(ListaNum, ListaNum.length);
        
        
        for(int i=0;i<ListaGnome.length;i++) {
            System.out.print(ListaBubble[i]+" ");         
        }
        
        System.out.print("\nTiempo de Bubble Sort = ");
        long Time2 = System.nanoTime()-startTime;
        System.out.println(Time2);
        
        
        
        
        //------------------------------------------------------------------------------------------------------
        
        System.out.println("\n Ordenamiento Merge sort");
        int b = 0;       
        int [] ListaMerge = merge.sort(ListaNum, b , ListaNum.length-1 );
        
         for(int i=0;i<ListaMerge.length;i++) {
            System.out.print(ListaMerge[i]+" ");         
        }
         
        System.out.print("\nTiempo de Merge Sort = ");
        long Time3 = System.nanoTime()-startTime;
        System.out.println(Time3);
        
        //------------------------------------------------------------------------------------------------------
        
         
         
          System.out.println("\n Ordenamiento Quick sort");
         int [] ListaQuick = quick.sort(ListaNum, b , ListaNum.length-1 );
        
         for(int i=0;i<ListaQuick.length;i++) {
            System.out.print(ListaQuick[i]+" ");           
        }
         
        System.out.print("\nTiempo de Quick sort = ");
        long Time4 = System.nanoTime()-startTime;
        System.out.println(Time4);
        
        //------------------------------------------------------------------------------------------------------
         
         
         
         
        
         System.out.println("\n Ordenamiento Radix sort");
         int [] ListaRadix = radix.radixsort(ListaNum, ListaNum.length-1 );
        
         for(int i=0;i<ListaRadix.length;i++) {
            System.out.print(ListaRadix[i]+" ");         
        }
         
         
         
         
         System.out.print("\nTiempo de Radix sort = ");
        long Time5 = System.nanoTime()-startTime;
        System.out.println(Time5);
        
        //------------------------------------------------------------------------------------------------------
         
            
    }
}
