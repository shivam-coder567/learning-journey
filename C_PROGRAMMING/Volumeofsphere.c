#include<stdio.h>
int main()
{
    float r, volume;
    printf("enter a radius");
    scanf("%f",&r);
    volume = 4*3.14*r*r*r/3;
    printf("area=%f",volume);
    return 0;
}