package com.r2ha.blackjack;

import static org.fusesource.jansi.Ansi.ansi;

import java.util.List;
import java.util.stream.Collectors;

public class ConsoleHand {

    public static Card faceUpCard(List<Card> cards) {
        return cards.get(0);
    }

    public static String cardsAsString(Hand hand) {
        return hand.cards()
                .map(ConsoleCard::display)
                .collect(Collectors.joining(
                        ansi().cursorUp(6).cursorRight(1).toString()));
    }
}
