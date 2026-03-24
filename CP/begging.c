#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node *head = NULL;

void createnode()
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

    if (!newNode)
    {
        printf("Memory allocation is not provided !\n");
        exit(0);
    }
    else if (head == NULL)
    {
        newNode->data = 5;
        newNode->next = NULL;
        head = newNode;
    }
    else
    {
        newNode->data = 5;
        newNode->next = head;
        head = newNode;
    }
}

void beginningadd()
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

    
    if (!newNode)
    {
        printf("Memory allocation failed!\n");
        exit(0);
    }

    int value;
    printf("Enter the value to add: ");
    scanf("%d", &value);

    newNode->data = value;

    if (head == NULL)
    {
        newNode->next = NULL;
        head = newNode;
    }
    else
    {
        newNode->next = head;
        head = newNode;
    }

    printf("\nOne Node Inserted with value: %d\n", newNode->data);
}

// THE FIXED PRINT FUNCTION
void printall()
{
    // 1. Start your temporary pointer at the head
    struct Node *temp = head;

    printf("\nYour Linked List: ");

    // 2. Loop as long as you haven't hit the end of the chain
    while (temp != NULL)
    {
        // 3. Print the data of the current node
        printf("%d -> ", temp->data);

        // 4. Move temp to the next node in the chain
        temp = temp->next;
    }
    printf("NULL\n");
}

int main()
{
    // This will add a node with the number '5'
    createnode();

    printall();
    // This will ask you for a number and add it in front of the '5'
    beginningadd();

    if (head != NULL)
    {
        printf("\nThe numbers were inserted successfully!\n");
    }

    // Call your new function to see the whole chain!
    printall();

    return 0;
}