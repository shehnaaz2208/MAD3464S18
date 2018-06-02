/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class BankAccount extends Bank {
    String accountno;
    String ownername;
    String balanceammount;
    public BankAccount(){
        this.accountno = "####";
        this.ownername = "unknown";
        this.balanceammount = "0000";
        
    }
    public BankAccount(String bankname, String bankid,String accountno, String ownername, String balanceammount){
           super(bankname, bankid);
           this.accountno = accountno;
           this.balanceammount = balanceammount;
           this.ownername = ownername;
    }
           
    public String toString(){
        String personaldetails = super.toString();
        String data = "\n accountno :" + this.accountno+ "\n ownername :" + this.ownername + 
                "\n balanceammount :" +this.balanceammount;
            return personaldetails + data;
    }
}


           
    
    
    

