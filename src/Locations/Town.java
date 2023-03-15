package Locations;
import Player.*;
import Zombies.Zombie;

public class Town extends BattleLoc{
    public Town(Zombie zombie, Player player) {
        super(zombie,player);
    }
    @Override
  public void printPlace() {
        System.out.println("                             ^\n" +
                "                _______     ^^^\n" +
                "               |xxxxxxx|  _^^^^^_\n" +
                "               |xxxxxxx| | [][]  |\n" +
                "            ______xxxxx| |[][][] |\n" +
                "           |++++++|xxxx| | [][][]|      \n" +
                "           |++++++|xxxx| |[][][] |\n" +
                "           |++++++|_________ [][]|\n" +
                "           |++++++|=|=|=|=|=| [] |\n" +
                "           |++++++|=|=|=|=|=|[][]|\n" +
                "___________|++HH++|  _HHHH__|   _________   _________  _________\n" +
                "         _______________   ______________      ______________\n" +
                "__________________  ___________    __________________    ____________");
    }
}
