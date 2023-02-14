package Animal;
/**
* Description: Penguin concrete subclass of Abstract Animal

* <pre>
* purpose: Overrides move() method of abstract class because 
* we now have enough information to implement the move() method for class Penguin
* </pre>
* Student Name: Tia Merheb
* @author Professor: Ahn Nuzen
* Date: August 8 2019
*/
public class Penguin extends Bird
{
   private boolean canSwim;
   public Penguin(String name, int age){
      super(name,age);
      this.canSwim=canSwim();
   }
   /**
    * Penguin can't swim until they are 4 months old
    * @return true false
    */
   boolean canSwim() { return (getAge() >= 4);} // months
   
   /**
    * we now have enough to determine mobility of a penguin
    * @return mobility string swimming...
    */
   @Override public String move(){ return ("swimming.");}
   @Override public String toString() {
      return String.format( "%s is a penguine its mobility is %s %s",
                                    getName(),move(),
                                    canSwim?"and it can":"but it can't, too young");
   }
}
