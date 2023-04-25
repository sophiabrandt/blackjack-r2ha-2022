package com.r2ha.blackjack;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CardDisplayTest {

    private static final Suit DUMMY_SUIT = Suit.HEARTS;
    private static final Rank DUMMY_RANK = Rank.TEN;

    @Test
    public void displayTenAsString() throws Exception {
        Card card = new Card(DUMMY_SUIT, DUMMY_RANK);

        assertThat(ConsoleCard.display(card)).isEqualTo(
                "[31m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘"
        );
    }

    @Test
    public void displayNonTenAsString() throws Exception {
        Card card = new Card(DUMMY_SUIT, Rank.SEVEN);

        assertThat(ConsoleCard.display(card)).isEqualTo(
                "[31m┌─────────┐[1B[11D│7        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        7│[1B[11D└─────────┘"
        );
    }

    @Test
    public void displayRedCard() throws Exception {
        Card card = new Card(DUMMY_SUIT, Rank.KING);

        assertThat(ConsoleCard.display(card)).isEqualTo(
                "[31m┌─────────┐[1B[11D│K        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        K│[1B[11D└─────────┘"
        );
    }

    @Test
    public void displayBlackCard() throws Exception {
        Card card = new Card(Suit.CLUBS, Rank.SEVEN);

        assertThat(ConsoleCard.display(card)).isEqualTo(
                "[30m┌─────────┐[1B[11D│7        │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│        7│[1B[11D└─────────┘"
        );
    }
}
