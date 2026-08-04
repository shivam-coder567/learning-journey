#include <stdio.h>
int main()
{
    void fun(); // fn prototype
    fun();
    return 0;
}
void fun()
{
    printf("HELLO");
    return;
}
