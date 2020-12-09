/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author user
 */
abstract class abstractClass {
    abstract void abstractMethod();
    void concreteMethod() { // concrete methods are still allowed in abstract classes
        System.out.println("This is a concrete method.");
    }
}
class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}
class C extends abstractClass {
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}
public class Execise1 {
    public static void main(String[] args) {
    
    B obj1=new B();
    obj1.abstractMethod();
    obj1.concreteMethod();
    
    C obj2=new C();
    obj2.abstractMethod();
    obj2.concreteMethod();
    }
}
