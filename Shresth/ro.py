Time = int(input("Enter your time in minutes : "))
count = 0
if Time<60:
    print(Time,"minutes")
else:
    while Time>=60:
        Time -= 60
        count +=1
    print(count,"hours,",Time,"Minutes")
