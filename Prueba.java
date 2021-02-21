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
public class Prueba {
    
     public static void main (String [] args){
        
        ListaNumeros Lista= new ListaNumeros();
        GnomeSort Gnome= new GnomeSort();
        BubbleSort Bubble=new BubbleSort();
        
        
        
        
        ArrayList<Integer> ListaNum=Lista.Azar();
        System.out.println(ListaNum);
        
        
        
        //Sigue el primer ordenamiento Gnome sort
        
        
        System.out.println("Ordenamiento Gnome Sort");
        ArrayList<Integer> ListaGnome=Gnome.ordenar(ListaNum, ListaNum.size());
        
        System.out.println(ListaGnome);
        
        
        
        //Sigue el primer ordenamiento Gnome sort
        
        
        System.out.println("Ordenamiento Gnome Bubble");
      
     }
     
}