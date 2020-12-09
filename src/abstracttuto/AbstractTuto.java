/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracttuto;

interface DogInterface{
    
    void bark();
    void poop();
}
abstract class Dog {
      
    public void bark(){
        System.out.println("Bark!");
    }
    public abstract void poop();
}
class Chihuahua extends Dog{
    
    public void poop(){
        System.out.println("Dog pooped!");
    }
}
public class AbstractTuto {

    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();
        
        c.bark();
        c.poop();
        
    }
    
}