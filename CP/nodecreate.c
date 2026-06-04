#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* next;
}; // <-- Fixed: Added semicolon

// Fixed: Changed return type from 'void' to 'struct node*'
struct node* createnode(int data) { // Fixed: Added space in 'int data'
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = data;
    newnode->next = NULL;
    return newnode; // Now this safely returns the memory address
}

int main() {
    // Fixed: Created a 'head' pointer to catch the address of the new node
    struct node* head = createnode(10);
    
    // Let's print it to prove it works!
    printf("Node created successfully!\n");
    printf("Node Data: %d\n", head->data);
    
    // Always free malloc'ed memory when done
    free(head);
    return 0;
}