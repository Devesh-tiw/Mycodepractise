#include <stdio.h>
#include <stdlib.h>

struct Node {
    struct Node *prev;
    int data;
    struct Node *next;
};

struct Node *insertbeg(struct Node *head, int value) {
struct Node *newnode=(struct Node*)malloc(sizeof(struct Node));
newnode->data=value;
newnode->prev=NULL;
if(head==NULL){
newnode->next=NULL;

head=newnode;
}
else{
    newnode->next=head;
    head->prev=newnode;
    head=newnode;
}
return head; 
}
struct Node *display(struct Node *head)
{
    struct Node *temp=head;
    printf("NULL<=>");
    while(temp!=NULL){
        printf("%d<=>", temp->data);
        temp = temp->next;

    }
printf("NULL");
}


    int main()
    {
        struct Node *head = NULL;

        head = insertbeg(head, 10);
        head = insertbeg(head, 20);
        head = insertbeg(head, 30);

        display(head);

        return 0;
    }
