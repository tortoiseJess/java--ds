/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting_and_61b;

import java.util.Arrays;
import java.util.List;
import static sorting_and_61b.insertionSort.printPrettyArray;
//import org.apache.commons.lang3.ArrayUtils; 

/**
 *
 * @author Your Name <jessey.lin>
 */
public class selectionSort {
    
    public static void main(String[] args){
         int[] unsorted = {1,10, 9, 5, 2};   
         selectSort(unsorted);
    }    
    
    public static int findMin(int [] arr, int k){

        int minVal = Integer.MAX_VALUE;
        int minIndex = -3;
        for (int i=k; i<arr.length; i++){
            if (arr[i]<minVal){
                minVal = arr[i];
                minIndex = i;
            }
        }
        System.out.println(minVal);
        return minIndex;
    }
    public static void selectSort(int[] ar){
        int len = ar.length;
        int minIndex;

        for (int n =0; n<len-2; n++){
            minIndex = findMin(ar,n);

            System.out.println(minIndex);
            int temp = ar[minIndex];
            ar[minIndex]= ar[n];
            ar[n] = temp;
            printPrettyArray(ar);
    }
}
}
