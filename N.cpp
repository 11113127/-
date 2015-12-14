#include <iostream>
using namespace std;

int main(void){
char name[10]; 
char id[10];
cout << "enter your name :"; 
cin.getline(name,10); //呼叫函數 ,10代表最大能讀入的字串長度 
cout << "name :"<< name << endl;

cout << "id :"<< id << endl;

	system("pasue");
    return 0;
}
