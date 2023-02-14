/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author tiamerheb
 */
public abstract class Turtle extends Animal 
{
    private int age;
    private String mobility;
    public Turtle(String name, int age, String mobility)
    {
        super(name);
        this.age=age;
        this.mobility = mobility;
    }

    public int getAge() { return age;}
    public String getMobility() {return mobility;}


    @Override public String toString() { return getName()+
            " is a turtle its mobility is " + getMobility();}
    
    @Override public boolean equals(Object other) {
        /** two birds are the same if they have
         * same name and age */
        
        if (other == null) 
            return false;
    
        // we can use instanceof or getClass type here    
        if (!(other instanceof Snake)) 
            return false;
    
        if (this == other)
            return true; 
    
        // casting Object to snake       
        Animal otherAnimal = (Animal) other;

        return (this.getAge() == otherAnimal.getAge());
        }
        
        public int compareTo(Object other) {

        if (other == null) 
            throw new java.lang.RuntimeException("compareTo: Empty Object!");

        if (this == other)
            return 0; 

        // casting Object to Snake       
        Animal otherAnimal = (Animal) other;
        return this.getAge() - otherAnimal.getAge(); 
    }    

}
