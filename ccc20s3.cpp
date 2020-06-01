#include <stdio.h>
#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {
	int SIZE = 200000;
	char needleString[SIZE];
	char haystackString[SIZE];
	scanf("%s", needleString);
	scanf("%s", haystackString);
	sort(needleString, needleString + SIZE);
	vector<string> tempArray = {};
	int c = 0;
	for (int i = 0; i < haystackString.size() - (needleString.size() - 1); i++) {
		/*
		for (int j = 0; j < needle.length; j++) {
			tempArray[i] = haystack[i + j];
		}
		
		if (! checked.contains(new String(tempArray))) {
			checked.add();
			if (Arrays.equals(tempArray, needle)) {
				c++;
			}
		}
		*/
	}
	cout << c;
}
