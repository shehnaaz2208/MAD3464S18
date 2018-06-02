/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Employee extends Person {
    String eID;
    String joiningDate;
    int deptNo;
    
     Employee(){
        super();
        this.eID = "E##";
        this.joiningDate = "DD MON YYYY";
        this.deptNo = 0;
        
        
    }
    Employee(String name, String address, int age,String eID,String joiningDate, int deptNo){
        super(name,address,age);
     this.eID = eID;
     this.joiningDate = joiningDate;
      this.deptNo = deptNo;
           
        
    }
    
    @Override
            public String toString(){
                String personDetails = super.toString();
               
                String data = "Employee ID :" + this.eID +
                        "\n joining Date :" + this.joiningDate +
                        "\n Dept no :" + this.deptNo;
                return data;
            }
                    
    
}
