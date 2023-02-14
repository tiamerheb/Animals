package Animal;
/**
* Description: Sparrow concrete subclass of Abstract Animal

* <pre>
* purpose: Overrides move() method of abstract class because 
* we now have enough information to implement the move() method for class Sparrow
* </pre>
* Student Name: YOUR NAME
* @author Professor: Ahn Nuzen
* Date: August 8 2019
*/
public class Sparrow extends Bird
{
   private boolean canFly;
   
   public Sparrow(String name, int age){
      super(name, age);
      this.canFly=canFly();   
   }
   /** 
    * older than 2 weeks
    * @return true false
    */
   boolean canFly() { return (getAge() >= 2); }

   /**
    * we now have enough to determine mobility of a sparrow
    * @return mobility string flying..
    */
   @Override public String move(){return ("flying");}
   @Override public String toString() {
      return String.format( "%s is a sparrow and its mobility is %s.",
                            getName(),move(),canFly?"can":"can't");
   }
}
