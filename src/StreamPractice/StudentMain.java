package StreamPractice;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student(1,"gauri","hydrabad");
        Student student1=new Student(1,"gauri","hydrabad");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);


        boolean equals = student.equals(student1);
        System.out.println(equals);
//
//
//
//        boolean b = student == student1;
//        System.out.println(b);

//        String str ="neha";
//        String str1 ="neha";
//        String str3 = new String("rakhi");
//        String str4 = new String("rakhi");
//
//        System.out.println(str.equals(str1));
//        System.out.println(str == str1);
//
//        System.out.println(str3.equals(str4));
//        System.out.println(str3 == str4);

String str = "   gauri bala  ";
//        String[] split = str.split(" ");
//        for ( String s:split) {
//            System.out.println(s);
//
//        }
//        String substring = str.substring(3);
//        System.out.println(substring);
//        System.out.println(str.subSequence(3,8));
        String trim = str.trim();
        System.out.println(trim);

    }
}
