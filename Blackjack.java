package ca.sheridancollege.project;

import java.util.Scanner;

public class Blackjack extends Game {

    private Player player;
    private Player computer;
    private Deck deck;

    public Blackjack(String name) {
        super(name);
        player = new Player("Player");
        computer = new Player("Computer");
        deck = new Deck();
        deck.shuffle();
    }

    Blackjack(Player player1, Player player2, Deck deck) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Blackjack(Player player1, Player player2, Deck deck) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void play() {
        System.out.println("Welcome to " + getName() + "!");
        System.out.println("Dealing initial cards...");

        // Deal two cards to player and computer
        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        computer.addCard(deck.dealCard());
        computer.addCard(deck.dealCard());

        // Show player's hand and one of computer's cards
        System.out.println("Player's hand: " + player.getHand());
        System.out.println("Computer's hand: " + computer.getHand().get(0) + ", [hidden]");

        // Player's turn
        Scanner scanner = new Scanner(System.in);
        while (player.getHandValue() < 21) {
            System.out.print("Do you want to hit or stand? (h/s): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("hit")) {
                player.addCard(deck.dealCard());
                System.out.println("Player's hand: " + player.getHand());
            } else if (choice.equalsIgnoreCase("stand")) {
                break; // Add a break statement to exit the loop when player stands
            } else {
                System.out.println("Invalid choice! Please enter 'hit' to hit or 'stand' to stand.");
            }
        }

        // Computer's turn
        while (computer.getHandValue() < 17) {
            computer.addCard(deck.dealCard());
        }

        // Declare winner
        declareWinner();
    }

    @Override
    public void declareWinner() {
        System.out.println("Player's hand: " + player.getHand() + " (Value: " + player.getHandValue() + ")");
        System.out.println("Computer's hand: " + computer.getHand() + " (Value: " + computer.getHandValue() + ")");

        if (player.getHandValue() > 21) {
            System.out.println("Computer wins! Player busts.");
        } else if (computer.getHandValue() > 21) {
            System.out.println("Player wins! Computer busts.");
        } else if (player.getHandValue() == computer.getHandValue()) {
            System.out.println("It's a tie!");
        } else if (player.getHandValue() == 21) {
            System.out.println("Player wins! Blackjack!");
        } else if (computer.getHandValue() == 21) {
            System.out.println("Computer wins! Blackjack!");
        } else if (player.getHandValue() > computer.getHandValue()) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack("Blackjack");
        blackjack.play();
    }
}
