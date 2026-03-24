#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
struct Node *head=NULL;

void create_node(int value){
   

   struct Node * newnode = (struct Node *)malloc(sizeof(struct Node));
   if (newnode == NULL)
   {
       printf("Memory allocation is failed ");
      exit(0);
   }
    if(head==NULL){
      newnode->data=value;
      newnode->next=NULL;
      head = newnode;

    }
    else{
        newnode->data = value;
        newnode->next = head;
        head = newnode;
    }
  
   
}
void display_node(){
    struct Node *temp = head;

    if (head == NULL)
    {
        printf("Nothing to Show ");
    }
 else{
    while(temp!=NULL){
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL");
 }
}
 void insert(int value){
     struct Node *newnode = (struct Node *)malloc(sizeof(struct Node));
     if (newnode == NULL)
     {
         printf("Memory allocation is failed ");
         exit(0);
     }
     newnode->data=value;
     
     if(head==NULL){
         newnode->next = NULL;
         head = newnode;
     }
     else{
        newnode ->next=head;
        head=newnode;
     }
 }
 void insertlast(int value){
    struct Node* temp=head;
    struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->data=value;
    newnode->next=NULL;

    if(head==NULL){
        head = newnode;

    }
    else{
        while(temp->next!=NULL){
            temp=temp->next;
        }
        temp->next=newnode;
    }
 }


int main(){
create_node(5);
create_node(5);
create_node(5);
insert(7);
insertlast(6);
display_node();
}