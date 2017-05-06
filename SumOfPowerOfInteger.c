#include<stdio.h>
#include<math.h>
int main()
{
    int sum1=0,num,num1,temp=0;
    int b=0;
    int count=0;
    printf("Enter a number:\n");
    scanf("%d",&num);
    num1=num;
    while(num!='\0')
    {
        ++count;
        num=num/10;
    }
    while(num1!='\0')
    {
        b=num1%10;
        --count;
        temp=pow(b,count);
        sum1+=temp;
        num1/=10;
    }
    printf("%d",sum1);
    return 0;
}
