/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Hello {
    public static void main (String[] args)
    {
       
        for (int i = 0; i < 5; i++){
         for(int j = 0; j< 5; j++){
                if(i>=1 && j>=1 && i<=3 && j<=3){
                    System.out.print(" ");
                  
                }
                else
                System.out.print("*");
            }
         System.out.println();
            
            
               
            }
    


        for (int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
                
            }
            System.out.println();
            
    }
        for(int i=2;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
            
             System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
        
    
