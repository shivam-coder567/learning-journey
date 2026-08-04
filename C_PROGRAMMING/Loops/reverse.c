#include <stdio.h>
int main()
{
    int rev = 0, n, sum, temp;
    printf("enter a number:");
    scanf("%d", &n);
    temp = n;
    while (n > 0)
    {
        rev = rev * 10;
        rev = rev + (n % 10);
        n = n / 10;
    }
    printf("the reverse no is = %d", rev);
    sum = temp + rev;
    printf("\nsum =%d", sum);
    return 0;
}