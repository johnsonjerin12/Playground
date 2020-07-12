#include <iostream>
using namespace std;
int main() 
{
    // Type your code here
  int i,j,k=0,n,temp=1;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(j=1;j<n;j++)
      {
        cout<<i;
      }
      temp++;
      cout<<temp<<endl;
    }
    else
    {
      temp=temp+1;
      cout<<temp;
      for(j=1;j<n;j++)
        cout<<i;
      cout<<endl;
    }
  }
  return 0;
}