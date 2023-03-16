package Player;

import Locations.*;
import Sounds.Sound;
import Zombies.Crusher;
import Zombies.Normal;
import Zombies.Striker;
import Zombies.Zombie;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

/**
 * @author MuSoftware
 */
public class Game {
    SpecialFunc specialFunc = new SpecialFunc();
    Location location;
    Shop shop = new Shop();
    Player player = new Player();
    Inventory inventory = new Inventory();
    public void login() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        Sound.playMenuTheme();
        System.out.println("               _                      _                       \n" +
                "    /\\        | |                    | |                      \n" +
                "   /  \\     __| |__   __  ___  _ __  | |_  _   _  _ __   ___  \n" +
                "  / /\\ \\   / _` |\\ \\ / / / _ \\| '_ \\ | __|| | | || '__| / _ \\ \n" +
                " / ____ \\ | (_| | \\ V / |  __/| | | || |_ | |_| || |   |  __/ \n" +
                "/_/    \\_\\ \\__,_|  \\_/   \\___||_| |_| \\__| \\__,_||_|    \\___| \n" +
                "                                                              \n" +
                "                                                              \n" +
                "  _____                    _             _   \n" +
                " / ____|                  | |           | |  \n" +
                "| |       ___   _ __ ___  | |__    __ _ | |_ \n" +
                "| |      / _ \\ | '_ ` _ \\ | '_ \\  / _` || __|\n" +
                "| |____ | (_) || | | | | || |_) || (_| || |_ \n" +
                " \\_____| \\___/ |_| |_| |_||_.__/  \\__,_| \\__|\n" +
                "                                             \n" +
                "                                             \n");
        System.out.print("Please enter your name: ");
        player.setName(specialFunc.getAny());
        specialFunc.cls();
        player.selectCharacter();
        specialFunc.cls();
        System.out.printf(" Different types of zombies appeared as the infection spread rapidly near your village,%n" +
                " you need food, water and fire to protect your village. And I forgot to mention that collecting them requires a hero,%n" +
                " and I heard the hero's name is %s. If you think you are the right person,%n" +
                " destroy 10 of each zombie type and get the necessary items.%n%n",player.getName());
        Thread.sleep(9000);
        specialFunc.cls();
    }
    public void selectLocation() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        System.out.println(" _____________________________________________\n" +
                "|.'',        Select  where you go         ,''.|\n" +
                "|.'.'',                                 ,''.'.|\n" +
                "|.'.'.'',                             ,''.'.'.|\n" +
                "|.'.'.'.'',                         ,''.'.'.'.|\n" +
                "|.'.'.'.'.|                         |.'.'.'.'.|\n" +
                "|.<Oil .'.|===;                 ;===|<Kill'.'.|\n" +
                "|.'Rig>.'.|:T:|',             ,'|:S:|.'Creek>.|\n" +
                "|.'.'.'.'.|-o-|'.|, _______ ,|.'|-H-|.'.'.'.'.|\n" +
                "|.Include.|:W:|'.|'|<House>|'|.'|:O:|.Include.|\n" +
                "|.'.'.'.'.|-N-|',|'|  >5<  |'|,'|-P-|,',',',',|\n" +
                "|Flammable|>3<|'.|'|???????|'|.'|>4<|.'.'.'.'.|\n" +
                "|Burnable'|Fo-|','   /%%%\\   .'.|---|.Water'.'|\n" +
                "|.'.'.'.'.|od=:'    /%%%%%\\   ':.===|.'.'.'.'.|\n" +
                "|.'>1<'.'.|%%%%%%%%%%%%%%%%%%%%%%%%|.'.>2<'.'.|\n" +
                "|.'.'.'.','       /%%%%%%%%%\\      .','.'.'.'.|\n" +
                "|.','.','        /%%%%%%%%%%%\\      . ','.'.'.|\n" +
                "|.'.','         /%%%%%%%%%%%%%\\        .','.'.|\n" +
                "|.'.'          /%%%%%%%%%%%%%%%\\         .','.|\n" +
                "|;____________/%%%% -You- %%%%%%\\____________;|");
        System.out.print("Selection: ");
        int selection = specialFunc.getNumber(1,5);
        specialFunc.cls();
        switch (selection){
            case 1:
                Zombie crusher = new Crusher();
                OilRig oilRig = new OilRig(crusher,player);
                oilRig.printPlace();
                oilRig.combat(inventory);
                break;
            case 2:
                Zombie striker = new Striker();
                KillKreck killKreck = new KillKreck(striker,player);
                killKreck.printPlace();
                killKreck.combat(inventory);
                break;
            case 3:
                Normal normal = new Normal();
                Town town = new Town(normal,player);
                town.printPlace();
                town.combat(inventory);
                break;
            case 4:
                shop.printPlace(inventory,player);
                break;
            case 5:
                House house = new House(player);
                house.printPlace();
                inventory.showInventory(player.getMoney());
                System.out.printf("Your money: %d%n",player.getMoney());
                System.out.println("Press enter to exit...");
                specialFunc.getAny();
                specialFunc.cls();
                break;
            default:
                break;

        }
        specialFunc.cls();

    }
    public void start() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        login();
        while(!checkStatus() && checkHp()){
        selectLocation();
        }
        partingGift();
        Thread.sleep(3000);
    }
    boolean checkStatus() {
        return inventory.isFire() && inventory.isFood() && inventory.isWater();
    }
    boolean checkHp(){
        return player.getHealthy() > 0;
    }
    void partingGift(){
        if(checkHp())
        System.out.printf("    .--,.-,\n" +
                "   /.-',\\:.\\  .===.    ,;;,;;,\n" +
                "  /;    \\\\:.\\/    _)  ;;;;;;;;;\n" +
                "  |'     \\\\:(  _,`'>   ';;;;;'            Congratulations %s\n" +
                "  |;      \\\\(_/ ._=      ';'              You were the best actor I've ever seen\n" +
                "  |;       ;/ /`|\\                        I will never forget you\n" +
                "  /,      _/  |-' `\\\n" +
                " /;    __//(  \\_,;;,;;,\n" +
                "|;  __/  /  \\  /);;;;;;)\n" +
                "| _/|/  /    \\/`';;;;;'    ,;;,;;,\n" +
                "|/     /      (   ';'     ;;;;;;;;;\n" +
                "      (    .-, \\           ';;;;;'\n" +
                "       )  /`\\ ) \\            ';'\n" +
                "      '._/|/| |.'\n" +
                "       _//  \\|\n" +
                "       | /   ||\n" +
                "       |/   / |\n" +
                "            `\\|\n" +
                "              '\n",player.getName());
        else
            System.out.print("      _____|~~\\_____      _____________\n" +
                    "  _-~               \\    |    \\\n" +
                    "  _-    | )     \\    |__/   \\   \\ \t\t\t You died as a result of an unfortunate event.\n" +
                    "  _-         )   |   |  |     \\  \\ \t\t\t Now you will live in the real world only as data :)\n" +
                    "  _-    | )     /    |--|      |  |\n" +
                    " __-_______________ /__/_______|  |_________\n" +
                    "(                |----         |  |\n" +
                    " `---------------'--\\\\\\\\      .`--'\n" +
                    "                              `||||\n");
    }

}
