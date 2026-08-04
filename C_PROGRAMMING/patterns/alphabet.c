#include <stdio.h>
int main()
{
    int n;
    printf("Enter number of rows");
    scanf("%d", &n);
    // A B C D
    // A B C D
    // A B C D
    // A B C D
    for (int i = 1; i <= n; i++)
    {
        int a = 65;
        for (int j = 1; j <= n; j++)
        {
            char ch = (char)a;
            printf("%c ", ch);
            a++;
        }
        printf("\n");
    }

    return 0;
}