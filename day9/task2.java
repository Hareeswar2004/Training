package day9;

class Library {
    static int totalBooks = 0;

    String bookName;
    String author;
    int price;

    Library() {
        
        bookName = "Rich Dad Poor Dad";
        author = "Robert Kiyosaki";
        price = 1200;

        totalBooks++;
        System.out.println("Total books added: " + totalBooks);
        countBooks();
    }

   
    static void countBooks() {
        System.out.println("Books in library so far: " + totalBooks);
    }


    void show() {
        System.out.println("Book: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
