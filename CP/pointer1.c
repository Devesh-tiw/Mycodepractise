#include <stdio.h>

int main()
{
    int p = 20;

    // &p is the "Address-of" p
    printf("The Value of p is: %d\n", p);
    printf("The Address of p is: %p\n", &p);

    return 0;
}