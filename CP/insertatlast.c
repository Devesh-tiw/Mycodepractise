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
    printf("memory allocairon is niot done");
    return;
}
int data;
printf("Enter the value of data:");
scanf("%d",&data);
if(head==NULL){
    newnode->data=data;
    newnode->next=NULL;
    head=newnode;

}
else{
    newnode->data=data;
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
    printf("->NULL");
}

int main(){
    int ni;
    printf("ENter the number of nodes you want to add here :");
    scanf("%d",&ni);
    int i=0;
    while(i==ni){
 createnode();
    }
   
    printing();
    return 0;
}