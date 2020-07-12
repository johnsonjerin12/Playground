#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int i,j;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int max=a[0][0];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(max<a[i][j])
      {
        max=a[i][j];
      }
    }
  }
  cout<<"The maximum element is "<<max;
  return 0;
}