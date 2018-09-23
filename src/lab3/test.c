#include <stdio.h>
int main() {
	int x, y, z, i;
	char* a, b, c;
	y = (1 + 2 * 3);
	z = -228;
	x = (z * y + 23930 % 5 + 14 / 2);
	a = "abc";
	scanf("%s %s", &b, &c);
	i = 10;
	while (i > 0) 
	{
		i = i - 1;
		printf("%d", i);
	}
	if (x > z) {
		printf("abc");
	} else {
		printf("%s", a);
	}
	return 0;
}
