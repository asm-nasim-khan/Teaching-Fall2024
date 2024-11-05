Method - 1

public class MyList {
    private Node head;

    // Constructor to initialize the linked list with an array
    public MyList(int[] arr) {
        if (arr.length == 0) {
            head = null;
        } else {
            head = new Node(arr[0]);
            Node temp = head;
            for (int i = 1; i < arr.length; i++) {
                temp.next = new Node(arr[i]);
                temp = temp.next;
            }
        }
    }

    // Method to print all elements in the list
    public void ShowList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        MyList linkList = new MyList(a);
        MyList mylist2 = new MyList(new int[0]); // Empty list

        linkList.ShowList();
        mylist2.ShowList(); // Should print nothing for an empty list
    }
}

class Node {
    public int value;
    public Node next;

    // Constructor to initialize a node with a value
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}


Method-2

public class MyList {
    private Node head;

    // Constructor to initialize the linked list with an array
    public MyList(int[] arr) {
        if (arr.length == 0) {
            head = null;
        } else {
            head = new Node(arr[0]);
            Node temp = head;
            for (int i = 1; i < arr.length; i++) {
                Node newNode = new Node(arr[i]);
                temp.setNext(newNode);
                temp = newNode;
            }
        }
    }

    // Method to print all elements in the list
    public void ShowList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        MyList linkList = new MyList(a);
        MyList mylist2 = new MyList(new int[0]); // Empty list

        linkList.ShowList();  // Output: 1 2 3 4
        mylist2.ShowList();   // Output: (prints nothing)
    }
}

class Node {
    private int value;
    private Node next;

    // Constructor to initialize a node with a value
    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
