import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListListPractice {

    String name;


    public ArrayListListPractice(String name) {

        this.name = name;

    }

    @Override
    public String toString() {
        return "ForEachPractice{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        ArrayListListPractice forEachPractice1 = new ArrayListListPractice("gauri");
        ArrayListListPractice forEachPractice2 = new ArrayListListPractice("neha");
        ArrayListListPractice forEachPractice3 = new ArrayListListPractice("roshni");
        ArrayListListPractice forEachPractice4 = new ArrayListListPractice("neha");


        list.add(forEachPractice1.name);
        list.add(forEachPractice2.name);
        list.add(forEachPractice3.name);
        list.add(forEachPractice4.name);


        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);


       // System.out.println(list.get(1));
        //System.out.println(list.contains("roshni"));

        List<String> checkList = List.of("roshni", "negha"); //unmodifable list
       // checkList.add("jyoti");

      //  String[] array =(String[]) list.toArray();

        //System.out.println(list.containsAll(checkList));

//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//
        for ( String str:list) {
            System.out.println(str);
        }

        }

    }

