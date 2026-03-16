#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node* next;
};
struct Node *head = NULL;
void createNodeList()
{
    
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    int data;
    printf("enter data");
    scanf("%d", &data);
    if (!newNode)
    {
        printf("Memory allocation failed\n");
        exit(0);
    }
    else if (head == NULL)
    {
        newNode->data = data;
        newNode->next = NULL;
        head = newNode;
    }
    else
    {
        newNode->data = data;
        newNode->next = head;
        head = newNode;
    }
    printf("%d",newNode->data);
}

int main(){
 createNodeList();

}