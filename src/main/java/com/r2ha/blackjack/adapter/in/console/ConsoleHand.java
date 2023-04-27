package com.r2ha.blackjack.adapter.in.console;

import static org.fusesource.jansi.Ansi.ansi;

import com.r2ha.blackjack.domain.Hand;

import java.util.stream.Collectors;

public class ConsoleHand {

    public static String cardsAsString(Hand hand) {
        return hand.cards()
                .map(ConsoleCard::display)
                .collect(Collectors.joining(
                        ansi().cursorUp(6).cursorRight(1).toString()));
    }

    public static String displayFaceUpCard(Hand hand) {
        return ConsoleCard.display(hand.faceUpCard());
    }
}
