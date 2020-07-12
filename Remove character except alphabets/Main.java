#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char str[200];
  int i,j;
  gets(str);
  int s=strlen(str);
  for(i=0;i<s;i++)
  {
    if(str[i]>='a' && str[i]<='z' ||str[i]>='A' && str[i]<='Z')
      cout<<str[i];
  }
}