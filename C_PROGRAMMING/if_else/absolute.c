#include<stdio.h>
int main()
{
    int num;
     printf("Enter a number\n");
     scanf("%d", &num);
     if(num<0){
     num = num*(-1);
     printf("the absolute value is:%d",num);
     }
     else
     printf("the absolute value is:%d",num);
     return 0;
}