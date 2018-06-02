
 import java.util.Scanner;
public class Person {
   String name;
   String address;
   int age;
   Scanner in = new Scanner(System.in);
   //default constructor
   Person(){
       name = "unknown";
       address = "unknown";
       age = 1;
   }
   Person(String name, String address, int age){
       this.name = name;
       this.address = address;
       this.age = age;
   }
   Person(Person anotherPerson){
       this.name = anotherPerson.name;
       this.name =anotherPerson.name;
       this.name = anotherPerson.name;
               }
   void setName(){
       Scanner in = new Scanner(System.in);
       System.out.println("enter name :");
       this.name = in.nextLine();
   }
String getName(){
    return name;
}
void setaddress(){
   Scanner in = new Scanner(System.in);
    this.address = in.nextLine();
}
String getAddress(){
    return address;
}
void setAge(){
    System.out.println("enter age :");
    this.age = Integer.parseInt(in.nextLine());
    
}
 int getAge(){
     return age;
  }
 void setData(){
     setName();
     setaddress();
     setAge();
     

 }
 
   @Override
 public String toString(){
     String data = "Name :" + name + "\n address :" + address + "\n Age :" + age ;
     return data;
 }
}

