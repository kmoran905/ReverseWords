/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseWords;
import java.util.Scanner;

/**
 * May 26, 2021
 * @author KHYLE
 */
public class ReverseWords {

    /**
     * @param args the command line arguments
     */        
           
    public static void main(String[] args) {
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string: ");
        name=input.nextLine();
        
        char[] revName=name.toCharArray();
        
        for(int i= revName.length-1; i>=0;i--)
        {
            System.out.print(revName[i]);
        }
    }

}
            
        
    
    

