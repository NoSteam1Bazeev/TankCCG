package com.example.dexp.tankccg;

import com.example.dexp.tankccg.Card;

public class Card_Tank extends Card {
    private int Hp;
    private int Damage;
    private int Speed;
    private int Atack_D;

    public void setHp(int hp) {
        Hp = hp;
    }
    public void setDamage(int damage) {
        Damage = damage;
    }
    public void setSpeed(int speed) {
        Speed = speed;
    }
    public void setAtack_D(int atack_d){ this.Atack_D=atack_d;}

    public int getHp() {
        return Hp;
    }
    public int getDamage() {
        return Damage;
    }
    public int getSpeed() {
        return Speed;
    }
    public int getAtack_D() {
        return Atack_D;
    }

    public Card_Tank(String name,int Damage,int Hp,int Speed,int Atack_D,int cost){
        this.Atack_D=Atack_D;
        this.Damage=Damage;
        this.Hp=Hp;
        this.setName(name);
        this.Speed=Speed;
        this.setCost(cost);
    }
}
