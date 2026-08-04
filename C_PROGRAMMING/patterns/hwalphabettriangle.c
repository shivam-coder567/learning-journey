#include <stdio.h>
int main()
{
    int n;
    printf("Enter no of lines :");
    scanf("%d", &n);
    //         A
    //       A B
    //     A B C
    //   A B C D
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++) // for hashes
        {
            printf(" ");
        }
        int a = 65;
        for (int k = 1; k <= i; k++)
        {
            char ch = (char)a;
            printf("%c", ch);
            a++;
        }
        printf("\n");
    }
    return 0;
}