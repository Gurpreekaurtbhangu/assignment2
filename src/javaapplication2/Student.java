/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author c0665056
 */
public class Student{
        String name;
        String id;
        String gender;
        double grade;

        public Student() {
        }

        public Student(String name, String gender, double grade) {
            this.name = name;
            this.gender = gender;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }
        
        public boolean equals (Student s){
            
            if(this.getClass()!=s.getClass()){
                return false;
            }
            
            if(s.getName().equals(this.name)&&s.getId().equals(this.id))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public String toString(Student s)
        {
            
            return "{\"name\":\""+s.getName()+"\",\"id\":\""+s.getId()+"\",\"gender\":\""+s.getGender()+"\",\"grade\":"+s.getGrade()+"}";
        }
}


