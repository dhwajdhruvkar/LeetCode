cost=float (input ("Selling price of item "))
CGST = cost*0.09
print("CGST is " , CGST)
SGST = cost*0.09
print ("SGST is " , SGST)
total = cost + SGST + CGST
print("Amount payable:", (total))