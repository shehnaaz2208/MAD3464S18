/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;
/**
 *
 * @author admin
 */
public class Triangle extends Shape{
    Triangle (int x, int y){ 
        
    }
    @Override
    void draw(){ 
        System.out.println("Double triangle at" + 
                super.x + "and" +super.y);
    }
}
