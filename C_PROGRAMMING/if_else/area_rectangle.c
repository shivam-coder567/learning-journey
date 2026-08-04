#include<stdio.h>
int main()
{
    int l,b;
     printf("lenght:");
     scanf("%d", &l);
     printf("breadth:");
     scanf("%d", &b);
     float area, perimeter;
     area = l*b;
     perimeter = 2*(l+b);
     if(area>perimeter)
     printf("the area of rectangle is greater than its perimeter");
     if(area<perimeter)
          printf("the perimeter of rectangle is greater than its area");
          if(area==perimeter)
          printf("area is equal to rectangle");


     return 0;
}