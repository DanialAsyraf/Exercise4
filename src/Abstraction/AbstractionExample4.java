/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * Example 4: Abstract class containing overloaded abstract methods
 */
abstract class Vehicle4 {
    
    abstract void display();
    abstract void display(String msg);
}
class Honda4 extends Vehicle4 {
    
    void display() {
        System.out.println("Abstract method is invoked");
    }
    void display(String msg) {
        System.out.println(msg);
    }
}
public class AbstractionExample4 {
    
    public static void main(String[] args) {
        
        Honda4 obj=new Honda4();
        obj.display();
        obj.display("Overloaded abstract method is invoked");
    }
}
