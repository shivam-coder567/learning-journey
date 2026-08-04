#include <stdio.h>

// function to print pascal triangle
void pascal(int n)
{
    for (int i = 0; i < n; i++)
    {
        int num = 1;

        // spacing (important for center)
        for (int s = 0; s < n - i; s++)
        {
            printf("  "); // 2 spaces
        }

        // numbers
        for (int j = 0; j <= i; j++)
        {
            printf("%4d", num); // fixed width for alignment

            // formula to generate next value
            num = num * (i - j) / (j + 1);
        }

        printf("\n");
    }
}

int main()
{
    int n;
    printf("Enter rows: ");
    scanf("%d", &n);

    pascal(n);

    return 0;
}