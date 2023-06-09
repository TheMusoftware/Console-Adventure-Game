package Locations;
import Player.SpecialFunc;
import Sounds.Sound;
import Zombies.*;
import Player.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public abstract class BattleLoc extends Location {
    SpecialFunc specialFunc = new SpecialFunc();
    Zombie zombie;
    Player player;
    static int deadNormal = 0;
    static int deadStriker = 0;
   static int deadCrusher = 0;
    public BattleLoc(Zombie zombie, Player player){
        this.zombie = zombie;
        this.player = player;
    }

    public  void combat(Inventory inventory) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        //specialFunc.cls();
        Sound.stopMenuTheme();
        Sound.playAmbient();
        int zombieCount = zombie.getCount();
        while (player.getHealthy()>0 && zombieCount>0 ) {
            System.out.printf("There was %d %s(s)%nPress (a) attack Press (e) escape: ", zombieCount, zombie.getName());
            String str = specialFunc.getDoubleBox("a","e");
            switch (str) {
                case "a":
                    zombie.setHealth(zombie.getHealth() - this.player.getDamage()-inventory.getWeaponDamage());
                    if (zombie.getHealth() <= 0) {
                        zombieCount--;
                        if(zombieCount!=0)
                        zombie.setHealth(player.getDamage() + inventory.getWeaponDamage() - zombie.getHealth());
                        player.setMoney(player.getMoney() + zombie.getMoney());
                        Sound.money();
                        switch (zombie.getId()){
                            case 1:
                                deadNormal++;
                                if(deadNormal>=10) inventory.setFood(true);
                                break;
                            case 2:
                                deadStriker++;
                                if(deadStriker>=10) inventory.setWater(true);
                                break;
                            case 3:
                                deadCrusher++;
                                if(deadCrusher>=10) inventory.setFire(true);
                                break;
                            default:
                                break;
                        }
                    }
                    player.setHealthy(player.getHealthy()-zombie.getDamage()*zombieCount+inventory.getVestDefence()*zombieCount);
                    if(player.getHealthy()<0 && zombieCount>0) player.setHealthy(0);
                    System.out.printf("%s(s) attack you your reaming HP %d%n", zombie.getName(), player.getHealthy());
                    Sound.hurtPain();
                    break;
                case "e":
                    Sound.coward();
                    System.out.println("You're going back to your village empty-handed, coward!");
                    zombieCount = -1;
            }
        }
        if(zombieCount==0){
            Sound.goodJob();
            System.out.println("You killed all the zombies, you're going back to the Village");
        }
        Thread.sleep(2000);
        specialFunc.cls();
        Sound.stopAmbient();
        Sound.playMenuTheme();
    }
}
