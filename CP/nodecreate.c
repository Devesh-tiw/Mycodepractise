#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
}; // Added missing semicolon

// Declare head as a global variable so createnode can modify it
struct node* head = NULL; 

void createnode() { // Added parentheses
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    
    // 1. Check if memory allocation failed immediately
    if (!newnode) {
        printf("Memory allocation failed!\n");
        return; // Exit the function if malloc failed
    }
    
    int data;
    printf("Enter data: ");
    scanf("%d", &data); // Added missing '&'
    
    // 2. Assign values to the new block
    newnode->data = data;
    
    // 3. Insert at the beginning
    if (head == NULL) { // Fixed spelling to 'else if' / 'if' structure
        newnode->next = NULL;
        head = newnode;
    } else {
        newnode->next = head; // Point new node to the old first node
        head = newnode;       // Make head point to our new node
    }
}

int main() {
    createnode(); // Inserts first node (e.g., 10)
    createnode(); // Inserts second node at the beginning (e.g., 20)
    
    // Let's print the list to see the order!
    struct node* temp = head;
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    return 0;
}