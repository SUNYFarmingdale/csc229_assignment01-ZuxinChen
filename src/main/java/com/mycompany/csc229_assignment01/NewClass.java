
package com.mycompany.csc229_assignment01;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //able to input
        Course crs = new Course(); // call the Couser class
        int ID;
        String name, code;
        
        //ask user to enter the ID, name and code
        System.out.println("ID: ");
        ID = scnr.nextInt();
        System.out.println("name: ");
        name = scnr.next();
        System.out.println("code: ");
        code = scnr.next();
        
        //assign these data in setters
        crs.setID(ID);  
        crs.setName(name);
        crs.setCode(code);
        
        //print the ID, name and code by using the getters
        System.out.println("--------------------");
        System.out.println("ID: "+ crs.getID());
        System.out.println("name: "+ crs.getName());
        System.out.println("code: "+ crs.getCode());
        
    }
    
}
