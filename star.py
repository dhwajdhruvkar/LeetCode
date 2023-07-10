# Python 3 code for triangular
# patterns of alphabets
n = 6
for i in range(1, n + 1):
	for j in range(i, n + 1):
		print(chr(ord('A') - 1 + j), end = ' ')
	print()

# This code is contributed
# by SamyuktaSHegde
