package Locations;
import  ArmorAndGuns.*;
import Player.*;
import Sounds.Sound;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.lang.management.PlatformLoggingMXBean;

public class Shop{
    SpecialFunc specialFunc = new SpecialFunc();

    public void printGuns(Inventory inventory, Player player) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        Guns g36e = new G36E();
        Guns at22 = new AT22();
        Guns azazel = new Azazel();
        System.out.printf("        ^         \n" +
                "         | |        \n" +
                "       @#####@      \n" +
                "     (###   ###)-.  \t\t\t\t\t\t\tMoney: %d\n" +
                "   .(###     ###) \\ \n" +
                "  /  (###   ###)   )\n" +
                " (=-  .@#####@|_--\" \tDrop your money and choose the gun you want dude!\n" +
                " /\\    \\_|l|_/ (\\   \t-------Name-------Damage-------Price--------\n" +
                "(=-\\     |l|    /     \t| 1- \t%s        %d          %d        |\n" +
                " \\  \\.___|l|___/     \t| 2-  \t%s      %d          %d        |\n" +
                " /\\      |_|   /      \t| 3-   \t%s      %d         %d       |\n" +
                "(=-\\._________/\\     \t--------------------------------------------   \n" +
                " \\             /       \t Select vest or press 0 to exit.\n" +
                "   \\._________/     \n" +
                "     #  ----  #     \n" +
                "     #   __   #       \n" +
                "     \\########/      \n" +
                "\n" +
                "         V\n" +
                "             V\n" +
                "           V%n",player.getMoney(),g36e.getName(),g36e.getDamage(),g36e.getPrice(),at22.getName(),at22.getDamage(),at22.getPrice(),azazel.getName(),azazel.getDamage(),azazel.getPrice());

        int selection = specialFunc.getNumber(0,3);
        switch (selection){
            case 0:
                System.out.println("You left the shop");
                specialFunc.cls();
                break;
            case 1:
                buyGun(g36e,player,inventory);
                break;
            case 2:
                buyGun(at22,player,inventory);
                break;
            case 3:
                buyGun(azazel,player,inventory);
                break;
            default:
                break;

        }
    }
    public void printShields(Inventory inventory,Player player) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        Vest heavy = new HeavyVest();
        Vest recon = new ReconVest();
        Vest light = new LightVest();
        System.out.printf(" ___| |__ (_) ___| | __| |___ \n" +
                " / __| '_ \\| |/ _ \\ |/ _` / __|\n" +
                " \\__ \\ | | | |  __/ | (_| \\__ \\\n" +
                " |___/_| |_|_|\\___|_|\\__,_|___/\n" +
                "armor - protection - metal \t\t\tMoney: %d%n",player.getMoney());
        System.out.printf("-------Name-------Defence-------Price-------\n"
                          +"|1- %s        %d         %d      | \n",light.getName(),light.getDefense(),light.getPrice());
        System.out.printf("--------------------------------------------\n"
                +"|2- %s        %d         %d      | \n",recon.getName(),recon.getDefense(),recon.getPrice());
        System.out.printf("--------------------------------------------\n"
                +"|3- %s        %d         %d      | \n",heavy.getName(),heavy.getDefense(),heavy.getPrice());
        System.out.print("--------------------------------------------\n");
        System.out.println("Select vest or press 0 to exit.");
        int selection = specialFunc.getNumber(0,3);
        switch (selection){
            case 0:
                System.out.println("You left the shop");
                specialFunc.cls();
                break;
            case 1:
                buyVest(light,player,inventory);
                break;
            case 2:
               buyVest(recon,player,inventory);
                break;
            case 3:
                buyVest(heavy,player,inventory);
                break;
            default:
                specialFunc.cls();
                break;
        }

    }
    boolean checkBalance(int balance, int price){
        return balance > price;
    }
    void buyVest(Vest vest,Player player,Inventory inventory) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        if(checkBalance(player.getMoney(), vest.getPrice())){
            player.setMoney(player.getMoney() - vest.getPrice());
            inventory.setVestName(vest.getName());
            inventory.setVestDefence(vest.getDefense());
            System.out.printf("%s was successfully purchased%nYour money: %d%n",vest.getName(),player.getMoney());
            Sound.money();
        }
        else System.out.println("Operation cancelled as you don't have enough money.\n");
        Thread.sleep(3000);
        specialFunc.cls();
    }
    void buyGun(Guns gun, Player player, Inventory inventory) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        if(checkBalance(player.getMoney(), gun.getPrice())){
            player.setMoney(player.getMoney()- gun.getPrice());
            inventory.setWeaponName(gun.getName());
            inventory.setWeaponDamage(gun.getDamage());
            System.out.printf("%s was successfully purchased%nYour money: %d%n",gun.getName(),player.getMoney());
            Sound.money();
        }
        else System.out.println("Operation cancelled as you don't have enough money.\n");
        Thread.sleep(3000);
        specialFunc.cls();
    }
    public void printPlace(Inventory inventory, Player player) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        System.out.printf("                 \n" +
                "   |\\                     /) \t\t\t\t\tMoney: %d\n" +
                " /\\_\\\\__               (_//\n" +
                "|   `>\\-`     _._       //`)\n" +
                " \\ /` \\\\  _.-`:::`-._  //\n" +
                "  `    \\|`    :::    `|/ \tSelect store\n" +
                "        |     :::     | \t1-Gun Store\n " +
                "       |.....:::.....| \t2-Shield Store\n " +
                "       |:::::::::::::| \t0-Exit\n " +
                "       |     :::     |\n" +
                "        \\     :::     /\n" +
                "         \\    :::    /\n" +
                "          `-. ::: .-'\n" +
                "           //`:::`\\\\\n" +
                "          //   '   \\\\\n" +
                "         |/         \\\\%n",player.getMoney());
        int selection = specialFunc.getNumber(2);
        specialFunc.cls();
        switch (selection){
            case 1:
                printGuns(inventory, player);
                break;
            case 2:
                printShields(inventory,player);
                break;
            default:
                break;
        }
    }
}
