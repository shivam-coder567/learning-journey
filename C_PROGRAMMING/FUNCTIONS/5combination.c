#include <stdio.h>
int factorial(int x)
{
    int fact = 1;
    for (int i = 1; i <= x; i++)
    {
        fact = fact * i;
    }
    return fact;
}
int combination(int n, int r)
{
    return factorial(n) / (factorial(n - r) * factorial(r));
}

int main()
{
    int n;
    printf("Enter n :");
    scanf("%d", &n);
    int r;
    printf("Enter r :");
    scanf("%d", &r);
    int ncr = combination(n, r);
    printf("%d", ncr);

    return 0;
}
