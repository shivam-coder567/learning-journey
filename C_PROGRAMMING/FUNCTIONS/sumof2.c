#include <stdio.h>
int add(int x, int y)
{
    return x + y;
}
int main()
{
    int a;
    printf("Enter 1st number :");
    scanf("%d", &a);
    int b;
    printf("Enter 2nd number :");
    scanf("%d", &b);
    int sum = add(a, b);
    printf("SUM:%d", sum);
    return 0;
}