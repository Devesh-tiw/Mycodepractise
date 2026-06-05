#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
};
   struct node *head=NULL;
void createnode(int value){
 
struct node *nn=(struct node *)malloc(sizeof(struct node));
if(!nn){
    printf("memory allocation is not completed ");
}
if(head==NULL){
    nn->data=value;
    nn->next=NULL;
    head=nn;
}
else{
nn->data=value;
    nn->next=head;
    head=nn;
}
}
void print(){
       struct node *temp=head;
    if (head==NULL){
        printf("here is nothing to print");
    }
    else{
        while(temp!=NULL){
            printf("%d->",temp->data);
temp=temp->next;
        }
        printf("->NULL");
    }
}
void insertsomewhere(int idx,int value){
    
}
int main(){
    createnode(5);
    createnode(5);
    createnode(5);
    print();
    
    
}