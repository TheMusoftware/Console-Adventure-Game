package Player;

import ArmorAndGuns.Vest;

public class Player {
    SpecialFunc specialFunc = new SpecialFunc();
    Inventory inventory = new Inventory();
    int damage;
    int healthy;
    int money;
    String name;
    int maxHp;

    public int getMaxHp() {
        return maxHp;
    }

    private void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public Inventory getInventory() {
        return inventory;
    }


    public void setInventory(Vest vest) {
        this.inventory.setVestDefence(vest.getDefense());
        this.inventory.setVestName(vest.getName());

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void selectCharacter() {
        // 0 name 1 Damage 2 HP 3 Money (X) 4 id
        Object[][] characters = new Object[3][4];
        characters[0][0] = "Hauser";
        characters[0][1] = 25;
        characters[0][2] = 105;
        characters[0][3] = 75;
        //characters[0][4] = 1;
        characters[1][0] = "Codename Lynx";
        characters[1][1] = 35;
        characters[1][2] = 90;
        characters[1][3] = 100;
        //characters[1][4] = 2;
        characters[2][0] = "Rocco";
        characters[2][1] = 40;
        characters[2][2] = 120;
        characters[2][3] = 25;
        //characters[2][4] = 3;


        System.out.println(characters.length);
        System.out.printf("                                         .        \n" +
                "                                        .~^.      \n" +
                "                                        ^^^.      \n" +
                "                                  ...::^::        \n" +
                "                               .... .~^.          \n" +
                "                             .^^~^^..    --->Select your character<---       \n" +
                "                           :^^~^~^:                 \n" +
                "                          .^^~^~::              \n" +
                "                     :^~^^:.....   1- %1$s              \n" +
                "                   .:~^~^~:.                      \n" +
                "                 :^~~^~^:...^^~::.:.:.:.          \n" +
                "                ^^!^!^~:. ..^:~:!^!^!^!^^         \n" +
                "             .~:!:~:^.  :       .........         \n" +
                "              ^:~:!^~.     2- %2$s                     \n" +
                "           :.~.:  :~^^                            \n" +
                "         ^^~^~~^.  :^~:                           \n" +
                "      .:~^~^~^^     ..                            \n" +
                "    ::!:!:!:!:.     3- %3$s                              \n" +
                "    ^:!:!:!::                                     \n" +
                "      .:~:^                                       \n" +
                "        .                                         \n",characters[0][0],characters[1][0],characters[2][0]);
        int selection = specialFunc.getNumber(1, characters.length);
                //setName((String)characters[selection-1][0]);
                setDamage((int)characters[selection-1][1]);
                setHealthy((int)characters[selection-1][2]);
                setMoney((int)characters[selection-1][3]);
                setMaxHp((int)characters[selection-1][2]);
    }
    void showPlayerInfo(){
        System.out.printf("Name: %s%nDamage: %d%nHealth Point: %d%nMoney: %d%n",getName(),getDamage(),getHealthy(),getMoney());
    }
}
