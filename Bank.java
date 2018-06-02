/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
  public class Bank{
      String bankName;
      String bankID;
      Bank(){
          this.bankName = "unknown";
          this.bankID = "I##";
      }
      Bank(String bankName, String bankId){
          this.bankName = bankName;
          this.bankID = bankId;
          
      }
      void setbankname(){
          System.out.println("bank name :" +bankName);
          
      }
      String getbankname(){
          return bankName;
          
      }
      void setbankid(){
          System.out.println("bank id :" + bankID);
          
      }
      String getbankID(){
          return bankID;
      }
      public String toString(){
          String data = "bank name :" + bankName + "\n bankid :" + bankID;
          return data;
      }
             
      
  }  
    

