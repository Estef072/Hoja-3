/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefania
 */
public class MergerSort {
    
    public void sort(int arr[], int left, int right) {
        if(left < right){
      //Encuentra el punto medio del vector.
      int middle = (left + right) / 2;
      
      //Divide la primera y segunda mitad (llamada recursiva).
      sort(arr, left, middle);
      sort(arr, middle +1, right);

      //Une las mitades.
      MergeSort(arr, left, middle, right);
      
    }
        
    
    }
    
    
    public void merge(int arr[], int left, int middle, int right) {
        

    }
    public void printArray() {

    }

    private void MergeSort(int[] arr, int left, int middle, int right) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
