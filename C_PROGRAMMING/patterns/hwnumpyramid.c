#include <stdio.h>
int main()
{
    int n;
    printf("Enter no of lines :");
    scanf("%d", &n);
    //         A
    //       A B A
    //     A B C B A
    //   A B C D C B A
    for (int i = 1; i <= n; i++)
    {
        for (int q = 1; q <= n - i; q++)
        {
            printf(" ");
        }
        int b = 65;
        for (int j = 1; j <= i; j++)
        {
            char ch = (char)b;
            printf("%c", ch);
            b++;
        }
        int a = i - 1;
        for (int k = 1; k <= i - 1; k++)
        {
            char alp = (char)a + 64;
            printf("%c", alp);
            a--;
        }
        printf("\n");
    }
    return 0;
}