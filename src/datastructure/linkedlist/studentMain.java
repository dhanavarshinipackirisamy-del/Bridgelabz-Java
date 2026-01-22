package linkedlist;

// Node class to store student details
class StudentNode {
    int rollNo, age;
    String name, grade;
    StudentNode next;   // Pointer to next node

    // Constructor
    StudentNode(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

// Singly Linked List class
class StudentList {
    StudentNode head;   // Head of the list

    // Add student at the end
    void addStudent(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Delete student by roll number
    void deleteStudent(int rollNo) {
        if (head == null)
            return;

        // If head node is to be deleted
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        StudentNode prev = head;
        StudentNode curr = head.next;

        // Traverse list
        while (curr != null) {
            if (curr.rollNo == rollNo) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    // Update grade using roll number
    void updateGrade(int rollNo, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    // Display all students
    void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " +
                    temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}

// Main class
public class studentMain {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addStudent(1, "Asha", 20, "A");
        list.addStudent(2, "Ravi", 21, "B");
        list.updateGrade(2, "A");
        list.display();
    }
}
