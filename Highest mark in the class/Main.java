#include<iostream>
using namespace std;
int main()
{
  int n,i;
  cin >> n ;
  int a[n];
  for(i=0;i<n;i++)
    {
    cin >> a[i] ;
 
    }
   int temp = a[0];
  for(i=1;i<n;i++)
  {
    if(a[i]>=temp)
      temp = a[i];
   
  }
  cout << temp;


}
