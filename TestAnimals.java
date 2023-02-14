package Animal;

import javax.swing.JOptionPane;

/**
Description:6.01 in-class exercise Implement Mammal/Reptile abstract classes
<pre>
Name: Tia Merheb
Course: COMP-305 FA22
Purpose:Use the project as a starter code to create Animal class
Download sample Animal.zip from BB 

Tasks:
Create a TestAnimals class to test the Animal class and subclasses.
In the TestAnimals: 
1. Create 4 objects 
   Murphy a Puddle age 2
   Ginger a Puddle age 5
   Speedy a turtle 3
   Sammy a snake 5
2. Implement mobility correctly for each subclass also override toString
   Out put of TestAnimals below using override methods such as toString
3. Implement equality and inequality for each subclass
   two dogs are the same if they are of the same age and breed
   compareTo should return 0=same Negative=Smaller Positive=Larger
4. Sample output
   Murphy is a dog(Puddle) age 2 its mobility is running.
   Ginger is a dog(Puddle) age 2 its mobility is running.
   Speedy is turtle its mobility is swimming. 
   Sammy is a snake its mobility is slithering.
   ======================================================
   Murphy == Ginger: TRUE
   Speedy.compareTo(Sammy):-2 Speedy age: 3 Sammy age: 5
</pre>
* @author Prof: A. Nuzen
*/
public class TestAnimals extends Object
{
    public static void main(String[] args)
    {
        
    dog Murphy = new dog("Murphy", "Puddle", 2, "running.") {
        @Override
        public String move() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    System.out.println(Murphy);
    
    dog Ginger = new dog("Ginger", "Puddle", 2, "running.") {
        @Override
        public String move() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    System.out.println(Ginger);
    
    Turtle Speedy = new Turtle("Speedy", 3, "swimming.") {
        @Override
        public String move() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    System.out.println(Speedy);
    
    Snake Sammy = new Snake("Sammy", 5, "slithering.") {
        @Override
        public String move() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    System.out.println(Sammy);
    
    String banner ="======================================================\n";
    
    String msg="";
    String msg1="";

    msg=  String.format("Murphy == Ginger: %B\n", Murphy.equals(Ginger));
    msg1= String.format("Speedy.compareTo(Sammy):%d Speedy age: %d Sammy age: %d\n",
             Speedy.compareTo(Sammy), Speedy.getAge(), Sammy.getAge());
    System.out.println(banner + msg + msg1);
    JOptionPane.showMessageDialog(null, msg1,
                                       "TestAnimal",
                                       JOptionPane.INFORMATION_MESSAGE);
    
    }
}

