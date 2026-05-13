#include <stdio.h>
#include <stdlib.h>
#define MAX 5

int stack[MAX], top = -1;

void push()
{
    int val;
    if (top == MAX - 1)
        printf("\nOverflow!");
    else
    {
        printf("\nEnter element: ");
        scanf("%d", &val);
        stack[++top] = val;
    }
}

void pop()
{
    if (top == -1)
        printf("\nUnderflow!");
    else
        printf("\nPopped: %d", stack[top--]);
}

void peek()
{
    if (top == -1)
        printf("\nEmpty");
    else
        printf("\nTop: %d", stack[top]);
}

void display()
{
    if (top == -1)
        printf("\nEmpty");
    else
    {
        for (int i = top; i >= 0; i--)
            printf("%d ", stack[i]);
    }
}

int main()
{
    int ch;
    while (1)
    {
        printf("\n1.Push 2.Pop 3.Peek 4.Display 5.Exit: ");
        scanf("%d", &ch);
        if (ch == 5)
            break;
        switch (ch)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
            
        case 4:
            display();
            break;
        }
    }
    return 0;
}