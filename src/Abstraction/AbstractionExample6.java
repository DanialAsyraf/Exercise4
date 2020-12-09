/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * Example 6: Nested abstract class
 */
abstract class Vehicle6 {
    
    abstract class Car {
        abstract void display();
    }
}
class Honda6 extends Vehicle6 {
    
    class FourWheeler extends Car {
        void display() {
            System.out.println("Nested abstract class is invoked");
        }
    }
}
public class AbstractionExample6 {
    public static void main(String[] args) {
        
        Vehicle6 obj=new Honda6();
        Honda6 h=(Honda6)obj;
        Honda6.FourWheeler fw=h.new FourWheeler();
        fw.display();
    }
}
