#include<stdio.h>
int main(){
    int a,b,c;
     printf("Enter a number:");
     scanf("%d", &a);
     printf("Enter a second number:");
     scanf("%d", &b);
     printf("Enter a third number:");
     scanf("%d", &c);
    
   //   if(a>b && a>c){
   //      printf("A");
   //   }
   //   if(b>a && b>c){
   //       printf("B");
   //      }
   //      if(c>a && c>b){
   //       printf("c");
   //      }
   if(a>b){
      if(a>c)
         printf("%d is greater than %d and %d",a,b,c);
      else{
          printf("%d is greater than %d and %d",c,a,b);
      }
   }
   else{
         if(b>c)
                  printf("%d is greater than %d and %d",b,a,c);
                  else
                           printf("%d is greater than %d and %d",c,b,a);


      }
   return 0;
   }



      
      
      
