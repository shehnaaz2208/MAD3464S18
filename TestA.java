/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class TestA extends TestC implements A,B,C{
   public void display(){
    System.out.println("number inside A :" + number);
   } 
   public void show(){
       System.out.println("show inside B");
   }
   public void output(){
       System.out.println("output from C");
   }
}
