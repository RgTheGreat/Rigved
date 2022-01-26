import time
import random

offers = ["21%", "91%", "87%", "3%", "90%", "10%", "96%", "16%", "54%", "74%", "62%", "98%", "100%", "90%", "14%", "14%", "34%", "19%", "0%"]

companies = ["amazon", "myntra", "google ads", "flipkart", "xbox", "ps5", "redeem"]


offers_choose = random.choice(offers)

companies_choose = random.choice(companies)

print("drop a coupon win a prize!")
drop = input("type drop to win prize, redeem to select a prize: ")
if drop == "drop":
    print("dropping coupon")
    time.sleep(3)
    print("decoding prize,")
    time.sleep(2)
    print("Woo hoo! You got " + offers_choose + " in " + companies_choose + " come again and win new prizes!")
    if companies_choose == companies[-1]:
        f = open("redeems.txt", "r")
        a = f.read()
        b = int(a)
        d = offers_choose.strip("%")
        r = int(d)
        if r > 0:
            b+=1
        elif r > 10:
            b+=2
        elif r > 20:
            b+=3
        elif r > 30:
            b+= 4
        elif r > 40:
            b+= 5
        elif r > 50:
            b+= 6
        elif r > 60:
            b+=7
        elif r > 70:
            b+= 8
        elif r > 80:
            b+= 9
        elif r > 90:
            b+= 10
        else:
            pass
        g = open("redeems.txt", "w")
        g.write(f'{b}')

elif drop == "redeem":
    f = open("redeems.txt", "r")
    g = f.read()
    print("Your redeems = " + g)
    if g == "0" or g == 0:
        print("You don't have redeems")
    else:
        print("redeem: choose ")
        print(companies)
        print("which one? ")
        x = input(": ")
        if x in companies:
            print("how much percentage (%)?")
            y = input(": ")
            time.sleep(2)
            print("You won " + y + "%" +  " in " + x + " come again and win new prizes!")
            f = open("redeems.txt", "r")
            a = f.read()
            b = int(a)
            b-=1
            g = open("redeems.txt", "w")
            g.write(f'{b}')



    
