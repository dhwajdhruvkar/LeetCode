from re import sub


phy = int(input("Enter the percentage of Physics: \n"))
mat = int(input("Enter the percentage of Maths: \n"))
chem = int(input("Enter the percentage of Chemistry: \n"))

if(phy<= 33 or mat<= 33 or chem<= 33):
    print("Congratulations you are fail dumbass")

elif(((phy + mat + chem)/3) < 40):
    print("You are fail due to the total percentage less than required dumbass")

else:
    print("Congratulations you are passed proud of you")





