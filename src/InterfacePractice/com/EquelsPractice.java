package InterfacePractice.com;

import java.util.Arrays;
import java.util.List;

public class EquelsPractice {
    public static void main(String[] args) {


        String str = "gauri";
        String str1 = "rahi";
        String str2 = new String("gauri");
        String str3 = new String("gauri");
        String str4 ="gauri";

        boolean equals = str.equals(str1);
        System.out.println(equals);

        boolean equals1 = str.equals(str2);
        System.out.println(equals1);

        boolean b = str2 == str3;
        System.out.println(b);
        boolean b1 = str == str4;
        System.out.println(b1);

    }
}
