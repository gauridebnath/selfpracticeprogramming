import inheritancePractice.TreeSetDecendingOrder;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        TreeSet<Integer> nameTreeset = new TreeSet<>(new TreeSetDecendingOrder()
        );
        nameTreeset.add(5);
        nameTreeset.add(15);
        nameTreeset.add(3);
        nameTreeset.add(4);
        nameTreeset.add(56);
        nameTreeset.add(2);    // duplicate value not allowed

//        System.out.println(nameTreeset);
 System.out.println(nameTreeset.descendingSet());  // directUsing methode call

        System.out.println(nameTreeset);
    }
}
