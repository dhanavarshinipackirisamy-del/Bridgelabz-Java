package linkedlist;

// Ticket node
class TicketNode {
    int ticketId;
    String customerName;
    TicketNode next;

    TicketNode(int ticketId, String customerName) {
        this.ticketId = ticketId;
        this.customerName = customerName;
    }
}

class TicketSystem {
    TicketNode head = null;

    // Book ticket
    void bookTicket(int ticketId, String customerName) {
        TicketNode newNode = new TicketNode(ticketId, customerName);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Display tickets
    void displayTickets() {
        if (head == null)
            return;

        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customerName);
            temp = temp.next;
        } while (temp != head);
    }
}

public class ticketMain {
    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        ts.bookTicket(1, "Asha");
        ts.bookTicket(2, "Ravi");
        ts.displayTickets();
    }
}
