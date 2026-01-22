package linkedlist;

// Node for inventory item
class ItemNode {
    int id, quantity;
    String name;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

class Inventory {
    ItemNode head;

    // Add item at beginning
    void addItem(int id, String name, int quantity, double price) {
        ItemNode newNode = new ItemNode(id, name, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Calculate total inventory value
    double totalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }
}

public class inventoryMain {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItem(1, "Pen", 10, 5);
        inv.addItem(2, "Book", 5, 50);
        System.out.println("Total Value = " + inv.totalValue());
    }
}

