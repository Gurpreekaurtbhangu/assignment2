/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author c0663932
 */
public class Course {
    
    
    private List<Student> students; 
    
    public Course(){
        students = new ArrayList<>();
    }
    
    public Course(List<Student> student){
        
        students=student;
    }
    
    public void add(Student student) {
        students.add(student);
    }
    
    public void remove(Student student){
        students.remove(student);
    }
    
    public void remove(int position){
        students.remove(position);
    }
    
    public void remove(String Id){
        for(int i=0;i<students.size();i++)
        {
            if(Id==students.get(i).getId())
                students.remove(i);
        }
    }
    
    public void insert(Student student, int position){
        students.add(position, student);
    }
    
    public Student get(String Id){
        
        Student st = new Student();
        
        for(int i=0;i<students.size();i++){
            if(Id==students.get(i).getId())
                st=students.get(i);
        }
        
        return st;
    }
    
    public Student get(int position){
        if(0 <= position && position < students.size()){
        
        return students.get(position);
    }else {
            return null;
        }
    }
    public List<Student> getAll(){
        
       
       if(students.isEmpty())
       {
           return null;
       }
       else
       {
           return students;
       }
    }
    
    public boolean equals(Object obj){
        
        if(obj!=null && obj instanceof Course){
            Course co = new Course();
            co = (Course) obj;
            return this.students.equals(co.students);
        }
        else
            return false;
    }
    
    @Override
    public String toString(){
        
        String temp="";
        
        for (int i=0; i<students.size();i++)
        {
            temp+=students.get(i).toString()+","+"\n";
        }
        
        temp=temp.substring(0,temp.length()-2);
        
        return temp;
    }
    
    public Set<Student> getAllByGender(String gender){
     
        Set<Student> temp = new HashSet<>();
        
        for (int i=0 ;i<students.size();i++)
            if(gender==students.get(i).getGender())
                temp.add(students.get(i));
        
        return temp;
    
    }
    
    public Map<String, Set<Student>> getGradeMap() 
    {
        Map<String, Set<Student>> map = new HashMap();

        String value[] = {"A", "B", "C", "D", "F"};   
        String mark = "";
        double score;

        for (String key : value) 
        {
            Set<Student> st = new HashSet();

            for (Student student : students) 
            {
                score=student.getGrade();
                        
                if (score>90 && score <=100) 
                    mark = "A";
                else if (score>80 && score <=90) 
                    mark = "B";
                else if (score>70 && score <=80) 
                    mark = "C";
                else if (score>60 && score <=70) 
                    mark = "D";
                else 
                    mark = "F";
                
                if (key.equals(mark))
                    st.add(student);
            }

            if (!st.isEmpty()) 
                map.put(key, st);
        }
        return map;
    }    
}
    