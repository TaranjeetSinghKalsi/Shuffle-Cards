package com.psl.gems.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.psl.gems.model.Card;
import com.psl.gems.model.Rank;
import com.psl.gems.model.Suit;

public class PackOfCards {
    private final List<Card> cards;

    public PackOfCards() {
        this.cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card getTopCard() {
        return cards.remove(cards.size() - 1);
    }

    public Card getRandomCard() {
        int index = (int) (Math.random() * cards.size());
        return cards.remove(index);
    }

    public int getSize() {
        return cards.size();
    }

    public void reset(boolean ascending) {
        cards.sort((c1, c2) -> {
            int result = c1.getRank().compareTo(c2.getRank());
            if (result == 0) {
                result = c1.getSuit().compareTo(c2.getSuit());
            }
            return ascending ? result : -result;
        });
    }

    public ArrayList<Card> getAllCards() {
        return new ArrayList<>(cards);
    }
}
