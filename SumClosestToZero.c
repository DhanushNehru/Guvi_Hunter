#include<stdio.h>
int main()
{
    int i,j,temp1=9999,temp2=-9999,varA1,varA2,varB1,varB2;
    int n,arr[50];
    printf("Enter number of array elements\n");
    scanf("%d",&n);
    printf("Enter array elements\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if((arr[i]+arr[j])>0)
            {
                if(arr[i]+arr[j]<temp1)
                {
                    temp1=arr[i]+arr[j];
                    varA1=arr[i];
                    varA2=arr[j];
                }
            }
            else if(arr[i]+arr[j]<0)
            {
                if(arr[i]+arr[j]>temp2)
                {
                    temp2=arr[i]+arr[j];
                    varB1=arr[i];
                    varB2=arr[j];
                }
            }
        }
    }
    //to find element sum closest to zero but not zero
    if(temp1+temp2<0)
        printf("Two elements whose sum closest to zero are %d and %d",varA1,varA2);
    else
        printf("Two elements whose sum closest to zero are %d and %d",varB1,varB2);
}
