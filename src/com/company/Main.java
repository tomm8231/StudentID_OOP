package com.company;

public class Main {

    public static void main(String[] args) {
        int[] grades;

        Student st1 = new Student("Tommy", 8231, 21967496, false);
        //System.out.println(st1.getName());
        //System.out.println(st1.getStudentID());
        //System.out.println(st1.getMobileNumber());

        Student st2 = new Student("Simon", 1234, 18374623, false);
        //System.out.println(st2.getName());


        Student st3 = new Student("Rasmus", 4321, 19584736, false);
        st3.setGrades(new int[]{10, 7, 12, 10, 4, 7});


        System.out.println(st2.toString());

        //System.out.println(st1.toString());


        st3.setTutor(true);



        System.out.println(st3);

        st1.setGrades(new int[]{12,12,12,12,12,12});
        System.out.println(st1);

        st2.setGrade(1,12);
        System.out.println(st2);
        st2.setGrade(2,10);
        System.out.println(st2);

        st1.setGrade(10);
        st1.setGrade(10);
        st1.setGrade(10);
        st1.setGrade(10);


        System.out.println(st1);







    }
}
