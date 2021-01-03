#include <iostream>
#include <algorithm>
#include <vector>

int main() {
	int sets; std::cin >> sets;
	for (int i = 0; i < sets; i++) {
		std::vector<std::string> subjects, verbs, objects;
		int nSubjects, nVerbs, nObjects; std::cin >> nSubjects >> nVerbs >> nObjects;
		
		std::string cpp_bad; // used to flush
		std::getline(std::cin, cpp_bad);
		
		for (int j = 0; j < nSubjects; j++) {
			std::string line;
			std::getline(std::cin, line);
			subjects.push_back(line);
		}

		for (int j = 0; j < nVerbs; j++) {
			std::string line;
			std::getline(std::cin, line);
			verbs.push_back(line);
		}

		for (int j = 0; j < nObjects; j++) {
			std::string line;
			std::getline(std::cin, line);
			objects.push_back(line);
		}

		for (std::string s : subjects) {
			for (std::string v : verbs) {
				for (std::string o : objects) {
					std::cout << s << " " << v << " " << o << ".\n";
				}
			}
		}
	}
	return 0;
}