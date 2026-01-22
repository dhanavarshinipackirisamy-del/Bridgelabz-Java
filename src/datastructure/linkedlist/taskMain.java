package linkedlist;
// Node for circular linked list
class TaskNode {
    int id, priority;
    String name;
    TaskNode next;

    TaskNode(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
}

class TaskScheduler {
    TaskNode head = null;

    // Add task at end
    void addTask(int id, String name, int priority) {
        TaskNode newNode = new TaskNode(id, name, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Display all tasks
    void display() {
        if (head == null)
            return;

        TaskNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}

public class taskMain {
    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTask(1, "Coding", 1);
        ts.addTask(2, "Testing", 2);
        ts.display();
    }
}

