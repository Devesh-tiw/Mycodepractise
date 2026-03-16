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
        printf("Memory allocation is not provided !");
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

void lastinsert()
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    int value;
    struct Node *temp = head;

    printf("Enter the value to add to the end: ");
    scanf("%d", &value);

    newNode->data = value;
    newNode->next = NULL;

    if (head == NULL)
    {
        head = newNode;
    }
    else
    {
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newNode;
    }
    // Added a newline here to make the output cleaner
    printf("Inserted: %d\n", newNode->data);
}

// THE FIXED PRINT FUNCTION
void print()
{
    // 1. Just start the temporary pointer at the head
    struct Node *temp = head;

    printf("Your List: ");

    // 2. Loop until you fall off the end
    while (temp != NULL)
    {
        // 3. Print the data inside the node
        printf("%d -> ", temp->data);

        // 4. Move forward INSIDE the loop
        temp = temp->next;
    }
    printf("NULL\n");
}

int main()
{
    createnode(); 
    lastinsert();
    lastinsert();
    lastinsert();
    lastinsert();
    print();      // Prints the whole chain

    return 0;
}