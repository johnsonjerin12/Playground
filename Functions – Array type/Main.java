#include<iostream>
using namespace std;
int main()
{
  int n,odd=0,even=0;
  int a[n];
  cin>>n;
  cout<<"Enter the number of elements in the array"<<"\n";
  cout<<"Enter the elements in the array"<<"\n";
  for(int i=0; i<n; i++)
  {
    cin>>a[i];
  }
 
  for(int i=0; i<n; i++)
  {
    if(a[i]%2==1)
    {
      even++;
    }
    else
    {
      odd++;
    }
  }
  if(odd==n)
    cout<<"The array is Even";
  else if(even==n)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}