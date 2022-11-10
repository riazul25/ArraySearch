#include <stdio.h>
int main()
{
    int array[20], i, number, value;
    printf("Enter How many element want to add : ");
    scanf("%d", &number);
    printf("Enter the elements of an Array : \n");
    for (i = 0; i < number; i++)
    {
        scanf("%d", &array[i]);
    }
    printf("Enter the Value want to Search : ");
    scanf("%d", &value);
    for (i = 0; i < number; i++)
    {
        if (array[i] == value)
        {
            printf("Searched value found in position %d .", i);
            return 0;
        }
    }
    printf("Sorry ! Your Searched Array Element has not found.");
    return 0;
}
