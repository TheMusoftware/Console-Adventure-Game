package Locations;
import Player.*;
public class House extends SafeLoc{
    public House(Player player) {
        this.player = player;
    }

    @Override
    public void printPlace() {
        System.out.println("                                   /\\\n" +
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

        System.out.printf("     _____\n" +
                "    [IIIII]\n" +
                "     )\"\"\"(\n" +
                "    /     \\\n" +
                "   /       \\    Your current hp: %d\n" +
                "   |`-...-'|\n" +
                "   |asprin |     Your updated hp: %d\n" +
                " _ |`-...-'j    _\n" +
                "(\\)`-.___.(I) _(/)\n" +
                "  (I)  (/)(I)(\\)\n" +
                "     (I)           %n",player.getHealthy(),player.getMaxHp());
        player.setHealthy(player.getMaxHp());
    }


}
