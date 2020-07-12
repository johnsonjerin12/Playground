#include<iostream>

int main(){

 int a;

 std::cin>>a;

 int r=(a%2==0)?1:0;

 if(r==1)

   std::cout<<"Possible";

 else

   std::cout<<"Not possible";

}