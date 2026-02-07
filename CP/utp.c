void powXY(int x, int y)
{
    int i, product;
    product = 1;
    for (i = 1; i <= y; i++)
        product = product * x;
    printf("Answer = %d", product);
}
