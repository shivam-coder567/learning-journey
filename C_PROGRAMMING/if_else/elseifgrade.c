#include<stdio.h>
int main(){
    int grade;
    printf("grade according to the percentage\n");
    printf("Enter your percentage:");
    scanf("%d", &grade);
    if(grade>=90)
    printf("EXCELLENT");
    else if ( grade>=80)
    printf("VERY GOOD");
     else if ( grade>=70)
    printf("GOOD");
     else if ( grade>=60)
    printf("CAN DO BETTER");
     else if ( grade>=50)
    printf("AVERAAGE");
     else if ( grade>=40)
    printf("BELOW AVG");
    else
    printf("FAIL");
     return 0;
}