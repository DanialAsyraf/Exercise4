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
abstract class Marks {
//Abstract method (does not have a body 
    abstract void getPercentage();

}
class A extends Marks {
double percentage=0, marks1,marks2,marks3;

    public A(double m1,double m2,double m3){
        this.marks1=m1;
        this.marks2=m2;
        this.marks3=m3;
    }
    
    public void getPercentage(){
        percentage=(marks1+marks2+marks3)/300*100;
        
        System.out.println("Percentage class A: "+percentage+"%");
    }
}
class B extends Marks{
double percentage=0, marks1,marks2,marks3,marks4;

    public B(double m1,double m2,double m3,double m4){
        this.marks1=m1;
        this.marks2=m2;
        this.marks3=m3;
        this.marks4=m4;
    }
    public void getPercentage(){
        percentage=(marks1+marks2+marks3+marks4)/400*100;
        
        System.out.println("Percentage class B: "+percentage+"%");
    }
}
public class Exercise3{
    public static void main(String[] args) {
        
        A obj1= new A(100,56,70);
        obj1.getPercentage();
        
        B obj2=new B(100,56,70,80);
        obj2.getPercentage();
    }
}
