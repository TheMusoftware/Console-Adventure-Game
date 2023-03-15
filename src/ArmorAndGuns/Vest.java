package ArmorAndGuns;

public class Vest {
    private String name;
    private int defense;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vest(String name, int defense, int price) {
        this.name = name;
        this.defense = defense;
        this.price = price;
    }
    public Vest(){};
}
