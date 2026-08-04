#include <stdio.h>
int main()
{
    int n;

    printf("Enter no of lines :");
    scanf("%d", &n);
    int nsp = 0; // no. of spaces
    int nst = n; // no.  of stars
    // int ml = n / 2 + 1;
    //            *
    //          * * *
    //        * * * * *
    //      * * * * * * *
    //        * * * * *
    //          * * *
    //            *
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= nsp; j++) // spaces
        {
            printf(" ");
        }
        for (int k = 1; k <= nst; k++)
        { // stars
            printf("*");
        }
        nsp++;
        nst--;
        printf("\n");
    }
    return 0;
}