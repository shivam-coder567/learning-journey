#include<stdio.h>
int main(){
    int n;
    printf("Enter a number:");
    scanf("%d", &n);
    // if((n%3 == 0 || n%5 == 0) && n%15 !=0 )
    // {
    //     printf("%d it is divisible by 5 or 3 but not by 15",n);
    // }
    // else 
    //         printf("Contition is not matching");
    if(n%3==0 || n%5==0){
        if(n%15 !=0){
            printf("%d is divisible by 5 or 3 but not divisible by 15",n);
        }
            else
            {
                printf("the number is divisible by 15");
            }
        }
        else
        {
                    printf("the number is not divisble by 5 or 3");

        }

    return 0;
}