/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting_and_61b;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;
/**
 *
 * @author Your Name <jessey.lin>
 * input: 5
 *        2 4 6 8 3
 */
public class insertionSort {
    
    public static void main(String[] args){
        int[] lastIntSort = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        insertIntoSorted(lastIntSort);
    }    
    
    static void printPrettyArray(int [] ar){
    StringBuilder builder = new StringBuilder();
    for (int value : ar) {
        builder.append(value + " ");
    }
    String text = builder.toString();
    System.out.println(text);
    }

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int len = ar.length;
        int wrongOrder = ar[len-1];

        for (int n = len-2; n>=0; n--){
            if (wrongOrder < ar[n]) {
                ar[n+1]=ar[n];
                printPrettyArray(ar);
                if (n==0){
                    ar[0]= wrongOrder;
                    printPrettyArray(ar);
                }
//                System.out.println(Arrays.toString(ar));


            }else{
                ar[n+1] = wrongOrder;
                printPrettyArray(ar);
                break;
            }

        }  
    }
    
    
}
