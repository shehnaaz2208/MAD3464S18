

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Day04{
    public static void main(String args[]){
        Employee emp1 = new Employee("rutvi", "toronto",23, "E101", "12 May 2017", 10);
        emp1.name = "rutvi";
        emp1.address = "toronto";
        emp1.age = 23;
        System.out.println("Name :" + emp1.name + "\n address :"+
                emp1.address + "\n age :" +emp1.age);
        System.out.println(emp1.toString());
        TemporaryEmoloyee tE1 = new TemporaryEmoloyee("sukh", "brampton", 22, "T123", "01 may 2018", 20,
                "ios developer" , 80.85f);
        System.out.println(tE1.toString());
        PermanentEmployee pE1 = new PermanentEmployee("param", "brampton", 24, "P234", "01 may 2018", 25,
                "ios developer" , 90.85f);
        System.out.println(pE1.toString());
        
        
        
        
    }
}