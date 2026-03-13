// How to play audio in Java (.wav , .au , .aiff)
package MusicPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Parth\\Documents\\Java\\Day 10\\MusicPlayer\\Without Me.wav";
        File file = new File(filePath);

        try (Scanner sc = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice : ");

                response = sc.next().toUpperCase();

                switch (response) {
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;
                    case "Q":
                        clip.close();
                        break;
                    default : System.out.println("Invalid Choice");
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Unable to locate audio file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio not found");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

    }

}
