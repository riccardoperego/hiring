# hiring
Hiring
Input is provided by unit test and it's rapresented by the class called Receipt, which contains a list of entites of type Item, a totalAmountOfSalesTaxes and a totalCost.
Every item has a name, a categoryId, netPrice(the price provided with the input), isImported flag and a totalPrice(price of the item calculated including taxes).
Each item has a categoryId property and this property poit to a specific category in to the catalog. The catalog has an HashMap which contains infoes about every kind of category that exists in the sample input provided:
- food
- cosmetics
- music
- books
- medical product
With this kind of input provided it is possible to calculate gross price of every item, sales taxes and the total of the receipt.
Output is printed in console and it is visibile from travis console too.

output example from travis console:

1 Book:	12.49

1 Music CD:	16.49

1 Chocolate Bar:	0.85

Sales taxes:	1.50

Total:	29.83



