#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char str[50];
  gets(str);
  int s=strlen(str);
  cout<<"The number of letters in the name is "<<s;
}