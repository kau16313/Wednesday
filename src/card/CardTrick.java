/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * CardTrick class models a hand of seven cards.
 * Modifier: Amritpal Kaur
 * Student Number: 991727559
 * Date Modified: 2024-05-22
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Fill the array with random cards
        for (int i = 0; i < hand.length; i++) {
            int value = rand.nextInt(13) + 1; // Card values 1 to 13
            String suit = Card.SUITS[rand.nextInt(4)]; // Random suit
            hand[i] = new Card(value, suit);
        }

        // Display the hand
        System.out.println("The magic hand contains:");
        for (Card card : hand) {
            System.out.println(card);
        }

        // Prompt user for a card value and suit
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[suitIndex];

        // Create a card based on user input
        Card userCard = new Card(userValue, userSuit);

        // Check if the user's card is in the hand
        boolean found = false;
        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        scanner.close();
    }
}