#include<stdio.h>
int main(){
    int i,num,a;
    printf("Enter a number:");
    scanf("%d",&num);
    for( i = 2; i<=num-1; i++){
    if( num%i==0){
        a =1;
        break;
    }
}
if(num==1)printf("the given number is  neither prime nor composite\n");
else if(a==0)
printf("the given number is prime\n");
else
printf("the given number is composite\n");
return 0; 
}