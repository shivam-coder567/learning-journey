#include <stdio.h>
int main()
{
    int n;
    printf("Enter no of lines :");
    scanf("%d", &n);
    //      *********
    //      **** ****
    //      ***   ***
    //      **     **
    //      *       *
    // n =3
    int nsp = 1;
    int nst = n;
    int b = 65;
    for (int i = 1; i <= 2 * n + 1; i++)
    {
        char ch = (char)b;
        printf("%c", ch);
        b++;
    }
    printf("\n");
    for (int i = 1; i <= n; i++)
    {
        int a = 65;
        for (int j = 1; j <= nst; j++)
        {
            char ch = (char)a;
            printf("%c", ch);
            a++;
        }
        for (int k = 1; k <= nsp; k++) // spaces
        {
            printf(" ");
            a++;
        }
        for (int j = 1; j <= nst; j++)
        {
            char ch = (char)a;

            printf("%c", a);
            a++;
        }
        nst--;
        nsp += 2;
        printf("\n");
    }
    return 0;
}