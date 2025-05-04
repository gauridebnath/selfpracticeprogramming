package TaskPractice;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

int i;
        BookOperation bookOperation = new BookOperation();
do {
    System.out.println("LIBRARY BOOK ORGANIZER MENU");
    System.out.println("1 : Add Book");
    System.out.println("2 : Remove Book by ID");
    System.out.println("3 : View All Books (Insertion Order)");
    System.out.println("4 : View All Books (Sorted by Title)");
    System.out.println("5 :View Recently Added Books");
    System.out.println("6 :View All Book Titles");
    System.out.println("0 : Exit");
    Scanner scanner = new Scanner(System.in);
     i = scanner.nextInt();

    switch (i) {
        case 1:
            System.out.println("AddBook");
            System.out.println("Enter Book Id");
            int id = scanner.nextInt();
            System.out.println("Enter Book Title");
            String titleName = scanner.next();
            System.out.println("Enter Author Name");
            String authorName = scanner.next();
            Book book = new Book(id, titleName, authorName);
            bookOperation.addBook(book);
            break;

        case 2:
            System.out.println("Enter book id");
int i1 = scanner.nextInt();
bookOperation.removeBook(i1);
            break;

        case 3:
            System.out.println("view All Books");
bookOperation.viewAllBook();
            break;


        case 4:
            System.out.println("View All Books (Sorted by Title");
            bookOperation.viewAllTitles();
            break;

        case 5:
            System.out.println("view react book");
            bookOperation.viewReacentBook();
            break;

        case 6:
            System.out.println("view All Titles");
            bookOperation.viewAllTitles();

            break;

        case 0:
            System.out.println("stop");




    }


} while (i!=0);
}
}
