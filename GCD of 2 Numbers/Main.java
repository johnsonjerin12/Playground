#include<iostream>
int gcds(int x, int y);
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b;
  c=gcds(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<c;
}
int gcds(int a, int b)
{
  int small = 0;
  int gcd = 0;
  if(a<b)
    small = a;
  else
    small = b;
  while(small >=1)
  {
    if(a%small == 0 && b%small==0)
    {
      gcd= small;
      break;
    }
    small --;
  }
}