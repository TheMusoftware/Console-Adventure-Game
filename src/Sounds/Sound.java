package Sounds;
import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class Sound {
    public static void playMenuTheme() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       InputStream stream = Sound.class.getResourceAsStream("/Sounds/menu.wav");
       InputStream bufferedIn = new BufferedInputStream(stream);
        try{
            AudioInputStream audioStream=AudioSystem.getAudioInputStream(bufferedIn);
            Clip clip=AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }

}
