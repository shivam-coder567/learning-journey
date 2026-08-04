#include <stdio.h>
int main()
{
    int n, a;
    printf("enter a rows :");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        a = 1;
        for (int j = 1; j <= i; j++)
        {

            printf("%d ", a);
            a = a + 2;
        }
        printf("\n");
    }

    return 0;
}