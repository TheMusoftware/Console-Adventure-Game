package Locations;

import Player.Player;
import Player.SpecialFunc;
import Zombies.Crusher;
import Zombies.Zombie;

public class OilRig extends BattleLoc{
    SpecialFunc specialFunc = new SpecialFunc();
    public OilRig(Zombie zombie,Player player) {
        super(zombie,player);
    }

    @Override
    public void printPlace() {
        System.out.println("            /\\\n" +
                "             /\\/\\\n" +
                "            _|/\\|_\n" +
                "           |______|\n" +
                "            |\\/\\/|\n" +
                "           \\|/\\/\\|   .''`/:\n" +
                "   :\\''.    \\`'. |  ||  /  :\n" +
                "   : \\ ||   |\\ |||  || /    o\n" +
                "   j _\\||__/__\\||_\\_||/___\n" +
                "     |___________________|\n" +
                "      |  |   |   |   |  |\n" +
                "~~~~~~|~~|~~~|~~~|~~~|~~|~~~~~~");

    }
}
