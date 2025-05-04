package inheritancePractice;

import java.io.FileReader;

public class MethodOverloading {

    public int studentDetails(int studentId,String studentName) {
        System.out.println("studentId is :" + studentId + " " + "studentName is :" + studentName);
        studentDetails(3,"bala","mumbai");

        return studentId;
    }

    public int studentDetails(int studentId,String studentName ,String studentAddress){
        System.out.println("studentId is :" + studentId  + " "+ "studentName is :"+ studentName + "studentAddress is :"+ " "+ studentAddress);

        return 1;
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.studentDetails(1,"rakhi");
       methodOverloading.studentDetails(2,"rohan","hydrabad");


       // FileReader fileReader = new FileReader("yyy");



    }



}
