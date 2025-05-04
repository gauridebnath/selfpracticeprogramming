package StreamPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeMain {
    public static void main(String[] args) {
        Employe employe1 = new Employe(1,"gauri","chandrapur","female");
        Employe employe2 = new Employe(5,"rohan","mumbai","male");
        Employe employe3 = new Employe(8,"mahesh","hydrabad","male");
        Employe employe4 = new Employe(6,"pihu","nagpur","male");
        Employe employe5 = new Employe(1,"rahi","nagpur","female");
        ArrayList<Employe> employes = new ArrayList<>();
        employes.add(employe1);
        employes.add(employe2);
        employes.add(employe3);
        employes.add(employe4);
        employes.add(employe5);
        System.out.println(employes);


        Set<String> collect1 = employes.stream().filter(i -> "male".equalsIgnoreCase(i.getGender())).map(m -> m.getAddress()).collect(Collectors.toSet());
        collect1.forEach(System.out::println);

        Optional<Employe> first = employes.stream().findFirst();
        System.out.println(first.get());

        Optional<Employe> any = employes.stream().findAny();
        System.out.println(any.get());
        boolean b = employes.stream().anyMatch(i -> "male".equalsIgnoreCase(i.getGender()));
        System.out.println(b);

        List<Employe> collect = employes.stream().distinct().collect(Collectors.toList());
//       collect.forEach(System.out.println());

//
//        Stream<Employe> employeStream = employes.stream().filter(e -> "nagpur".equalsIgnoreCase(e.getAddress()));
//       employeStream.forEach(System.out::println);
//
//        Stream<Employe> sorted = employes.stream().sorted(Comparator.comparing(Employe::getId));
//        sorted.forEach(System.out::println);
//
//        Stream<Employe> employeStream1 = employes.stream().filter(i -> "male".equalsIgnoreCase(i.getGender()));
//        employeStream1.forEach(System.out::println);
//
//        Stream<Employe> employeStream2 = employes.stream().filter(m -> m.getName().contains("rohan"));
//        employeStream2.forEach(System.out::println);
//
//        Stream<Employe> employeStream3 = employes.stream().filter(i -> i.getGender().equalsIgnoreCase("female"));
//      employeStream3.forEach(System.out::println);
//
//        List<String> collect = employes.stream().map(Employe::getName).collect(Collectors.toList());
//        System.out.println(collect);
//
//        Stream<Employe> employeStream4 = employes.stream().filter(i -> i.getAddress().startsWith("n"));
//        employeStream4.forEach(System.out::println);
//
//        Map<String, List<Employe>> collect2 = employes.stream().collect(Collectors.groupingBy(Employe::getGender));
//        collect2.forEach((k,v)-> System.out.println(k + v ));
//
//        Stream<Employe> sorted1 = employes.stream().sorted(Comparator.comparing(Employe::getName));
//        sorted1.forEach(System.out::println);
//
//        Optional<Employe> max = employes.stream().max(Comparator.comparing(Employe::getName));
//        max.ifPresent(System.out::println);
//
//        Optional<Employe> min = employes.stream().min(Comparator.comparing(Employe::getAddress));
//        min.ifPresent(System.out::println);
//
//        ArrayList<Employe> collect3= employes.stream().collect(Collectors.toCollection(ArrayList::new));
//        collect.forEach(System.out::println);

//String str ="gauri";
//String str2="gauri";
//        boolean equals = str.equals(str2);
//        System.out.println(equals);
//
//        boolean b = str == str2;
//        System.out.println(b);
   }

}

