//Create a `Library` class with attributes like `bookName`, `author`, and `price`. Use static
//methods to count the total books added and instance methods to display details.
package day9;
class library{
    static int totalBooks = 0;
    library() {
        totalBooks++;
        System.out.println("Total books added: " + totalBooks);
        countBooks();

    }
    static void countBooks() {
        System.out.println("Total books added: " + totalBooks);

    }

    String bookname = "rich dad poor dad";
    String author = " robort novasaki";
    int price = 1200;
    void show(){
        System.out.println("Book:"+bookname);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
    }
       
}
public class task1 {
    public static void main(String[] args) {
        library book = new library();
        book.show();
    }
    
}
