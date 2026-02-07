
#include <stdio.h>
    int main()
    {
        int x,rev;
        printf("Enter the value of n \n");
        scanf("%d",&x);
       for(int i;i=0;i=x%10){
        rev=rev*10+i;
       }
            if (rev==x)
            {
                printf("The array is planindrome ");
            }

            else
                printf("The array is not planindrome ");

        
        

        return 0;
    }

   