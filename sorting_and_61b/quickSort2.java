/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting_and_61b;

import java.util.ArrayList;
import static sorting_and_61b.quickSortPart1.printArray;


/**
 *
 * @author Your Name <jessey.lin>
 */
public class quickSort2 {
    
    public static void main(String[] args){
        int[] unsorted = {3,100, 10, 1};  
        quickSortRecur(unsorted);
    }  
    
    public static int [] partition(int[] ar) {
        if (ar.length >1){

            ArrayList<Integer> left =new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();
            int pivot = ar[0];
            System.out.println("pivot: "+ pivot);
            int len = ar.length;
            for (int i=1; i<len; i++){
                if (ar[i] < pivot){
                    left.add(ar[i]);
                } 
                else{
                    right.add(ar[i]);
                }
            }
            int[] leftArr = new int[left.size()] ;
            for(int i =0; i<left.size();i++){
                leftArr[i] = left.get(i);
            }
            int[] rightArr = new int[right.size()];
            for(int i =0; i<right.size();i++){
                rightArr[i] = right.get(i);
            }
            
            System.out.println("leftarr");
            printArray(leftArr);
            leftArr = partition(leftArr);
             rightArr = partition(rightArr);
            
            System.out.println("rightArr");
            printArray(rightArr);
            
            left.clear();
            for(int i =0; i<left.size();i++){
                left.add(i, leftArr[i]);
            }
            right.clear();
            for(int i =0; i<right.size();i++){
                right.add(i, rightArr[i]);
            }         

            
            left.add(pivot);
            left.addAll(right);

            for (int i=0; i<len; i++){
                ar[i] = left.get(i);
            }
            System.out.println("end of one partition");
            printArray(ar);
         
        return ar;
        }
        else{
            return ar ;
        }
    }

    


    public static void quickSortRecur(int [] ar){
        if (ar.length == 1){
//            printArray(ar);
        }
        else{
            partition(ar);
        }
    }
}
