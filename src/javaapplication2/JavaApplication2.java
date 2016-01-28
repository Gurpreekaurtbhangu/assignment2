/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author c0665056
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        Student st1 = new Student("ab","c0663534","female",70);
        Student st2 = new Student("cd","c0663534","male",70);
        
        
        List<Student> k = new ArrayList<>();
        
        k.add(st1);
        k.add(st2);
        
        
        Course temp = new Course(k);
        
        System.out.println(temp.getAllByGender("male"));
        System.out.println("");
    }
    
}
    