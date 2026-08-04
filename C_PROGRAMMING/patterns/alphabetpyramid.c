#include <stdio.h>
int main()
{
    int n, a;
    printf("Enter no of lines :");
    scanf("%d", &n);
    //       A
    //     A B C
    //   A B C D E
    // A B C D E F G
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++) // for hashes
        {
            printf(" ");
        }
        int a = 65;
        for (int k = 1; k <= 2 * i - 1; k++)
        {
            char ch = (char)a;
            printf("%c ", a);
            a++;
        }
        printf("\n");
    }
    return 0;
}