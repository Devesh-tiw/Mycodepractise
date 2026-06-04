#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
}; 


struct node* head = NULL; 

void createnode() { 
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    
    
    if (!newnode) {
        printf("Memory allocation failed!\n");
        return; 
    }
    
    int data;
    printf("Enter data: ");
    scanf("%d", &data);
    newnode->data = data;
    
    if (head == NULL) { 
        newnode->next = NULL;
        head = newnode;
    } else {
        newnode->next = head;
        head = newnode;    
    }
}

int main() {
    createnode(); 
    createnode();
    struct node* temp = head;
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    return 0;
}