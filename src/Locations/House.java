package Locations;
import Player.*;
public class House extends SafeLoc{
    public House(Player player) {
        this.player = player;
    }

    @Override
    public void printPlace() {
        System.out.println("                                  /\\\n" +
                "                              /\\  //\\\\\n" +
                "                       /\\    //\\\\///\\\\\\        /\\\n" +
                "                      //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\n" +
                "         /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\n" +
                "        / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\n" +
                "       /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       *\n" +
                "      /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\n" +
                "     / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\n" +
                "    / ^^  ^ ^ ^\\  /______________________________\\ ^ ^ \\ /|o|||\\\n" +
                "   /  ^  ^^ ^ ^  /________________________________\\  ^  /|||||o|\\\n" +
                "  /^ ^  ^ ^^  ^    ||___|___||||||||||||___|__|||      /||o||||||\\\n" +
                " / ^   ^   ^    ^  ||___|___||||||||||||___|__|||          | |\n" +
                "/ ^ ^ ^  ^  ^  ^   ||||||||||||||||||||||||||||||oooooooooo| |ooooooo\n" +
                "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.printf("Your old hp: %d%n",player.getHealthy());
        player.setHealthy(player.getMaxHp());
        System.out.printf("Your new hp: %d%n",player.getHealthy());

    }


}
