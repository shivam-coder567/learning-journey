#include <stdio.h>
int main()
{
    // what is typecasting
    //     int x = 65;
    //     printf("%d\n", x);
    //     char ch = (char)x;
    //     printf("%c", ch);
    //     return 0;
    for (int i = 65; i <= 90; i++)
    {
        printf("%d ", i);
        char ch = (char)i;
        printf("%c\n", ch);
    }
    return 0;
}
