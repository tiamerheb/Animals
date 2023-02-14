package Animal;
/**
* Description: Animal Abstract Class 
* <pre>
* Purpose:Implements Animal class and subclasses using Java Abstract.
* Using the biology classification of aminal kingdom, a subclass of 
* Animal, Bird will be implemented. As well as two concrete subclasses to 
* Bird to illustrate mobility method.
* Course: COMP-305
* Student Name: Tia Merheb
* </pre>
* @author Prof. A. Nuzen
* Date: Oct 4   2022
*/
public abstract class Animal extends Object
{
   private String name;
   private int age;
   
   /** abstract method postpone mobility to subclasses with more info
     * @return mobility string such as walking, running, flying, swimming... */
   public abstract String move();

   public Animal(String name) {this.name = name;}
   public String getName() {return name;}
   public int getAge() {return age;}
   public void setName(String name) {this.name = name;}
   @Override public String toString() {return "Animal " + name + " ";}
   
}

