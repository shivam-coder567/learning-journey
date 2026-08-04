#include<stdio.h>
int main(){
    int sumeven =0,sumodd=0,n,ld;
    printf("enter a number:");
    scanf("%d", &n);
    while(n!=0){
    ld =n%10;
    if(ld%2==0){
    sumeven = sumeven + ld;
    }
    else 
    sumodd = sumodd + ld;
    n=n/10;
}
    printf("the no of digits are = %d\n %d",sumeven,sumodd);
    return 0;

}