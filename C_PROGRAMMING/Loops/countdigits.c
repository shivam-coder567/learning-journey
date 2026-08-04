#include <stdio.h>
int main()
{
    int count = 0, n;
    printf("enter a number:");
    scanf("%d", &n);
    while (n != 0)
    {
        n = n / 10;
        count++;
    }
    printf("the no of digits are = %d", count);
    return 0;
}