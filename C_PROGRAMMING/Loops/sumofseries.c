#include <stdio.h>
int main()
{
    int sum = 0, n, temp;
    printf("enter a number:");
    scanf("%d", &n);
    // 1-2+3-4+5-6+7.....
    if (n % 2 == 0)
    {
        sum = -n / 2;
    }
    else
    {
        sum = -n / 2 + n;
    }
    printf("sum=%d", sum);
    return 0;
}