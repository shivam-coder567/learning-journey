#include<stdio.h>
int main()
{
    double x1,x2,x3,y1,y2,y3,m1,m2;
    printf("to check if all the three points fall on one straight line\n");
    printf("enter a point x1:");
    scanf("%lf",&x1);
    printf("enter a point x2:");
    scanf("%lf",&x2);
    printf("enter a point x3:");
    scanf("%lf",&x3);
    printf("enter a point y1:");
    scanf("%lf",&y1);
    printf("enter a point y2:");
    scanf("%lf",&y2);
    printf("enter a point y3:");
    scanf("%lf",&y3);
    m1=(y2-y1)/(x2-x1);
    m2 =(y3-y2)/(x3-x2);
    if(m1==m2)
    printf("three points fall in one st line");
    else
    printf("three points  not fall in one st line");
    
    return 0;
}
