/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


public class Card {
    private String rank;
    private String suit;
    private int value;

   public Card(String rank, String suit) {
    this.rank = rank;
    this.suit = suit;
    // Initialize the value based on the card's rank
    if (rank.equals("Ace")) {
        this.value = 11;
    } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
        this.value = 10;
    } else {
        this.value = Integer.parseInt(rank);
    }
}
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    // Get the value of the card
    public int getValue() {
        return value;
    }
}