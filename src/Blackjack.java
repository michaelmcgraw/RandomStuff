import java.util.*;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            List<String> deck = createDeck();
            Collections.shuffle(deck);

            List<String> playerHand = new ArrayList<>();
            playerHand.add(deck.remove(0));
            playerHand.add(deck.remove(0));

            List<String> dealerHand = new ArrayList<>();
            dealerHand.add(deck.remove(0));
            dealerHand.add(deck.remove(0));

            int playerScore = calculateScore(playerHand);
            int dealerScore = calculateScore(dealerHand.subList(0, 1));

            while (true) {
                System.out.println("Player's hand: " + playerHand);
                System.out.println("Player's score: " + playerScore);

                if (playerScore > 21) {
                    System.out.println("Player busts!");
                    break;
                }

                System.out.println("Dealer's hand: " + dealerHand.get(0) + ", [hidden]");
                System.out.println();

                System.out.print("Would you like to hit or stand? ");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("hit")) {
                    playerHand.add(deck.remove(0));
                    playerScore = calculateScore(playerHand);
                } else if (choice.equalsIgnoreCase("stand")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'hit' or 'stand'.");
                }
            }

            while (dealerScore < 17 && playerScore <= 21) {
                dealerHand.add(deck.remove(0));
                dealerScore = calculateScore(dealerHand);
            }

            System.out.println("Player's hand: " + playerHand);
            System.out.println("Player's score: " + playerScore);
            System.out.println("Dealer's hand: " + dealerHand);
            System.out.println("Dealer's score: " + dealerScore);
            System.out.println();

            if (playerScore > 21) {
                System.out.println("Dealer wins! Player busts!");
            } else if (dealerScore > 21) {
                System.out.println("Dealer busts! Player wins!");
            } else if (dealerScore > playerScore) {
                System.out.println("Dealer wins!");
            } else if (playerScore > dealerScore) {
                System.out.println("Player wins!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.print("Would you like to play again? (y/n) ");
            String again = scanner.nextLine();

            if (!again.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }
    }

    public static int calculateScore(List<String> hand) {
        int score = 0;
        int numAces = 0;

        for (String card : hand) {
            if (card.startsWith("Ace")) {
                numAces++;
                score += 11;
            } else if (card.startsWith("King") || card.startsWith("Queen") || card.startsWith("Jack")) {
                score += 10;
            } else {
                score += Integer.parseInt(card.split(" ")[0]);
            }
        }

        while (numAces > 0 && score > 21) {
            score -= 10;
            numAces--;
        }

        return score;
    }

    public static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        return deck;
    }
}

