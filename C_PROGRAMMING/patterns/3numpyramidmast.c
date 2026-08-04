#include <stdio.h>

int main()
{
    int n;
    printf("Enter no of lines: ");
    scanf("%d", &n);

    int nst = n;
    int nsp = -1;

    for (int i = 1; i <= n; i++)
    {
        int a = 1;

        // Left side
        for (int j = 1; j <= nst; j++)
        {
            printf("%d", a);
            a++;
        }

        // Spaces
        for (int k = 1; k <= nsp; k++)
        {
            printf(" ");
        }

        // Right side
        if (i == 1)
        {
            // skip duplicate middle element
            int b = nst - 1;
            for (int j = 1; j <= nst - 1; j++)
            {
                printf("%d", b);
                b--;
            }
        }
        else
        {
            int b = nst;
            for (int j = 1; j <= nst; j++)
            {
                printf("%d", b);
                b--;
            }
        }

        nst--;
        nsp += 2;
        printf("\n");
    }

    return 0;
}