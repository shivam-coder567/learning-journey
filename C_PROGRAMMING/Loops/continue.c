#include<stdio.h>
int main(){
    int i;
    // printf("Enter a number:");
    // scanf("%d",&num);
    for( i = 1; i<=100; i++){
     if((i%2)!=0) // even condition
     {
        continue;
}
    printf("%d ",i);
}
return 0;
}