/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg61bLab4_partialLab5;

/**
 *
 * @author jessey.lin
 * y is subclass of x and xa and ya are such arrays
 * 
 */
public class lab5 {
    
    public static void main(String[] args ){
        Animal_lab5[] xa ;
        Dog_lab5[] ya = new Dog_lab5[3] ;

        for (int i =0; i<3; i++){
            ya[i] = new Dog_lab5(i+" th dog ", i+40 );
        }
        
        //casting should work here:
//        xa = ya; // xa dynamic type is Dog -- runtime exception error!
        
        //needa initialize xa:
        xa = new Animal_lab5[3];
        for (int i =0; i<3; i++){
            xa[i] = new Dog_lab5(i+" th dog ", i+100 );
        }
        
        // doesn't compile
        ya = xa;
// can't cast
//        ya = (Dog_lab5[])xa;
        

        // fails: xa[0].bark();
        xa[0].getName();
        
        //can we assign it back? yes
        Dog_lab5[] ya2 = new Dog_lab5[3];
        ya = ya2; 
        

        
        //wonder if we can do this: no, ArrayStoreException
        //ya[2] = new Animal_lab5("addAnimial",45); 
  
        
        Animal_lab5[] xa1 = new Animal_lab5[3] ;
 
        Dog_lab5[] ya1;

        for (int i =0; i<3; i++){
            xa1[i] = new Animal_lab5(i+" th animal ", i+40, 3+i );

        }
        
        //casting should not work here:
        ya1 = (Dog_lab5[]) xa1;
    }   
    
}
