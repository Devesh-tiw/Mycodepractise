#include<stdio.h>
#include<stdlib.h>
struct node{
    struct node *prev;
    int data;
    struct node *next;  
};
struct node* head=NULL;
void insertatfirst(int value){
    struct node *nn=(struct node*)malloc(sizeof(struct node));
    if(!nn){
        printf("memory allocation is not done");
        return;
    }
     nn->data = value;
     nn->prev=NULL;
     if(head==NULL){
        nn->next=NULL;
        head=nn;
     }
     else{
         nn->next=head;
         head->prev=nn;
         head=nn;
     }
}
void print(){
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
int main(){
    insertatfirst(10);
    insertatfirst(20);
    insertatfirst(30);
    insertatfirst(40);
    insertatfirst(50);
    print();
    return 0;
}