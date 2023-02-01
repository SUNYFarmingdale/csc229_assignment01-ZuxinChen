/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
    int ID;
    String name;
    String code;
    
    //default constructor
    Course(){
       ID = 3738;
       name = "Zuxin Chen";
       code = "CSC229";
        
    }
    //overload constructor
    Course(int i, String n, String c){
        ID = i;
        name = n;
        code =c;
    }
    
    //setters and getters
    void setID(int I){ this.ID = I; }
    void setName(String N){this.name = N;}
    void setCode(String C){this.code = C;}
    
    int getID(){ return ID; }
    String getName(){return name;}
    String getCode(){return code;}

    
}
