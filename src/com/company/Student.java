package com.company;

import java.util.Arrays;

public class Student {

  private String name;
  private int studentID;
  private int mobileNumber;
  private boolean tutor;
  private int[] grades;
  private int pos;


public Student(String name, int studentID, int mobileNumber, boolean tutor) {
  this.name = name;
  this.studentID = studentID;
  this.mobileNumber = mobileNumber;
  this.tutor = tutor;
  this.grades = new int[7];
}



  public String getName() {
    return name;
  }

  public int getStudentID() {
    return studentID;
  }

  public int getMobileNumber() {
    return mobileNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStudentID(int studentID) {
    this.studentID = studentID;
  }

  public void setMobileNumber(int mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public void setTutor(boolean tutor) {
    this.tutor = tutor;
  }

public String toString() {
  return "Navn: " + name + '\n' + "Studenternummer: " + studentID + '\n' +
      "Mobilnummer: " + mobileNumber + '\n' + "Tutor: " + tutor + '\n' +
      "Karakterer: " + Arrays.toString(grades) + '\n';
}

public void addGrades(int[] grades) {
  this.grades = grades;
}

  public int[] getGrades() {
    return grades;
  }

  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  public void setGrade(int exam, int grade) {
  grades[exam-1] = grade;
  }

  public void setGrade(int grade) {
  grades[pos++] = grade;
  //pos++;
  }

}
