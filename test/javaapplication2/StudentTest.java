/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0663932
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
      
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getId();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Student instance = new Student();
        instance.setId(id);
       
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getGender();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Student instance = new Student();
        instance.setGender(gender);
      
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 0.0;
        Student instance = new Student();
        instance.setGrade(grade);
       
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testStudentClassReceivesaNonStudentObject() {
        System.out.println("testStudentClassReceivesaNonStudentObject");
        Object obj =  new Object();
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "{\"name\":\""+instance.getName()+"\",\"id\":\""+instance.getId()+"\",\"gender\":\""+instance.getGender()+"\",\"grade\":"+instance.getGrade()+"}";
        String result = instance.toString();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testStudentclassreceivesaStudentobjectwiththesamenameandid() {
        System.out.println("testStudentclassreceivesaStudentobjectwiththesamenameandid");
       
        Student instance = new Student("gurpreet","c0665056","F",3.7);
        Student instance2 = new Student("gurpreet","c0665056","F",3.7);

        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testStudentclassreceivesaStudentobjectwiththesamenamebutadifferentid () {
        System.out.println("testStudentclassreceivesaStudentobjectwiththesamenamebutadifferentid");
       
        Student instance = new Student("gurpreet","c0665056","F",3.7);
        Student instance2 = new Student("gurpreet","c06650512","F",3.7);

        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
       
    }
    
    
       @Test
    public void testStudentclassreceivesaStudentobjectwiththesameidbutadiffferentname() {
        System.out.println("testStudentclassreceivesaStudentobjectwiththesameidbutadiffferentname");
       
        Student instance = new Student("gurpreet","c0665056","F",3.7);
        Student instance2 = new Student("shaganpreet","c0665056","F",3.7);

        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
       
    }
    
    
           @Test
    public void testStudentclassreceivesaStudentobjectwithbothadifferentidandadifferentname() {
        System.out.println("testStudentclassreceivesaStudentobjectwithbothadifferentidandadifferentname");
       
        Student instance = new Student("gurpreet","c0665056","F",3.7);
        Student instance2 = new Student("shaganpreet","c0663239","F",3.7);

        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
       
    } 
    
            
}
