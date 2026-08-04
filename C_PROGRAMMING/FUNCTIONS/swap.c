#include <stdio.h>
void swap(int a, int b)
{
    int temp = a;
    b = a;
    b = temp;
    return;
}
int main()
{
    int a, b;
    printf("Enter a :");
    scanf("%d", &a);
    printf("Enter b :");
    scanf("%d", &b);
    swap(a, b);
    // int temp = a;
    // a = b;
    // b = temp;
    // a = a + b;
    // b = a - b;
    // a = a - b;
    printf("the value of a is %d\n", a);
    printf("the value of b is %d", b);
    return 0;
}