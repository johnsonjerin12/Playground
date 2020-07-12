#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s1;
  cout << "\nStudent Details"<<"\n";
  cin.getline(s1.name,50);
  cin >> s1.roll; cin >> s1.marks;
  cout << "Name: " << s1.name << "\n" << "Roll: " << s1.roll << "\n" << "Marks: "<< s1.marks << endl;
  return 0;
  
  
  
}