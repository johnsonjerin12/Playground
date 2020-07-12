#include<iostream>
using namespace std;
int main()
{
  int n,b,c;
  int a[n];
  cin>>n;
  cout<<"Enter the number of elements in the array"<<"\n";
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the elements in the array"<<"\n";
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>b;
  if(b<n)
  {
    cout<<"Enter the value to insert"<<"\n";
    cin>>c;
    cout<<"Array after insertion is"<<"\n";
    n=n+1;
    for(int i=0; i<b-1; i++)
    {
      cout<<a[i];
      cout<<"\n";
    }
    cout<<c<<"\n";
    if(int i=b)
    {
      a[i]=a[b-1];
      cout<<a[i];
      cout<<"\n";
      a[i]=a[i]+1;
      cout<<a[i];
    }
    
  }
  else
    cout<<"Invalid Input";
}