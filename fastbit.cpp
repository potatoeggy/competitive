int setbits(unsigned long long num) {
	int counter = 0;
	while (num) {
		num &= num - 1;
		counter++;
	}

	return counter;
}