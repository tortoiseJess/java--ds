/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting_and_61b;
import java.util.*;
/**
 *
 * @author Your Name <jessey.lin>
 */
public class quickSortPart1 {
    
    public static void main(String[] args){
        int[] unsorted = {4, 7,2, 10, 1};
        partition(unsorted);    
    }    
    
    public static void partition(int[] ar) {
 
        ArrayList<Integer> left =new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int pivot = ar[0];
        int len = ar.length;
        for (int i=1; i<len; i++){
            if (ar[i] < pivot){
                left.add(ar[i]);
            } 
            else{
                right.add(ar[i]);
            }
        }
        left.add(pivot);
        left.addAll(right);
        
        for (int i=0; i<len; i++){
            ar[i] = left.get(i);
        }
        printArray(ar);
    }
    
     
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
 
}
