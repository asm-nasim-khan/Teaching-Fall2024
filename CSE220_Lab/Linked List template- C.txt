#include <stdio.h>
#include <stdlib.h>

// Define the Node structure
struct Node {
    int value;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->value = value;
    newNode->next = NULL;
    return newNode;
}

// Function to create a linked list from an array
struct Node* createList(int arr[], int size) {
    if (size == 0) return NULL;

    struct Node* head = createNode(arr[0]);
    struct Node* temp = head;
    for (int i = 1; i < size; i++) {
        temp->next = createNode(arr[i]);
        temp = temp->next;
    }
    return head;
}

// Function to print all elements in the list
void showList(struct Node* head) {
    struct Node* current = head;
    while (current != NULL) {
        printf("%d ", current->value);
        current = current->next;
    }
    printf("\n");
}

// Function to free the allocated memory
void freeList(struct Node* head) {
    struct Node* temp;
    while (head != NULL) {
        temp = head;
        head = head->next;
        free(temp);
    }
}

int main() {
    int arr[] = {1, 2, 3, 4};
    int size = sizeof(arr) / sizeof(arr[0]);

    struct Node* linkedList = createList(arr, size);
    struct Node* emptyList = createList(NULL, 0); // Empty list

    printf("Linked List: ");
    showList(linkedList);

    printf("Empty List: ");
    showList(emptyList);

    // Free the allocated memory
    freeList(linkedList);
    freeList(emptyList);

    return 0;
}
