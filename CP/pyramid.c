// #include <stdio.h>

// int main()
// {
//     int row;
//     printf("Enter a positive integer: ");
//     scanf("%d", &row);

//     // Upper triangle
//     for (int i = 0; i < row; i++)😎
//     {
//         for (int j = 0; j <= i; j++)
//         {
//             printf(" 💵 ");
//         }
//         printf("\n");
//     }

//     // Lower triangle (reverse)
//     for (int i = row - 1; i >= 0; i--)
//     {
//         for (int j = 0; j <= i; j++)
//         {
//             printf(" 💵 ");
//         }
//         printf("\n");
//     }

//     return 0;
// }
#include <stdio.h>

int main()
{
    int row;
    printf("Enter a positive integer: ");
    scanf("%d", &row);

    // Upper part of the diamond
    for (int i = 1; i <= row; i++)
    {
        // Print spaces
        for (int s = 1; s <= row - i; s++)
        {
            printf("   ");
        }
        // Print emojis
        for (int j = 1; j <= (2 * i - 1); j++)
        {
            printf(" 😍 ");
        }
        printf("\n");
    }

    // Lower part of the diamond
    for (int i = row - 1; i >= 1; i--)
    {
        // Print spaces
        for (int s = 1; s <= row - i; s++)
        {
            printf("   ");
        }
        // Print emojis
        for (int j = 1; j <= (2 * i - 1); j++)
        {
            printf(" 😍 ");
        }
        printf("\n");
    }

    return 0;
}
