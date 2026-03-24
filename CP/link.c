#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
struct Node *head;
void create_node(int value){
   
    head =NULL;

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
    printf(" %d ->", newnode->data);
   
}
void display_node(){
    struct Node *temp = head;

    if (head == NULL)
    {
        printf("Nothing to Show ");
    }
 else{
    while(temp!=NULL){
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("NULL");
 }

}

int main(){
create_node(5);
create_node(5);
create_node(5);
display_node();
}