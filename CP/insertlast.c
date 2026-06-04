#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node *head=NULL;

void createnode(){
    struct node *newnode=(struct node*)malloc(sizeof(struct node));
    if(!newnode){
        printf("memory allocation is not done");
        return;
    }
    int data;
    printf("Enter the value of data:");
    scanf("%d",&data);
    newnode->data=data;
    if(head==NULL){
        newnode->next=NULL;
        head=newnode;
    }
    else{
        newnode->next=head;
        head=newnode;
    }
}

void printing(){
    struct node *temp=head;
    if(head==NULL){
        printf("Here is nothing to print");
    }
    while(temp!=NULL){
        printf("%d->",temp->data);
        temp = temp->next;
    }
    printf("NULL\n"); // Cleaner format
}

void lastnode(){
    int data;
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    if(!newnode){
        printf("Memory allocation failed");
        return;
    }
    printf("Enter the value of last node: ");
    scanf("%d", &data); // Fixed: Added missing '&'

    newnode->data=data;
    newnode->next=NULL;
    struct node *temp=head;
    
    if(head==NULL){
        head=newnode;
    }
    else{
        // Fixed: Loop stops AT the last node instead of stepping past it into NULL
        while(temp->next != NULL){ 
            temp=temp->next;
        }
        temp->next=newnode; // Safely links your new node to the tail
    }
}

int main(){
    int ni;
    printf("Enter the number of nodes you want to add here :");
    scanf("%d",&ni);
    int i=0;
    while(i<ni){
        createnode();
        i++;
    }
    
    lastnode();
    printing();
    return 0;
}