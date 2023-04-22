package JavaFiles;

// 1. 카드 덱 클래스를 만들 때는 열거타입(enum)을 사용한다.
// 2. 카드 덱 클래스는 52장의 카드를 가지고 있어야 하며, 각 카드는 무늬(suit)와 숫자(rank)로 구분된다.
// 3. 카드 덱 클래스는 다음과 같은 메서드를 가지고 있어야 한다.
// shuffle(): 카드 덱을 섞는 메서드
// draw(): 카드 덱에서 한 장의 카드를 뽑아내는 메서드
// 4. 카드 덱 클래스를 사용하여, 랜덤으로 5장의 카드를 뽑아내는 프로그램을 작성한다.
// 5. 카드 덱 클래스에서 열거타입의 사용이 어려운 경우, 일반 클래스로 구현해도 무방하다.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(deck.draw());
        }

        System.out.println("Randomly drawn hand:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}

enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES;
}

enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
}

class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }
        return cards.remove(0);
    }
}

