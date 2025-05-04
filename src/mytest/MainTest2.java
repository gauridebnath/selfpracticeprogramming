package mytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "raja mandal", "male",false);
       Employee employee2 = new Employee(7, "suma bala", "female",false);
        Employee employee3 = new Employee(8, "karan bala", "male",true);
        Employee employee4 = new Employee(2, "rani das", "female",true,"rustom mandal");
        Employee employee5 = new Employee(5, "krish debnath", "male",true);
        Employee employee6 = new Employee(6, "test test2", "other",false);
        Employee employee7 = new Employee(6, "gauri debnath", "other",true,"karan bala");

       List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5,employee7,employee6);

       List<Employee> maleGender = new ArrayList<>();
       List<Employee> femaleGender = new ArrayList<>();

        for (Employee emp: employeeList) {
            System.out.println(emp);
            if (emp.isMarried()) {
                if (emp.getHusbandName() != null) {
                    String husbandName = emp.getHusbandName();
                    String[] split = husbandName.split(" ");
                    String name = emp.getName();
                    String[] split1 = name.split(" ");
                    String newName =split1[1]  + " " + split[0];
                    emp.setName(newName);
                }
                System.out.println(employeeList);
            }
        }


//       for (int i =0 ;i<employeeList.size();i++){
//           Employee emp = employeeList.get(i);
//          // System.out.println(emp);
//           if (emp.getGender().equalsIgnoreCase("male"))
//               maleGender.add(emp);
//               if (emp.getGender().equalsIgnoreCase("female"))
//                   femaleGender.add(emp);
//
//
//           }
//
//        System.out.println(maleGender);
//        System.out.println(femaleGender);
//
    }



       }



