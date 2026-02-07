#include<stdio.h>

int main() {
    int i;
    int a[5] = {2, 5, 8, 9, 6};

    printf("The array elements are:\n");
    for(i = 0; i < 5; i++) {
        printf("%d ", a[i]);
    }

    return 0;
}             