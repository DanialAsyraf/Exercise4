/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * Example 2: Abstract class containing the abstract and non-abstract method
 */
abstract class Vehicle2 {
    
    abstract void bike(); //abstract method -  no implementation
    
    void car() { //non-abstract method - can have implementation
        System.out.println("Car is running"); //implementation
    }
}
class Honda2 extends Vehicle2 {
    
    void bike(){ //to access abstract method
        System.out.println("Bike is running");
    }
}
public class AbstractionExample2 {
    public static void main(String[] args) {
        
    Honda2 obj=new Honda2();
    obj.bike();
    obj.car();
    }
}
