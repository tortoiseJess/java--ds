/*
 * This is subclass y
 */
package pkg61bLab4_partialLab5;

/**
 *
 * @author jessey.lin
 */
public class Dog_lab5 extends Animal_lab5 {
    
    public int ownerAge = 222222222;

    public Dog_lab5() {
        super("puppy", 2);
//        this.ownerAge = 77777;
    }

    public Dog_lab5(String name, int weight) {
        super(name, weight);
    }

    public void bark() {
        System.out.println("Woff!");
    }

    public void setOwnerAge(int ownerAge) {
        System.out.println("getOwnerAge, Dog class"+this.ownerAge);
        this.ownerAge = ownerAge;
    }

    public int getOwnerAge() {
        return this.ownerAge;
    }
    @Override
    public int getAge(){
        System.out.println("getAge from Dog class");
        return age;
    }
}
