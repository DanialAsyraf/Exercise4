/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * abstraction using constructor
 */
abstract class Vehicle3 { //constructor with parameter
    String msg;
    
    Vehicle3(String msg) {
        this.msg=msg;
    }
    void display(){ //non-abstract method
        System.out.println(msg);
    }
}
class Honda3 extends Vehicle3 {
    Honda3(String msg) {
        super(msg);
    }
}
public class AbstractionExample3 {
    public static void main(String[] args) {
    
    Honda3 obj=new Honda3("Constructor is invoked");
    obj.display();
    
    }
}
