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
/**
 *  A DListNode is a node in a DList (doubly-linked list).
 */

public class DListNode {

  /**
   *  item references the item stored in the current node.
   *  prev references the previous node in the DList.
   *  next references the next node in the DList.
   *
   *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
   */

  public Object item;
  protected DListNode prev;
  protected DListNode next;

  /**
   *  DListNode() constructor.
   *  @param i the item to store in the node.
   *  @param p the node previous to this node.
   *  @param n the node following this node.
   */
  DListNode(Object i, DListNode p, DListNode n) {
    item = i;
    prev = p;
    next = n;
  }
  
    int nodeVal(){
        return ((Integer) item);//.intValue();
   
  }

  // empty listNode constructor
//    DListNode() {
//        item = Integer.MIN_VALUE;
//        prev = null;
//        next = null;
//    }
}
