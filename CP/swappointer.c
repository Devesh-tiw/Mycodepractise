#include <stdio.h>
 void swap(int *a, int *b) {
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
 }
 int main() {
    int a = 5, b = 6;
    swap(&a, &b);
    printf("The swapped values of a and b are: %d %d\n", a, b);
    return 0;
}
