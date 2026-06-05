#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node *head = NULL;

void createnode(int value){
    struct node *nn = (struct node *)malloc(sizeof(struct node));
    if(!nn){
        printf("memory allocation is not completed \n");
        return;
    }
    nn->data = value;
    if(head == NULL){
        nn->next = NULL;
        head = nn;
    }
    else{
        nn->next = head;
        head = nn;
    }
}

void print(){
    struct node *temp = head;
    if (head == NULL){
        printf("here is nothing to print\n");
    }
    else{
        while(temp != NULL){
            printf("%d -> ", temp->data);
            temp = temp->next;
        }
        printf("NULL\n");
    }
}

void count(){
    struct node *temp = head;
    int total = 0; // Renamed local variable to avoid clashing with function name
    while(temp != NULL){
        total++;
        temp = temp->next; // Fixed: Added increment step to prevent infinite loop
    }
    printf("Total nodes: %d\n", total);
}

void insertsomewhere(int idx, int value){
    // Edge case: If inserting at index 0, it's just like our regular createnode
    if (idx == 0) {
        createnode(value);
        return;
    }

    struct node *temp = head;
    struct node *nn = (struct node *)malloc(sizeof(struct node));
    if(!nn) return;
    nn->data = value;

    int i = 0;
    // Walk until we reach the node right BEFORE our target index
    while(temp != NULL && i < idx - 1){
        temp = temp->next;
        i++;
    }

    // If index is out of bounds, clean up memory and exit
    if(temp == NULL) {
        printf("Index out of bounds!\n");
        free(nn);
        return;
    }

    // Fixed: Crucial linking order
    nn->next = temp->next; // 1. Link new node to the rest of the list
    temp->next = nn;       // 2. Link temp to the new node
}

int main(){
    createnode(50); // Index 4
    createnode(40); // Index 3
    createnode(30); // Index 2
    createnode(20); // Index 1
    createnode(10); // Index 0
    
    printf("Before insertion:\n");
    print(); // Prints: 10 -> 20 -> 30 -> 40 -> 50 -> NULL
    
    count();
    
    printf("\nInserting 6 at index 3...\n");
    insertsomewhere(3, 6);
    
    printf("\nAfter insertion:\n");
    print(); // Expected: 10 -> 20 -> 30 -> 6 -> 40 -> 50 -> NULL
    
    return 0;
}