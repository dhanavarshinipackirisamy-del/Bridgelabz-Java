package linkedlist;
// Node for book
class BookNode {
    int id;
    String title;
    boolean available;
    BookNode prev, next;

    BookNode(int id, String title, boolean available) {
        this.id = id;
        this.title = title;
        this.available = available;
    }
}

class Library {
    BookNode head, tail;

    void addBook(int id, String title, boolean available) {
        BookNode newBook = new BookNode(id, title, available);

        if (head == null) {
            head = tail = newBook;
            return;
        }

        tail.next = newBook;
        newBook.prev = tail;
        tail = newBook;
    }

    void display() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.available);
            temp = temp.next;
        }
    }
}

public class libraryMain {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(101, "Java", true);
        lib.addBook(102, "DSA", false);
        lib.display();
    }
}
