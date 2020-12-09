/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * Example 1: Abstract class contains abstract method
 */
abstract class Vehicle {
    abstract void bike();
}
class Honda extends Vehicle { //subclass Honda inherit from super/parent class Vehicle
    
    void bike(){
        System.out.println("Bike is running");
    }
}
public class AbstractionExample1 {
    public static void main(String[] args) {
        
        Honda obj=new Honda();
        obj.bike();
    }
}
