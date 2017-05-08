#include<stdio.h>
int main()
{
    int num,arr[100],arr1[100],i,j,temp=0;
    printf("Enter the array size\n");
    scanf("%d",&num);
    printf("Enter the array elements\n");
    for(i=0;i<num;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<num;i++)
    {
        for(j=i+1;j<num;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    int x=num-1;
    j=0;
    for(i=1;i<num;i+=2)
    {
        arr1[i]=arr[j];
        ++j;
    }
    for(i=0;i<num;i+=2)
    {
        arr1[i]=arr[x];
        --x;
    }
    for(i=0;i<num;i++)
    {
        printf("%d ",arr1[i]);
    }
    return 0;
}
