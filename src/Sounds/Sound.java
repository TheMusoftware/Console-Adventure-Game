package Sounds;
import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
public class Sound {
    static AudioInputStream audioStreamMenu;
    static Clip clipMenu;
    static AudioInputStream audioStreamAmbient;
    static  Clip clipAmbient;
    public static void playMenuTheme() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       InputStream stream = Sound.class.getResourceAsStream("/Sounds/menu.wav");
       InputStream bufferedIn = new BufferedInputStream(stream);
        try{
            audioStreamMenu = AudioSystem.getAudioInputStream(bufferedIn);
            clipMenu = AudioSystem.getClip();
            clipMenu.open(audioStreamMenu);
            clipMenu.start();
            clipMenu.loop(Clip.LOOP_CONTINUOUSLY);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void stopMenuTheme() throws IOException {
        audioStreamMenu.close();
        clipMenu.stop();
    }
    public static void playAmbient() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        InputStream stream = Sound.class.getResourceAsStream("/Sounds/warambient.wav");
        InputStream bufferedIn = new BufferedInputStream(stream);
        try{
            audioStreamAmbient = AudioSystem.getAudioInputStream(bufferedIn);
            clipAmbient= AudioSystem.getClip();
            clipAmbient.open(audioStreamAmbient);
            clipAmbient.start();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void stopAmbient() throws IOException {
        audioStreamAmbient.close();
        clipAmbient.stop();
    }
    public static void money() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        InputStream stream = Sound.class.getResourceAsStream("/Sounds/money.wav");
        InputStream bufferedIn = new BufferedInputStream(stream);
        try{
            AudioInputStream audioStream=AudioSystem.getAudioInputStream(bufferedIn);
            Clip clip=AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void coward(){
        InputStream stream = Sound.class.getResourceAsStream("/Sounds/coward.wav");
        InputStream bufferedIn = new BufferedInputStream(stream);
        try{
            AudioInputStream audioStream=AudioSystem.getAudioInputStream(bufferedIn);
            Clip clip=AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void goodJob(){
        InputStream stream = Sound.class.getResourceAsStream("/Sounds/goodjob.wav");
        InputStream bufferedIn = new BufferedInputStream(stream);
        try{
            AudioInputStream audioStream=AudioSystem.getAudioInputStream(bufferedIn);
            Clip clip=AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
