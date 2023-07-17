from calendar import c


def farh(cel):
    return (cel * (9/5)) + 32

c = 45
f = farh(c)
print("The value of farhenhite of c is: " + str(f))
