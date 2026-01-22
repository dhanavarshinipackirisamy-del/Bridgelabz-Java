package linkedlist;

import java.util.ArrayList;

// User node
class UserNode {
    int id;
    String name;
    ArrayList<Integer> friends;
    UserNode next;

    UserNode(int id, String name) {
        this.id = id;
        this.name = name;
        friends = new ArrayList<>();
    }
}

class SocialMedia {
    UserNode head;

    void addUser(int id, String name) {
        UserNode newUser = new UserNode(id, name);
        newUser.next = head;
        head = newUser;
    }
}

public class socialMain {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Asha");
        sm.addUser(2, "Ravi");
        System.out.println("Users added");
    }
}
