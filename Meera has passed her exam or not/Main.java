#include<iostream>
using namespace std;
int main()
{
  int num,a[100],usn,i,z=0;
  cin >> num;
  for(i=0;i<num;i++){
    cin >> a[i];
  }
  cin >> usn;
  for(i=0;i<num;i++){
    if(usn==a[i])
      z=1;
  }
  if(z)
    cout << "She passed her exam";
  else
    cout << "She failed";
    return 0;
}