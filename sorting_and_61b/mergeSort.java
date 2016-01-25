/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting_and_61b;

/**
 * http://pages.cs.wisc.edu/~bobh/367/SORTING.html#merge 
 * @author Your Name <jessey.lin>
 */
public class mergeSort {
    
    public static void main(String[] args){
    
    }    
    
public static void mergeSort(Comparable[] A) {
  mergeAux(A, 0, A.length - 1); // call the aux. function to do all the work
}

private static void mergeAux(Comparable[] A, int low, int high)
{
  // base case
     if (low == high) return;

  // recursive case
  // Step 1: Find the middle of the array (conceptually, divide it in half)
     int mid = (low + high) / 2;
  // Steps 2 and 3: Sort the 2 halves of A
     mergeAux(A, low, mid);
     mergeAux(A, mid+1, high);

  // Step 4: Merge sorted halves into an auxiliary array
     Comparable[] tmp = new Comparable[high-low+1];
     int left = low;    // index into left half
     int right = mid+1; // index into right half
     int pos = 0;       // index into tmp
     
     while ((left <= mid) && (right <= high)) {
	// choose the smaller of the two values "pointed to" by left, right
	// copy that value into tmp[pos]
	// increment either left or right as appropriate
	// increment pos
	...
     }
     // here when one of the two sorted halves has "run out" of values, but
     // there are still some in the other half; copy all the remaining values
     // to tmp
     // Note: only 1 of the next 2 loops will actually execute
       while (left <= mid) { ... }
       while (right <= high) { ... }

     // all values are in tmp; copy them back into A
       arraycopy(tmp, 0, A, low, tmp.length);
}
}
