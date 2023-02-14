package Animal;
import javax.swing.JOptionPane;

/**
* Description: Test Animal Abstract Class 
* <pre>
* Purpose: Create a TestAnimals class to test the Animal class and subclasses.
1. Create 3 objects 
    Fox a Sparrow
    Savannah a Sparrow
    Emperor Penguin 
2. Implement mobility correctly for each subclass also override toString
   Out put of TestAnimals below using override methods such as toString
3. Implement equality and inequality for each subclass
4. Sample output

	Fox is a sparrow and its mobility is flying.
	Savannah is a sparrow and its mobility is flying.
	Emperor is a Penguine its mobility is swimming. but it can't too young
	======================================================
	Fox == Emperor: FALSE
	Fox.compareTo(Savannah):-1 Fox age: 2 Savannah age: 3

* Course: COMP-305
* Project Name: Animal
* Version: 1.0
* </pre>
* @author Prof. A. Nuzen
* Date: August 8 2020
*/
public class DemoAnimals extends Object
{
   public static void main(String[] args)
   {
      String msg="";

      Sparrow Fox = new Sparrow("Fox", 2);
      Sparrow Savannah = new Sparrow("Savannah", 3);
      Penguin Emperor = new Penguin("Emperor",3);
      String banner ="======================================================\n";
      msg = String.format("%s\n%s\n%s\n",Fox, Savannah, Emperor);
      System.out.println(msg);
      String msg1="";
      msg1= banner + String.format("Fox == Emperor: %B\n", Fox.equals(Emperor));
      msg1= String.format("%sFox.compareTo(Savannah):%d Fox age: %d Savannah age: %d\n",
                    msg1, Fox.compareTo(Savannah), Fox.getAge(), Savannah.getAge());
      System.out.println(msg1);
      JOptionPane.showMessageDialog(null, msg+msg1,
                                       "TestAnimal",
                                       JOptionPane.INFORMATION_MESSAGE);
     
   }   
}

