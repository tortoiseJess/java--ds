/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting_and_61b;

import static sorting_and_61b.insertionSort.printPrettyArray;



/**
 *
 * @author Your Name <jessey.lin>
 * insertion sort ascending order
 */
public class insertionSortpart2 {
    
    public static void main(String[] args){
        int[] lastIntSort = {2, 9, 5, 1};
        insertIntoSorted(lastIntSort);
    } 

    public static void insertIntoSorted(int[] ar) {
        int len = ar.length;
        int currentDivide;
        
        for (int n = 1; n<len; n++){
            currentDivide = ar[n];
            System.out.println(ar[n]);
            int dividePosition = n;
            for (int m=n-1; m>=0; m--){

                if (currentDivide < ar[m]) {
//                    swap if less
                    ar[dividePosition]=ar[m];
                    ar[m]=currentDivide;

//                    printPrettyArray(ar);
                }
                else{
                    break;
                }
                dividePosition--;                 
            }
            printPrettyArray(ar);
        }
    }
}
