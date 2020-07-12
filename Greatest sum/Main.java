#include<iostream>
using namespace std;
int main()
{
  int r,c,row, col, sum = 0, row_ind = 0,col_ind=0;
  int i,j;
  int row_arr[r];
  int col_arr[c];
  cin>>r>>c;
  int a[r][c];
  for(int i=0; i<r; i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int z=0;
  cout<<"Sum of rows is ";
  for(int i=0; i<r;i++)
  {
    int sum=0,b=0;
    for(int j=0;j<c;j++)
    {
      sum=sum+a[i][j];
    }
    cout<<sum;
    cout<<" ";
    row_arr[z++] = sum;
    }
  int temp_row = row_arr[0];
  for(i=1;i<r;i++)
  {
    if(temp_row < row_arr[i])
    {
      temp_row = row_arr[i];
      row_ind = i;
    }
  }
  cout << "\nRow " << row_ind +1 << " has maximum sum ";
  cout<<"\nSum of columns is ";
  int y=0;
  for(int i=0; i<c;i++)
  {
    int sum=0,b=0;
    for(int j=0;j<r;j++)
    {
      sum=sum+a[j][i];
    }
    col_arr[y++] = sum;
    cout<<sum;
    cout<<" ";
    }
  int temp_col = col_arr[0];
  for(i=1;i<c;i++)
  {
    if(temp_col < col_arr[i])
    {
      temp_col = col_arr[i];
      col_ind = i;
    }
  }
  cout << "\nColumn " << col_ind + 1 << " has maximum sum ";
  return 0;
}