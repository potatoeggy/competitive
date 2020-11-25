#include <algorithm>
#include <iostream>
#include <map>
#include <vector>

struct Program {
	int number, actualCode;
	int top, bottom;
};

bool programSort(Program const& lhs, Program const& rhs) {
	int first = lhs.top * rhs.bottom;
	int second = rhs.top * lhs.bottom;
	if (first != second) return first < second;
	else if (lhs.actualCode != rhs.actualCode) return lhs.actualCode > rhs.actualCode;
	return lhs.number > rhs.number;
}

int main() {
	std::map<std::string, int> languageToLines {
		{"Coffee", 3},
		{"--D", 0},
		{"Boa", 1}
	};

	int times, requested; std::cin >> times >> requested;
	std::vector<Program> programs;

	for (int i = 1; i <= times; i++) {
		int actualCode, comments; std::string language;
		std::cin >> actualCode >> comments >> language;
		if (actualCode != 0 && !(actualCode > 200 && comments == 0)) {
			int bottom = 10*(languageToLines[language] * comments + actualCode);
			int top = std::abs(bottom/10-10*std::max(languageToLines[language], 1) * comments);
			programs.push_back(Program({i, actualCode, top, bottom}));
		}
	}

	if (programs.size() < requested) {
		std::cout << "Go to Seneca!" << '\n';
	} else {
		std::sort(programs.begin(), programs.end(), &programSort);
		for (int i = 0; i < requested; i++) std::cout << programs.at(i).number << '\n';
	}
}