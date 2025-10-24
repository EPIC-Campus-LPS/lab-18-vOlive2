# Lab 18
## Temperature Data

Create an ArrayList of temperature data in Celsius. Use `Integer.parseInt()` or similar from the `Integer` wrapper class. 

Calculate the average temperature, the max temperature, and the min temperature.

Then, calculate how many "spots" have been created in memory behind the scenes in by the ArrayList. Remember that by default, ArrayList creates an array with 10 indexes.

`temperature.txt`
```
27.27
20.49
31.11
21.62
20.6
32.42
-7.45
1.34
15.26
-7.38
1.58
-3.31
21.01
2.21
-8.08
19.36
30.71
25.15
-1.94
-9.15
15.34
21.7
38.9
33.62
16.21
6.02
31.03
28.62
29.75
-5.98
1.45
27.64
12.24
32.06
20.24
4.89
15.86
23.47
8.06
-8.54
-5.13
25.86
36.45
5.95
4.08
1.9
39.64
20.08
22.31
36.47
20.69
28.58
22.05
-6.06
35.28
8.02
-0.62
11.19
32.83
-0.25
7.81
37.62
35.61
4.74
14.05
21.92
20.96
23.86
-6.4
35.37
-1.49
27.64
37.69
16.13
25.58
8.04
10.01
11.28
37.78
9.89
0.71
-6.55
12.34
-5.46
35.35
24.67
5.3
0.39
34.62
17.27
1.32
23.6
28.24
-3.72
0.61
29.2
30.24
22.1
5.74
-2.46
```


## Grocery List

For this section, you will create a program that represents a grocery list. The program will accept items as input from the user. Then when it receives "STOP" it will print the grocery list alphabetically with each item's quantity. You may design the program however you choose, but it must incorporate an ArrayList. 

```
Item: apple
Item: apple
Item: pear
Item: banana
Item: apple
Item: STOP

3 APPLE
1 BANANA
1 PEAR 
```


## High Card Game

First create the class `Card` with three variables:
- `String suit`
- `String rank`
- `int value` // Represents the value of the card(for comparison)

`Card` has one constructor and appropriate getters/setters. 

`Card` also has a `toString` method which returns `rank of suit`.

Then, create the class `Deck` to represent a deck of 52 cards. 

`Deck` has one instance variable `ArrayList<Card> cards` and one default constructor that adds the 52 standard cards to the deck. *Hint: There is a way to do this that doesn't involve 52 individual calls to the Card constructor. Think like a lazy programmer!*

`Deck` has two methods:
- `shuffle()` which shuffles the deck of cards in a random order. *Hint: use the shuffle() method in the Collections class for this.*
- `drawCard()` which returns null if empty, or returns and removes the first card in the list. 

Next, create `Player` with three instance variables.
- `String name`
- `ArrayList<Card> hand`
- `int score`

`Player` has one constructor `Player(String name)` which creates a new player with an empty hand and a score of 0.

`Player` has multiple methods:
- `draw(Deck deck)` which adds a card to their hand from the deck
- `drawStartingHand(Deck deck)` which adds 5 cards to their hand from the deck
- `playCard()` which plays the card from their hand with the largest value and removes it from their hand
- `addPoint()` which increases their score
- getters for `name` and `score`

Lastly, create a `Main` method to run your game. The flow of the game should go like this:
1. Create two players Alice and Bob.
2. Have each player draw 5 cards.
3. Then have them play 5 rounds against each other, keeping track of who wins(whoever plays the largest card this round). During this step, print what each player played and the winner of the round.
4. Then report the overall winner for the 5 rounds and the final scores.
