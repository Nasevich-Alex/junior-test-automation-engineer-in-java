package automation.training.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;


public class Main {
     static File films = new File("data//films.txt");
     static FileWriter writer;

    static {
        try {
            writer = new FileWriter(films);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void PrintInfo(File[] array, int number) throws IOException {
        for(File currentFile : array) {
            if(currentFile.isFile()) {
                writer.write("\t┃---" + currentFile.getName() + "\n");
                writer.flush();
            } else {
                if(currentFile.isDirectory()) {
                    writer.write("\n" + currentFile.getName() + "\n");
                    writer.flush();
                    PrintInfo(Objects.requireNonNull(currentFile.listFiles()), number++);
                }
            }
        }
    }

    public static void main(String[] args) {
        File directory = new File("D:\\FILMS");
        if(directory.exists() && directory.isDirectory()) {
            File[] array = directory.listFiles();
                try {
                    writer.write("_______________________________" + "\n");
                    assert array != null;
                    PrintInfo(array, 0);
                    writer.write("\n" + "___________________________________");
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
