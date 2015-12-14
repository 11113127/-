#include <iostream>
#include <cstdlib>
using namespace std;
void check(int tmp_name[]);
int main(void){
	int key = 0;
	int tmp_name[5] = {0}; 
		cin >> key;
		for(int index = 0 ; index < key ; index++){
			for(int num = 0 ; num < 4 ; num++){
				cin >> tmp_name[num];
			}
			check(tmp_name);
		}	
	system("pause");
	return 0; 
} 

inline void check(int tmp_name[]){
	if(tmp_name[2]-tmp_name[1]==tmp_name[1]-tmp_name[0])
		tmp_name[4] = tmp_name[3]+(tmp_name[3]-tmp_name[2]);
	else
		tmp_name[4] = tmp_name[3]*tmp_name[1]/tmp_name[0];
		cout << tmp_name[0] <<" "<< tmp_name[1] <<" "<< tmp_name[2] <<" "<< tmp_name[3] << " " << tmp_name[4] << " "<<endl;
}

