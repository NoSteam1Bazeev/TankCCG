package com.example.dexp.tankccg;

public abstract class Card {
    private String Name;
    private int Cost;
    private String Text;

    public void setName(String n){
        this.Name=n;
    }
    public void setCost(int n){
        this.Cost=n;
    }
    public void setText(String text) {
        this.Text = text;
    }

    public int getCost() {
        return Cost;
    }
    public String getName() {
        return Name;
    }
    public String getText() {
        return Text;
    }
}