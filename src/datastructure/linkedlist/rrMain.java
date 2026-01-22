package linkedlist;

// Process node
class ProcessNode {
    int pid, burstTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
    }
}

class RoundRobin {
    ProcessNode head = null;

    void addProcess(int pid, int burstTime) {
        ProcessNode newNode = new ProcessNode(pid, burstTime);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }
}

public class rrMain {
    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();
        rr.addProcess(1, 5);
        rr.addProcess(2, 3);
        System.out.println("Processes added");
    }
}
