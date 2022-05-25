/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_06_Methods_Deeper_Look;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
/**
 * 
 * Write an application that prompts the user for the radius of a circle and uses a
 * method called circleArea to calculate the area of the circle.
 */
public class _02_circale_area {
    public static void main(String[] args) {
        area obj = new area();
        obj.calculate();
    }
}


class area{
    public void calculate(){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter circale radius (Negative to quite): ");
       double radius = input.nextDouble();
       
       
        while(radius >= 0){
            System.out.println("The are of the circle is : " + clcculate(radius));
            System.out.print("Enter circale radius (Negative to quite): ");
            radius = input.nextDouble();
        }
       
       
        if(radius < 0){
            System.out.println("You intered wrong radius, thats why program is quite");
        }
    }
    
    public double clcculate(double radius){
        double area = Math.PI * (Math.pow(radius, 2));
        return area;
    }
}



