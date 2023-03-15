package Player;

public class Inventory {

    boolean water = false;
    boolean food = false;
    boolean fire = false;
    String weaponName = "None";
    int weaponDamage;
    String vestName = "None";
    int vestDefence;

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFire() {
        return fire;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public String getVestName() {
        return vestName;
    }

    public void setVestName(String vestName) {
        this.vestName = vestName;
    }

    public int getVestDefence() {
        return vestDefence;
    }

    public void setVestDefence(int vestDefence) {
        this.vestDefence = vestDefence;
    }
    public  void showInventory(int money){
        String strFood,strWater,strFire;
        if(isFood())strFood = "Sufficient";
        else strFood = "Insufficient";
        if(isWater()) strWater = "Sufficient";
        else strWater = "Insufficient";
        if(isFire()) strFire = "Sufficient";
        else strFire = "Insufficient";
        System.out.println("-------------------- -------------------------");
        System.out.printf(" Your weapon: %s  | $Money: %d%n " +
                         "Weapon Attack: %d   | Food:  %s %n " +
                         "Your vest: %s    | Water: %s %n " +
                         "Vest Defence: %d    | Fire:  %s%n ",getWeaponName(),money,getWeaponDamage(),strFood,getVestName(),strWater,getVestDefence(),strFire);
        System.out.println("-------------------- -------------------------");
    }

}
