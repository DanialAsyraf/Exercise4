/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * Example 5: Inner abstract class
 */
class Vehicle5 {
    
    abstract class Car {
        abstract void display();
    }
class Honda5 extends Car {
    
   void display() {
       System.out.println("inner abstract class is invoked");
   }
}
}
public class AbstractionExample5 {
    public static void main(String[] args) {
        
        Vehicle5 obj=new Vehicle5(); //create new object for class Vehicle5
        Vehicle5.Car c= obj.new Honda5(); //create new object of Honda5
        c.display();
    }
}
