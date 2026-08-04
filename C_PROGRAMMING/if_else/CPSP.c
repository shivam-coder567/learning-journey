#include<stdio.h>
int main()
{
    int sp,cp;
     printf("Enter a cost price and selling price");
     scanf("%d %d", &cp, &sp);
     if(sp>cp)
     {
        printf("Profit");
    }
     if(sp<cp)
        printf("loss");
    return 0;
    }