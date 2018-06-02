/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class TemporaryEmoloyee extends Employee{
    String designation;
    float hourlyRate;
    
    public TemporaryEmoloyee(){
        this.designation = "unknown";
        this.hourlyRate = 0.0f;
        
        
        
    }
    public TemporaryEmoloyee(String name, String address, int age,
            String eID, String joiningDate, int deptNo, String designation,
            float hourlyRate){
        super(name,address, age, eID, joiningDate, deptNo);
        this.designation = designation;
        this.hourlyRate = hourlyRate;
        
    }
    public String toString(){
        return (super.toString() + "\n designation :" +
                this.designation + "\n hourlyRate :" +
                this.hourlyRate);
    }
   
}
