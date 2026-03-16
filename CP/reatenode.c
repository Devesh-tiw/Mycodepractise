#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node *head = NULL;

void createNodeList()
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    int data;

    if (!newNode)
    {
        printf("Memory allocation failed\n");
        exit(0);
    }

    printf("Enter data for createNodeList: ");
    scanf("%d", &data);

    if (head == NULL)
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
}

void insertAtBeginning(int value)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

    if (!newNode)
    {
        printf("Memory allocation failed\n");
        exit(0);
    }

    newNode->data = value;

    // Notice how this logic works even if head is NULL!
    newNode->next = head;
    head = newNode;

    printf("One node inserted with value %d!!!\n", value);
}

int main()
{
    int n;

    // 1. Get a number from the user
    printf("Enter the value of n: ");
    scanf("%d", &n);

    // 2. Pass that number into your insert function
    insertAtBeginning(n);

    // 3. Call your other function (which asks for its own input)
    createNodeList();

    // Let's print a success message to know it worked
    printf("The current head of the list has the data: %d\n", head->data);

    return 0;
}