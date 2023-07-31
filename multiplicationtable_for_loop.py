num = int(input("Enter the number of which you want multiplication table: \n"))
for i in range(1, 11):
    print(str(num) + 'X' + str(i) + '=' + str(i*num))