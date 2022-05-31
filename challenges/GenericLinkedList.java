class GenericLinkedList<T> {

    Node<T> head;
    
    GenericLinkedList() {
        this.head = null;
    }

    public GenericLinkedList<T> insert(T value) {
        var node = new Node(value);
        
        if (head == null) {
            head = node;
        } else {
            findLastNode().next = node;
        }

        return this;
    }

    private Node findLastNode() {
        var last = head;

        while (last.next != null) {
            last = last.next;
        }

        return last;
    }
}

class Node<T> {
    
    T value;
    Node next;

    Node(T value) {
      this.value = value;
      this.next = null;
    }
}
