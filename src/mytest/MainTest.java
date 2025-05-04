//package mytest;
//
//import java.util.*;
//
//public class MainTest {
//    public static void main(String[] args) {
//        Employee employee1 = new Employee(1, "raja mandal", "male",false);
//        Employee employee2 = new Employee(7, "suma bala", "female",false);
//        Employee employee3 = new Employee(8, "karan bala", "male",true);
//        Employee employee4 = new Employee(2, "rani das", "female",true,"rustom mandal");
//        Employee employee5 = new Employee(5, "krish debnath", "male",true);
//        Employee employee6 = new Employee(6, "test test2", "other",false);
//        Employee employee7 = new Employee(6, "gauri debnath", "other",true,"karan bala");
//
//        List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5,employee7,employee6);
//
//        for (Employee emp : employeeList) {
//            System.out.println(emp);
//            if (emp.isMarried() &&  emp.getHusbandName() != null) {
//                    String husbandName = emp.getHusbandName();
//                    String[] split = husbandName.split(" ");
//                    String name = emp.getName();
//                    String[] split1 = name.split(" ");
//
//                    String newName = split1[0] + " " + split[1];
//                    emp.setName(newName);
//
//
//            }
//           // employeeList.add(new Employee(10,"nehsh", "femaile",true,"hdye fhfu"));
//        }
//        System.out.println(employeeList);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////List<Employee>  malegenderList= new ArrayList();
////List<Employee> femalegenderList = new ArrayList();
////        System.out.println("print for Each");
////        for (Employee emp : employeeList){
////            System.out.println(emp.getName()+ " " + "lenghtis "+ emp.getName().length());
////if (emp.getGender().equalsIgnoreCase("male")){
////  malegenderList.add(emp);
////
////}
////else if (emp.getGender().equalsIgnoreCase("female")){
////    femalegenderList.add(emp);
////
////}else {
////    System.out.println("other");
////}
////            System.out.println( "male gender list "+ malegenderList);
////            System.out.println("female gender list " + femalegenderList);
////        }
//
//
//
////        System.out.println("print forloop");
////
////        for (int i=0; i<employeeList.size();i++){
////            System.out.println(employeeList.get(i));
////        }
////        System.out.println("use itrator");
////        Iterator<Employee> iterator = employeeList.iterator();
////        while(iterator.hasNext()){
////            System.out.println(iterator.next());
////
////        }
//
//    }
//}
