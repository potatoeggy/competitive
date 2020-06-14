import sys

consonant_to_vowel = "a"*3 + "e"*4 + "i"*5 + "o"*6 + "u"*8
consonant_to_consonant = "ccdffghjjklmnppqrstvvwxyzz"
pig_latin = ""

string = sys.stdin.readline()[:-1]

for i in range(len(string)):
	if string[i] not in consonant_to_vowel:
		pig_latin += string[i] + consonant_to_vowel[ord(string[i])-97] + consonant_to_consonant[ord(string[i])-97]
	else:
		pig_latin += string[i]

print(pig_latin)