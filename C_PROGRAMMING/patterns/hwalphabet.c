#include <stdio.h>
int main()
{
    int n;
    printf("Enter number of rows");
    scanf("%d", &n);
    // 1
    // A B
    // 1 2 3
    // A B C D
    // 1 2 3 4 5
    for (int i = 1; i <= n; i++)
    {
        int a = 1;
        for (int j = 1; j <= i; j++)
        {
            if (i % 2 == 0)
            {
                char ch = (char)(a + 64);
                printf("%c ", ch);
                a++;
            }
            else
            {
                printf("%d ", a);
                a++;
            }
        }
        printf("\n");
    }

    return 0;
}