#include <stdio.h>
int main()
{
   int year; // ctrl+shift+L for many chnges
   printf("Enter a year\n");
   scanf("%d", &year);
   if (year % 4 == 0 && year != 100)
   {
      printf("Leap year");
   }
   else
   {
      printf("not a leap year");
   }
   return 0;
}