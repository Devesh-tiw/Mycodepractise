#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL; 

void createnode() {
    // Fixed: Added sizeof() inside malloc
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    
    if (!newnode) {
        printf("Memory allocation failed!\n");
        return;
    }
    
    int thing;
    printf("Enter the data: ");
    scanf("%d", &thing);
    
    newnode->data = thing; // We can set data once out here to clean up the code
    
    if (head == NULL) {
        newnode->next = NULL;
        head = newnode;
    } else {
        newnode->next = head;
        head = newnode;
    }
} // <-- Fixed: Closed createnode() properly here

// Fixed: Moved printing() to be its own independent function
void printing() {
    struct node *temp = head; // Used 'temp' to safely traverse from the head
    
    if (temp == NULL) {
        printf("There is nothing to print.\n");
    } else {
        printf("Linked List: ");
        // Fixed: Loop runs while temp is NOT null, printing data and moving next
        while (temp != NULL) {
            printf("%d -> ", temp->data); 
            temp = temp->next; // Move to the next node in line
        }
        printf("NULL\n"); // Cleaner format for the end of the list
    }
}

int main() {
    createnode(); // Inserts first node
    createnode(); // Inserts second node at the beginning
    printing();   // Prints the entire chain
    
    return 0;
}