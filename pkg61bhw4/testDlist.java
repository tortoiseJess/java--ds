/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg61bhw4;

/**
 *
 * @author Your Name <jessey.lin>
 */
public class testDlist {
    
    public static void main(String[] args){

    DList l = new DList();
    System.out.println("### TESTING Empty list is " + l);
    
    l.insertFront(9);
    System.out.println("\nInserting 9 at front.\nList with 9 is " + l);
    if ( l.head.next.nodeVal() != 9) {
      System.out.println("head.next.item is wrong.");
    }
    if (l.head.next.prev != l.head) {
      System.out.println("head.next.prev is wrong.");
    }
    if (l.head.prev.nodeVal() != 9) {
      System.out.println("head.prev.item is wrong.");
    }
    if (l.head.prev.next != l.head) {
      System.out.println("head.prev.next is wrong.");
    }
    if (l.size != 1) {
      System.out.println("size is wrong.");
    }
    }    
}
