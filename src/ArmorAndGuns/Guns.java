package ArmorAndGuns;

public class Guns {
    private String name;
    private int damage;
    private int price;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Guns(String name, int damage, int price) {
        this.name = name;
        this.damage = damage;
        this.price = price;
    }
}
