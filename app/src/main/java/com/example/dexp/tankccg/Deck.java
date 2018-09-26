package com.example.dexp.tankccg;
import com.example.dexp.tankccg.Card;

public class Deck {
    private Card_Tank[] Deck;
    private int i;

    public Deck(Card_Tank[] deck_cr) {
        setDeck(deck_cr);
    }

    public void setDeck(Card_Tank[] deck) {
        this.Deck = deck;
    }

    public Card_Tank getCard(){
        if (i<Deck.length){
            return Deck[i++];
        }
        else return new Card_Tank("",0,0,0,0,0);
    }

    public void random(){
        this.i=0;
        int r1,r2;
        Card_Tank c;
        for (int j=0;j<this.Deck.length*10;j++){
            r1=((int)(Math.random()*1000)%this.Deck.length);
            r2=((int)(Math.random()*1000)%this.Deck.length);
            c=this.Deck[r1];
            this.Deck[r1]=this.Deck[r2];
            this.Deck[r2]=c;
        }
    }
}
