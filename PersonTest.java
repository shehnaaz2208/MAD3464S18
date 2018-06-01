/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class PersonTest {
    public static void main(String args[]){
      Person sarb= new Person();
      sarb.name="Sarbjit";
      sarb.address="Toronto";
      sarb.age=26;
      
      System.out.println("Name: " +sarb.name + 
              "\n Address : " + sarb.address +  
              "\n Age : " +sarb.age);
      Person Harpreet=new Person();
      Harpreet.setName();
      String nm = Harpreet.getName();
      Harpreet.setAddress();
      String add = Harpreet.getAddress();
      Harpreet.setAge();
      int age = Harpreet.getAge();
      System.out.println("Name: " +nm + "\n Address: "+ add + "\n Age: "+ age);
      
      Person anu=new Person();
      anu.setData();
      System.out.println(anu.toString());
      
      Person aman = new Person();
      System.out.println(aman.toString());
      
      Person rimpal=new Person("Rimpal", "Brampton", 20);
      System.out.println(rimpal.toString());
    
      Person rimpal2=new Person(rimpal);
      System.out.println(rimpal2.toString());
    }
    
}