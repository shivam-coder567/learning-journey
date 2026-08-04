#include <stdio.h>
#include <math.h>
int main()
{
    // int a;
    // printf("Enter a number :");
    // scanf("%d", &a);
    // int root = sqrt(a);
    // printf("THe square root is  : %d", root);
    int a;
    int b;
    printf("Enter a base :");
    scanf("%d", &a);
    printf("Enter a powerr :");
    scanf("%d", &b);
    int q = pow(a, b);
    printf("%d", q);
    return 0;
}