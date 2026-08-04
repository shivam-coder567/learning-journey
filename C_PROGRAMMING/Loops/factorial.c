#include <stdio.h>
int main()
{
    int product = 1, n;
    printf("Enter any number:");
    scanf("%d", &n);
    while (n > 0)
    {
        product = product * n;
        n--;
    }
    printf("factorial= %d ", product);

    return 0;
}