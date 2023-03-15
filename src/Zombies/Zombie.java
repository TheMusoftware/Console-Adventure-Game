package Zombies;

import java.util.Random;

public class Zombie {
    Random random = new Random();
    private String name;
    private int damage;
    private int health;
    private int money;
    private  int count = random.nextInt(3)+1;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Zombie(String name, int damage, int health, int money, int id) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.id =id;
    }
}
