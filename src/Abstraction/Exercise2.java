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
abstract class Bank {
//Abstract method (does not have a body 
    abstract void getBalance();

}
class BankA extends Bank {
    void getBalance(){
        System.out.println("$100");
    }
}
class BankB extends Bank {
    void getBalance(){
        System.out.println("$150");
    }
}
class BankC extends Bank {
    void getBalance(){
        System.out.println("$200");
    }
}
public class Exercise2 {
    public static void main(String[] args) {
        
        BankA obj1=new BankA();
        obj1.getBalance();
        
        BankB obj2=new BankB();
        obj2.getBalance();

        BankC obj3=new BankC();
        obj3.getBalance();        
    }
}
