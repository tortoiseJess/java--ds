/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg61bLab4_partialLab5;

/**
 *
 * @author jessey.lin
 */
public class passByWhat {
    public static void swap(int int1, int int2){
        int z = int1;
        int1 = int2;
        int2=z; 
    }
    
    public static void mutate(Dog_lab5 myDog){
        myDog.setOwnerAge(999999999);
    }
    
    
    public static void main (String[] args ){
        int eight = 8;
        int nine = 9;
        swap(eight, nine);
        System.out.println(eight);
        System.out.println(nine);
        
        Dog_lab5 myDog = new Dog_lab5("youAreNotCute", 100);
        System.out.println(myDog.getOwnerAge());
        mutate(myDog);
        System.out.println(myDog.getOwnerAge());

    }
}
