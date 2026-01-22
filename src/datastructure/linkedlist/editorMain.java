package linkedlist;

// Node representing text state
class TextNode {
    String text;
    TextNode prev, next;

    TextNode(String text) {
        this.text = text;
    }
}

class TextEditor {
    TextNode current;

    // Add new text state
    void addState(String text) {
        TextNode newNode = new TextNode(text);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
    }

    // Undo operation
    void undo() {
        if (current.prev != null)
            current = current.prev;
    }

    // Redo operation
    void redo() {
        if (current.next != null)
            current = current.next;
    }
}

public class editorMain {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        te.addState("Hello");
        te.addState("Hello World");
        te.undo();
        System.out.println(te.current.text);
    }
}


