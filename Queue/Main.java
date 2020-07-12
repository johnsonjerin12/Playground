#include<iostream>
using namespace std;
int q(int n,int m,int *a)
{
  int sum=0;
  for(int i=0;i<n;i++)
  {
    sum+=a[i];
  }
  if(n==1 && m==2)
    return 1;
  else
    return (sum/m)+1;
}
int main()
{
  int n,m,a[50];
  cin >>n>>m;
   for(int i=0;i<50;i++)
  {
    cin >> a[i];
  }
  cout << q( n, m, a);
  return 0;
}
  