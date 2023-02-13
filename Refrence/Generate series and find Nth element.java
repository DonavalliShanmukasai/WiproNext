#include<stdio.h>
#include<string.h>
int findpassword(int input1,int input2,int input3,int input4,int input5)
{
int arr[]={input1,input2,input3,input4,input5};
     int i,j=0,sum1=0,sum2=0;
  for(i=0;i<5;i++)
  {
   j=stable(arr[i]);
   if(j==1)
   {
    sum1=sum1+arr[i];
   }
   else if(j==2)
   {
    sum2=sum2+arr[i];
   }
  }
  int res=sum1-sum2;
  return res;

 }
 public int stable(int num)
 {
  int[] digitArray = new int[10];
  for(int k=0;k<10;k++)
  {
   digitArray[k]=0;
  }
  int rem = 0;
  int n=num;
  while (num > 0)
  {
   rem= num % 10;
   digitArray[rem]++;
   num = num / 10;
  }
  int digitCount = digitArray[0];
  int i,counter=0;
  if(digitCount==0)
  {
   while(digitCount==0)
   {
    digitCount = digitArray[counter];
    counter++;
   }
   for ( i = counter; i < digitArray.length; i++)
   {
    int val=digitArray[i];
    if(val!=0 && digitCount!=val)
    {
     return 2;
    }
   }
   return 1;
  }
  else
  {
   for (i = 1; i < digitArray.length; i++)
   {
    int val=digitArray[i];
    if(val!=0 && digitCount!=val)
    {
     return 2;
    }
   }
   return 1;
  }
 }
