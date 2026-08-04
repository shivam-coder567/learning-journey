#include <stdio.h>
int main()
{
    int i, power = 1, a, b;
    printf("Enter base:");
    scanf("%d", &a);
    printf("Enter power:");
    scanf("%d", &b);
    for (i = 1; i <= b; i++)
    {
        power = power * a;
    }
    printf("%d is raised to the power %d is %d", a, b, power);
    return 0;
}