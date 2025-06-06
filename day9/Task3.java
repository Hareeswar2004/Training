package day9;

class library {
    static int totalBooks = 0;

    String bookname = "Rich Dad Poor Dad";
    String author = "Robert Kiyosaki";
    int price = 1200;

    library() {
        totalBooks++;
        System.out.println("Total books added: " + totalBooks);
        countBooks();
    }

    static void countBooks() {
        System.out.println("Books counted from static method: " + totalBooks);
    }

    void show() {
        System.out.println("Book: " + bookname);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Task3 {
    public static void main(String[] args) {
        library book1 = new library();
        book1.show();


    }
}

