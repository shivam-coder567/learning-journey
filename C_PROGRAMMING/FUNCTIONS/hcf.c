#include <stdio.h>
min(int a, int b)
{
    if (a > b)
        return b;
    else
        return a;
}
int gcd(int a, int b)
{
    int hcf;
    for (int i = 1; i <= min(a, b); i++)
    {

        if (a % i == 0 && b % i == 0)
            hcf = 1;
    }
}
int main()
{
    int a, b;
    printf("Enter 1st number :");
    scanf("%d", &a);
    printf("Enter 2nd number :");
    scanf("%d", &b);
    int hcf = gcd(a, b);
    printf("The HCF?GCD of %d & %d is %d", a, b, hcf);
    return 0;
}