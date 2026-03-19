#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next; // Fixed typo: 'NOde' to 'Node'
};

// 1. Move 'head' outside the functions so it is Global.
// This allows the list to persist across different function calls.
struct Node *head = NULL;

void insertend(int value)
{
    struct Node *newnode = (struct Node *)malloc(sizeof(struct Node));

    // 2. Check for memory allocation failure BEFORE assigning values.
    if (newnode == NULL)
    {
        printf("Memory Allocation is not done! ");
        exit(1);
    }

    newnode->data = value;
    newnode->next = NULL;

    // 3. If the list is empty, make the new node the head.
    if (head == NULL)
    {
        head = newnode;
        return; // Exit the function early
    }

    // 4. Otherwise, traverse to the end of the list.
    struct Node *temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    // Attach the new node at the end
    temp->next = newnode;
}

void print()
{
    struct Node *temp = head;

    // 5. Traverse until temp is NULL to ensure the last node prints.
    while (temp != NULL)
    {
        // Print the data, not the address of the next pointer.
        printf("%d -> ", temp->data);
        // 6. Move to the next node (prevents an infinite loop).
        temp = temp->next;
    }
    printf("NULL\n");
}

// 7. Clarified function to delete from the beginning (head)
void deleteHead()
{
    if (head == NULL)
    {
        printf("List is already empty.\n");
        return;
    }

    struct Node *temp = head;
    head = head->next; // Shift the head pointer to the second node
    free(temp);        // Free the memory of the old first node
}

int main()
{
    // I changed the numbers slightly so you can see the order they print in!
    insertend(5);
    insertend(10);
    insertend(15);

    printf("List after insertion: ");
    print();

    printf("List after deleting head: ");
    deleteHead();
    print();
    return 0;
}
