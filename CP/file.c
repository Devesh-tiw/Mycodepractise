#include <stdio.h>
#include <stdlib.h>

int main()
{
    char filename[20], ch;
    FILE *fp;

    printf("\nEnter the file name to be created: ");
    scanf("%s", filename);

    fp = fopen(filename, "w"); // open file in write mode

    if (fp == NULL)
    {
        printf("\nUnable to open file");
        exit(0);
    }

    printf("\nEnter some text to file (Ctrl + D to end):\n");

    ch = getchar(); // to consume newline after scanf
    ch = getchar(); // read first character

    while (ch != EOF)
    {
        fputc(ch, fp);  // write character to file
        ch = getchar(); // read next character
    }

    fclose(fp); // close the file

    printf("\nData written to file successfully.\n");

    return 0;
}
