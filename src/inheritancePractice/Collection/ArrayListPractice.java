package inheritancePractice.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        System.out.println("Write a Java program to create an array list, add some colors (strings) and print out the collection");
      List<String> colors = new ArrayList<>();
      colors.add("red");
      colors.add("blue");
      colors.add("green");
      colors.add("royal blue");
        System.out.println("black");
        System.out.println(colors);


        List<String> colors2 = new ArrayList<>(10);
        colors2.add(null);
        colors2.add(null);
        colors2.add(null);
        colors2.add(null);
        colors2.add(null);
        colors2.add(null);


        Collections.copy(colors2,colors);
        System.out.println(colors2);
//colors2.addAll(colors);
//        System.out.println(colors2);


//        Write a Java program to shuffle elements in an array list.

        Collections.shuffle(colors2);
        System.out.println(colors2);

        // Write a Java program to reverse elements in an array list.

        Collections.reverse(colors);
        System.out.println(colors);

//
//
//        System.out.println(" Write a Java program to iterate through all elements in an array list.");
//
//        System.out.println("iteration");
//      for (int i =0;i<colors.size();i++){
//          System.out.println(colors.get(i));
//      }
//
//
//        System.out.println("insert element into arrayList at first position");
//
//colors.add(1,"white");
//        System.out.println(colors);
//colors.add(2,"black");
//
//
//        System.out.println(" remove 3 element"); //6
//        System.out.println(colors.remove(3));
//
//
//        System.out.println("Write a Java program to search for an element in an array list."); //7
//        System.out.println(colors.contains("maroon"));
//
//
//        System.out.println("Write a Java program to sort a given array list."); //8
//      Collections.sort(colors);
//        System.out.println(colors);
//
//
//        System.out.println("Write a Java program to copy one array list into another.");
//
//



    }




}
