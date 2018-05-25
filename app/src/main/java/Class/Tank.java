package Class;

public class Tank {
    private String Name;
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
    public void setName(String name) {
        Name = name;
    }
    public void setAtack_D(int atack_D) {
        Atack_D = atack_D;
    }

    public int getHp() {
        return Hp;
    }
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

    public void Tank(String name,int Damage,int Hp,int Speed,int Atack_D){
        this.Atack_D=Atack_D;
        this.Damage=Damage;
        this.Hp=Hp;
        this.Name=name;
        this.Speed=Speed;
    }
}
