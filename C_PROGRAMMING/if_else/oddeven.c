#include<stdio.h>
int main()
{
    int num;
     printf("Enter a number\n");
     scanf("%d", &num);
    // if(num%2==0)
    // printf("EVEN NUMBER");
    // else
    // printf("ODD NUMBER");

    if(num%5==0){
        printf("number is divisble by 5");
    }
    else{
                printf("number is not divisble by 5");

    }
    return 0;
}
