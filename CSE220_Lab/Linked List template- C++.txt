#include <iostream>
using namespace std;

// Define the Node class
class Node {
public:
    int value;
    Node* next;

    // Constructor to initialize a node with a value
    Node(int value) : value(value), next(nullptr) {}
};

// Define the LinkedList class
class LinkedList {
private:
    Node* head;

public:
    // Constructor to initialize the linked list with an array
    LinkedList(int arr[], int size) {
        if (size == 0) {
            head = nullptr;
        } else {
            head = new Node(arr[0]);
            Node* temp = head;
            for (int i = 1; i < size; i++) {
                temp->next = new Node(arr[i]);
                temp = temp->next;
            }
        }
    }

    // Destructor to free memory
    ~LinkedList() {
        Node* current = head;
        while (current != nullptr) {
            Node* nextNode = current->next;
            delete current;
            current = nextNode;
        }
    }

    // Method to print all elements in the list
    void showList() const {
        Node* current = head;
        while (current != nullptr) {
            cout << current->value << " ";
            current = current->next;
        }
        cout << endl;
    }
};

int main() {
    int arr[] = {1, 2, 3, 4};
    int size = sizeof(arr) / sizeof(arr[0]);

    LinkedList linkedList(arr, size);
    LinkedList emptyList(nullptr, 0); // Empty list

    cout << "Linked List: ";
    linkedList.showList();

    cout << "Empty List: ";
    emptyList.showList();

    return 0;
}
