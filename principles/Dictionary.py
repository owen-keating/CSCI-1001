
prices = {'toddler':'0', 'kids':'10', 'normal':'15'}

for age, price in prices.items():
    if age == "toddler":
        print("The price of tickets for ages 3 and under is " + price + " dollars")
    elif age == "kids":
        print("The price of tickets for ages 3 to 12 is " + price + " dollars")
    else:
        print("The price of normal tickets is " + price + " dollars")
