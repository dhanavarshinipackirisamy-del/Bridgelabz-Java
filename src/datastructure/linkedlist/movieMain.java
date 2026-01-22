package linkedlist;

// Node class for doubly linked list
class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode prev, next;   // Two pointers

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieList {
    MovieNode head, tail;

    // Add movie at the end
    void addMovie(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Delete movie by title
    void deleteMovie(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Display movies forward
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }
}

public class movieMain {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.addMovie("Inception", "Nolan", 2010, 9.0);
        list.addMovie("Avatar", "Cameron", 2009, 8.5);
        list.displayForward();
    }
}

