/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg61bLab4_partialLab5;

/**
 * part IV
 * 1) gets the subclass overridden method -- why??
 * 2) can't run
 * 3) not possible worr
 */
public class lab5q4 {
    public static void main(String[] args) {
        Dog_lab5 puppy = new Dog_lab5("puppy1", 30);
        ((Animal_lab5) puppy).getAge();
        
        //cannot be cast
        Animal_lab5 animal1 = new Animal_lab5("animal1",20);
        ((Dog_lab5)animal1).getAge();
        
    }
}
