#include<iostream>
int power(int x, int y);
using namespace std;
int main()
{
  int a,b,n;
  cin>>a>>b;
  n=power(a, b);
  cout<<"Enter the value of a"<<"\n";
  cout<<"Enter the value of n"<<"\n";
  cout<<"The value of "<<a<<" power "<<b<<" is "<<n;
}

int power(int a, int b)
{
  if (b != 0)
        return (a * power(a, b - 1));
  else
    return 1;
}