# Poker Kata

Your job is to create a program which given a single five card poker hand ranks it according to the rules of poker

### Poker rules description

A poker deck contains 52 cards - each card has a suit which is one of Clubs, Diamonds, Hearts, or Spades (denoted ♣, ♦,
♥, and ♠ in the input data or alternatively as C, D, H, S). Each card also has a value which is one of 2, 3, 4, 5, 6, 7,
8, 9, 10, Jack, Queen, King, Ace (denoted 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K, A). 

A poker hand consists of 5 cards ranked as follows:

- **High Card**: Hands which do not fit any higher category are ranked by the value of their highest card. Example: `K♥
  J♥ 8♣ 7♦ 4♠`

- **Pair**: 2 of the 5 cards in the hand have the same value. Example: `4♥ 4♠ K♠ 9♦ 5♠`

- **Two Pairs**: The hand contains 2 different pairs. Example: `J♥ J♣ 4♣ 4♠ 9♥`

- **Three of a Kind**: Three of the cards in the hand have the same value. Example: `2♦ 2♠ 2♣ K♠ 6♥`

- **Straight**: A straight is a hand that contains five cards of sequential rank, not all of the same suit. Example: `3♥
  4♥ 5♠ 6♠ 7♣`

- **Flush**: Hand contains 5 cards of the same suit. Example: `K♣ 10♣ 7♣ 6♣ 4♣`

- **Full House**: 3 cards of the same value, with the remaining 2 cards forming a pair. Example: `3♣ 3♠ 3♦ 6♣ 6♥`
  
- **Four of a kind**: 4 cards with the same value. Example: `9♣ 9♠ 9♦ 9♥ J♥`

- **Straight flush**: 5 cards of the same suit with consecutive values. Example: `Q♥ J♥ 10♥ 9♥ 8♥`

## Notes

We would like to see your TDD and Code Design, don't focus too much on completing all the scenarios in the exercise if
there is no time for it.

Use Kotlin as the programing language or alternative discuss a different option with the interviewer

You don't necessarily have to use strings in this exercise, and you can use alternative data structures

No libraries are expected to be used in the implementation of this exercise

No CLI, API or UI is expected to be created.

It is allowed to search information on Google but it's not allowed to use any AI tools such as GitHub Copilot, Cursor,
ChatGPT, Perplexity, etc.
