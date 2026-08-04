#include <stdio.h>
int main()
{
    int n, a;
    printf("enter a rows :");
    scanf("%d", &n);
    printf("enter a columns :");
    scanf("%d", &a);
    // **************....upto n no of stars
    for (int i = 1; i <= n; i++)
    {
        for (int i = 1; i <= a; i++)
            printf("*");
        printf("\n");
    }

    return 0;
}