#include<stdio.h>
int main()
{
    int a,b,c;
     printf("Enter first side:");
     scanf("%d", &a);
     printf("Enter a second side:");
     scanf("%d", &b);
     printf("Enter a third side:");
     scanf("%d", &c);
    
     if(a+c>b && a+b>c && b+c>a){
        printf("Triangle formed");
     }
     else 
     printf("triangles doesnt exist");
     return 0;
}