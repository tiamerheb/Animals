/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Animal;

import java.io.BufferedReader;

/**
 *
 * @author tiamerheb
 */
public abstract class dog extends Animal
{

    /**
     * @param args the command line arguments
     */
        private int age;
        private String breed;
        private String mobility;
        public dog(String name, String breed, int age, String mobility)
        {
            super(name);
            this.age=age;
            this.breed = breed;
            this.mobility = mobility;
        }
        

        public int getAge() { return age;}
        public String getBreed() {return breed;}
        public String getMobility() {return mobility;}
        
       
        @Override public String toString() { return getName()+ " is a dog (" + getBreed() + 
                ") age " + getAge() + " its mobility is " + getMobility();}
        
        @Override public boolean equals(Object other) {
        /** two birds are the same if they have
         * same name and age */
        
        if (other == null) 
            return false;
    
        // we can use instanceof or getClass type here    
        if (!(other instanceof dog)) 
            return false;
    
        if (this == other)
            return true; 
    
        // casting Object to dog       
        dog otherDog = (dog) other;

        return (this.getAge() == otherDog.age &&
                this.getBreed().equals(otherDog.getBreed()));
        }
        
        public int compareTo(Object other) {

        if (other == null) 
            throw new java.lang.RuntimeException("compareTo: Empty Object!");

        if (this == other)
            return 0; 

        // casting Object to Dog       
        dog otherDog = (dog) other;
        return this.getAge() - otherDog.getAge(); 
    }    
 
}
