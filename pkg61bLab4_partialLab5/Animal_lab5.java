/*
 * This is class x, parent
 */
package pkg61bLab4_partialLab5;

/**
 *
 * @author jessey.lin
 */
public class Animal_lab5 {
    
    public String name;
    public int age;
    public int weight;
    public int numLegs;

    public Animal_lab5() {
        this.name = "Unknown";
        this.age  = 0;
        this.weight = 0;
        this.numLegs = 0;
    }

    public Animal_lab5(String name, int weight) {
        this.name = name;
        this.age  = 0;
        this.weight = weight;
        this.numLegs = 0;
    }

    public Animal_lab5(String name, int weight, int age) {
        this.name = name;
        this.age  = age;
        this.weight = weight;
        this.numLegs = 0;
    }
    

    public String getName() {
        return name;
    }

    public int getAge() {
        System.out.println("getAge from animal class ");
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void eat(int foodWeight) {
        weight += foodWeight;
    }
}
