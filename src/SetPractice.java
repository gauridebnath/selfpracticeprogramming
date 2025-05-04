import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetPractice {
    public static void main(String[] args) {

        HashSet<String> nameSet = new HashSet<>();

        nameSet.add("rohan");
        nameSet.add("rohini");
        nameSet.add("lakshmi");
        nameSet.add("girl");
        nameSet.add("girl");                 //   duplicate not allowed
        System.out.println(nameSet);

        List<String> nameList = new ArrayList<>(nameSet);
        System.out.println(nameList.get(2));


    }
}
