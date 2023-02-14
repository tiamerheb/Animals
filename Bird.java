package Animal;
/**
* Description: Bird Abstract subclass of Animal
* <pre>
* Purpose: 
* Bird is next level down from biology classification of aminal 
* kingdom, we have more information about the Animal but not enough
* to implement Animal mobility method. As such, Bird is still an abstract class.
* Course: COMP-305
* Student Name: Tia Merheb
* </pre>
* 
* @author Professor: Ahn Nuzen
* Date: August 8 2019
*/
public abstract class Bird extends Animal {
    private int age;
    public Bird(String name, int age){
        super(name);
        this.age=age;
     }
   /** Postpone mobility implementation we dont have 
    * have enough info to determine mobility  most birds 
    * can fly but some are flyless
    * @return string
    */     
    @Override
    public abstract String move();

    public int getAge() { return age;}    
    @Override public String toString() { return getName()+ " is a bird";}

    @Override public boolean equals(Object other) {
        /** two birds are the same if they have
         * same name and age */
        
        if (other == null) 
            return false;
    
        // we can use instanceof or getClass type here    
        if (!(other instanceof Bird)) 
            return false;
    
        if (this == other)
            return true; 
    
        // casting Object to Bird       
        Bird otherBird = (Bird) other;

        return (this.getAge() == otherBird.age &&
                this.getName().equals(otherBird.getName()));
    }
    /** Using Bird's age only as criteria
     * @param other bird
     * @return 0=same, negative=less, positive=greater
    */
    public int compareTo(Object other) {

        if (other == null) 
            throw new java.lang.RuntimeException("compareTo: Empty Object!");

        if (this == other)
            return 0; 

        // casting Object to Dog       
        Bird otherBird = (Bird) other;
        return this.getAge() - otherBird.getAge();      
    }    
}
