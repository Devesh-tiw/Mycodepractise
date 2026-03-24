#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
    
};
int count = 0;
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
 void countitem(){
    
      struct Node *temp = head;
     
     while (temp != NULL)
     {
         count ++;
         temp=temp->next;
     }
    
 }
     void insertspecific(int value,int pos){
        struct Node* temp=head;
        struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
        newnode->data = value;
        newnode->next = NULL;
        countitem();
        if (pos > 1 & pos < count & head != NULL)
        {
            int i = 1;
            while (i++ < pos - 1)
            {
                temp = temp->next;
              
            }
            newnode->next = temp->next;
            temp->next = newnode;
        }
            else{
                printf("check position");
         
            
        }
     }
     void deletebeg(){
         struct Node *temp = head;
         struct Node *newnode = (struct Node *)malloc(sizeof(struct Node));
        if(head==NULL){
            printf("no Nedd to delete");
        }
        else{
            head=temp->next;
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

 void deletelast()
 {
     struct Node *temp = head;
     struct Node*temp2=NULL;
      if (head == NULL)
     {
         printf("no Nedd to delete");
     }
     else
     {
         while (temp->next != NULL)
         {
             temp2 = temp;
             temp = temp->next;
         }
         temp2->next= NULL;
     }
     free(temp);
     
 }
int main(){
create_node(5);
create_node(5);
create_node(5);
insert(7);
insertlast(6);
 insertspecific(1,2);
 deletebeg();
 deletelast();
     display_node();
}