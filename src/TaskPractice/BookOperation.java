package TaskPractice;

import java.util.*;

public class BookOperation {

    HashSet<Integer> integerHashSet = new HashSet<>();
    LinkedHashSet<Book> bookLinkedHashSet = new LinkedHashSet<>();

    TreeSet<Book> bookTreeSet = new TreeSet<>();

    LinkedList<Book> bookLinkedList = new LinkedList<>();


    public void addBook(Book book){
        if (!integerHashSet.contains(book.getId())) {
            integerHashSet.add(book.getId());
            bookLinkedHashSet.add(book);
             bookTreeSet.add(book);
            bookLinkedList.add(book);
            System.out.println("book added successfully");
        }
        else {
            System.out.println("duplicate id not allowed");
        }

    }

    public void removeBook(int id){
        if (integerHashSet.remove(id)){
            System.out.println("remove book id");
        }
        else {
            System.out.println("id added");
        }

    }

    public void viewAllBook(){
        System.out.println(bookLinkedHashSet);
        System.out.println(" view all books");
    }
public void viewReacentBook(){
    System.out.println("view react book");
    System.out.println(bookLinkedList);
}

public void viewAllTitles(){
    ArrayList<String> stringArrayList = new ArrayList<>();
    for (Book book : bookLinkedHashSet) {
        stringArrayList.add(book.getTitleName());

    }
    System.out.println(stringArrayList);

}

}
