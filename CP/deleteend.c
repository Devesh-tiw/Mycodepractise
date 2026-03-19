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
    struct Node *newnode = (struct Node *)malloc(sizeof(struct Node));
    if (newnode == NULL)
    {
        printf("Memory Allocation is not done!\n");
        exit(1);
    }

    int data;
    printf("Enter data: ");
    // 1. FIX: Added the '&' before data. scanf needs the memory address!
    scanf("%d", &data);

    newnode->data = data;
    newnode->next = NULL;

    if (head == NULL)
    {
        head = newnode;
    }
    else
    {
        // 2. FIX: Properly traverse to the end to attach the new node
        struct Node *temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newnode;
    }
}

// I renamed this to 'insertAtPosition' since that matches what the logic is trying to do!
void insertAtPosition(int value, int pos)
{
    struct Node *newnode = (struct Node *)malloc(sizeof(struct Node));
    if (newnode == NULL)
    {
        printf("Memory Allocation is not done!\n");
        exit(1);
    }
    newnode->data = value;

    // 3. FIX: Handle inserting at the very beginning (position 1)
    if (pos == 1 || head == NULL)
    {
        newnode->next = head;
        head = newnode;
        return;
    }

    struct Node *temp = head;

    // 4. FIX: Use a counter loop to find the right position, not a pointer comparison.
    // We stop at 'pos - 1' because we need to attach the new node to the node just *before* it.
    for (int i = 1; i < pos - 1 && temp != NULL; i++)
    {
        temp = temp->next;
    }

    // If temp is NULL here, the user asked for a position larger than the list size
    if (temp == NULL)
    {
        printf("\nPosition %d is out of bounds!\n", pos);
        free(newnode); // Prevent memory leak
    }
    else
    {
        // Splice the new node into the list
        newnode->next = temp->next;
        temp->next = newnode;
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

void deleteHead()
{
    if (head == NULL)
    {
        printf("List is already empty.\n");
        return;
    }
    struct Node *temp = head;
    head = head->next;
    free(temp);
}

int main()
{
    // Let's create a base list of 3 items (you can type 10, 20, 30)
    printf("--- Create Initial List ---\n");
    createnode();
    createnode();
    createnode();

    printf("\nInitial List: ");
    print();

    // Now insert at specific positions
    printf("\nInserting 5 at position 2...\n");
    insertAtPosition(5, 2);
    print();

    printf("\nInserting 99 at position 4...\n");
    insertAtPosition(99, 4);
    print();

    printf("\nList after deleting head: ");
    deleteHead();
    print();

    return 0;
}
