#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next; // Corrected: C is case-sensitive, changed 'node' to 'Node'
};

// Moved 'head' to the global scope so all functions share the same linked list
struct Node *head = NULL;

void createnod()
{
    struct Node *newnode = (struct Node *)malloc(sizeof(struct Node));
    int data;
    printf("Enter the value : "); // Fixed typo "vlaue"
    scanf("%d", &data);

    if (!newnode)
    {
        printf("memory allocation is not completed!");
        exit(0);
    }
    else if (head == NULL)
    {
        newnode->data = data;
        newnode->next = NULL;
        head = newnode;
    }
    else
    {
        newnode->data = data;
        newnode->next = head;
        head = newnode;
    }
}

void deletebeg()
{
    // Removed local 'head' declaration and unnecessary malloc for 'newnode'
    struct Node *temp = head;

    if (head == NULL)
    {
        printf("deletion not possible !");
        return; // Changed exit(0) to return so the program doesn't crash here
    }
    else
    {
        if (head->next == NULL)
        
        {
            head = NULL;
            free(temp);
        }
        else
        {
            head = temp->next;
            free(temp);
            printf("one Node Deleted \n");
        }
    }
}

void print()
{
    struct Node *temp = head;

    while (temp != NULL)
    {
        printf("%d -> ", temp->data); 
        temp = temp->next;
    }
    printf("NULL\n"); 
}

int main()
{
    createnod();
    createnod();
    createnod();
    createnod();
    print();
    deletebeg();
    print();

    return 0;
}