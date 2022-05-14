#include<bits/stdc++.h>
using namespace std;

int sum = 0;

void recursive(int n){ // 1234 = 10
    if(n == 0) return;
    sum+= n % 10;
    recursive(n/10);
}


int main(){
	int s;
	cin >> s;
    recursive(s);
	cout << sum << endl;
}