#include<stdio.h>
main()
{
    char ch[100];
    int i,j,length=0,flag=0;
    printf("Enter a string::");
    gets(ch);
    length=strlen(ch);
    for(i=0;i<=length;i++)
    {
        for(j=0;j<=length;j++)
        {
            if(ch[i]==ch[j] && i!=j)
            {
                flag=1;
            }

        }
        if(flag==0)
            printf("%c",ch[i]);
        flag=0;
    }
}




