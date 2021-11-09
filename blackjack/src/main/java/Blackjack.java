public class Blackjack {

    enum cards {

        ace(11),
        two(2),
        three(3),
        four(4),
        five(5),
        six(6),
        seven(7),
        eight(8),
        nine(9),
        ten(10),
        jack(10),
        queen(10),
        king(10),
        other(0);

        private int cardValue;


        cards(int cardValue) {
            this.cardValue = cardValue;
        }

        public int getCardValue() {
            return cardValue;
        }
    }

    public int parseCard(String card) {
        return cards.valueOf(card).cardValue;
    }

    public boolean isBlackjack(String card1, String card2) {

        return cards.valueOf(card1).getCardValue() + cards.valueOf(card2).getCardValue() == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {

        return isBlackjack && dealerScore < 10 ? "W" : "S";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {

            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else {
            if (dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (handScore == 22) {
            return "P";
        }
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
