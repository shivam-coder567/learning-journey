#include <stdio.h>
int main()
{
    int a = 5;
    int *x = &a;
    // VVIP *x = 7; a is changed.
    printf("%d", a); // %p se address print hota h
    return 0;
}