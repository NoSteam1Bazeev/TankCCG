package com.example.dexp.tankccg;

public class Tank {
    private String Name;
    private int Hp;
    private int MaxHp;
    private int Damage;
    private int Speed;
    private int Atack_D;
    private boolean Enemy;
    private boolean Active;

    public void setHp(int hp) {
        Hp = hp;
    }
    public void setMaxHp(int maxHp){ MaxHp= maxHp;}
    public void setDamage(int damage) {
        Damage = damage;
    }
    public void setSpeed(int speed) {
        Speed = speed;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setAtack_D(int atack_D) {
        Atack_D = atack_D;
    }
    public void setEnemy(boolean enemy) {
        Enemy = enemy;
    }

    public int getHp() {
        return Hp;
    }
    public int getMaxHp() { return MaxHp; }
    public int getDamage() {
        return Damage;
    }
    public int getSpeed() {
        return Speed;
    }
    public String getName() {
        return Name;
    }
    public int getAtack_D() {
        return Atack_D;
    }
    public boolean isActive() { return Active; }
    public boolean isEnemy() {
        return Enemy;
    }

    public Tank(String name, int Damage, int Hp, int Speed, int Atack_D,boolean Enemy){
        this.Atack_D=Atack_D;
        this.Damage=Damage;
        this.Hp=Hp;
        this.MaxHp=Hp;
        this.Name=name;
        this.Speed=Speed;
        this.Enemy=Enemy;
    }
    public void endTurn(){
        this.Active=true;
    }
    public void move(){
        this.Active=false;
    }
    public boolean damage(int d){
        this.Hp-=d;
        if (this.Hp<=0){
            return true;
        }else{
            return false;
        }
    }
}
