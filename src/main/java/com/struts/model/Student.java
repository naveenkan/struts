package com.struts.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Student {
	
   @Id
   @GeneratedValue
   private int id;
   @Column(name = "last_name")
   private String lastName;
   @Column(name = "first_name")
   private String firstName;
   private int marks;
   
   public int getId() {
    return id;
   }
   
   public void setId(int id) {
    this.id = id;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   public int getMarks() {
      return marks;
   }
   
   public void setMarks(int marks) {
      this.marks = marks;
   }
}
