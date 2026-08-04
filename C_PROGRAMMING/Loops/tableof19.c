#include<stdio.h>
int main(){
    int i,n;
    // for( i = 19; i<=190; i= i+19){
    // printf("%d ",i);
    // }
    printf("ENter a number:");
    scanf("%d", &n);
    for( i = n; i<=(n*10); i= i+n){
    printf("%d ",i);
    }
    return 0;

}