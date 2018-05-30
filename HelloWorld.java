/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hpk
 */
public class HelloWorld {public static void main(String args[])
{ System.out.println("HelloWorld");

int n1 = 10;
float f1=10.5f;
double d1=12.345456677;
short s1=12;
char c1='a';
String str1="Java";
boolean b1=true;
System.out.println("value of n1 is"+n1);
n1*=20;
System.out.println("value of n1 is"+n1);
n1++;
System.out.println("value of n1 is"+n1);
++n1;
System.out.println("value of n1 is"+n1);
n1--;
System.out.println("value of n1 is"+n1);
--n1;
System.out.println("value of n1 is"+n1);
int n2 =n1++;
System.out.println("value of n1 is"+n1);
c1 = 'A';
System.out.println("value of c1 is"+(c1+10));
System.out.println("value of c1 is"+(char)(c1+10));
System.out.println("value of c1 is"+ ++c1);
System.out.println("value of c1 is"+ c1++);
        }
}


