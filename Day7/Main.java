package ReadFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // How to read a file in Java (3 Popular Options)

        // Buffered Reader + FileReader: = Best for reading text files line-by-line.
        // FileInputStream = Best for binary files such as (image,audio,music).
        // RandomAccessFile = Best for read/write specific portions of large files.

        String filePath = "C:\\Users\\Parth\\Documents\\Java\\Day 10\\ReadFiles\\text.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found in directory");
        }
        catch(IOException e){
            System.out.println("Something went Wrong ");
        }

    }
}
