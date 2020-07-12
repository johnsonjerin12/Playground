#include<iostream>
using namespace std;
int main()
{
  int a,rem,sum=0,qo;
  cin>>a;
  int n = a;
  while(a>0)
  {
    rem = a%10;
    sum= sum+ rem;
    qo= a/10;
    a=qo;
  }
  if(n % sum == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
 return 0;  
 }