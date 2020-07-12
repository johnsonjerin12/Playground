#include<iostream>
using namespace std;
int pow(int a,int b)
{
  int res=1,i;
  for (i=1;i<=b;i++)
    res=res*a;
return res;
}
int main()
{
  int m,n,req;
  cin >> m>>n>>req;
  int a = pow(m,n);
  if(a>=req)
    cout << "Doctor, you can proceed with your experiment.";
  else
    cout << "Sorry Doctor! You need more bacteria.";
  return 0;
}
