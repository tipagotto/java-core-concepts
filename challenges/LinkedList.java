public class Application {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        
        list.print();
    }
}

class LinkedList {

    Node head;
    
    LinkedList() {
        this.head = null;
    }
    
    LinkedList(Node head) {
        this.head = head;
    }

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.println(current.value);

            current = current.next;
        }
    }

    public LinkedList insert(int value) {
        Node node = new Node(value);
        
        if (head == null) {
            head = node;
        } else {
            findLastNode().next = node;
        }

        return this;
    }

    private Node findLastNode() {
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        return last;
    }
}

class Node {
    
    int value;
    Node next;

    Node(int value) {
      this.value = value;
      this.next = null;
    }
}
