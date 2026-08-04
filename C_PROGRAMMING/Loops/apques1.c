#include<stdio.h>
int main(){
    int i,n;
    printf("ENter a number:");
    scanf("%d", &n);
    for( i = 1; i<=(2*n-1); i= i+2){
    printf("%d ",i);
    }
    return 0;
}