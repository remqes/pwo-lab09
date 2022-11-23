package pwo.lab09.builder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class TxtPic3 {
    private char background;
    private char foreground;
    private int size;
    private String fileName;
    private String art;

    public TxtPic3() {
    }

    private TxtPic3(char background, char foreground,
            int size, String fileName) {
        this.background = background;
        this.foreground = foreground;
        this.size = size;
        this.fileName = fileName;
        art = "";
    }

    public TxtPic3 setBackground(char background) {
        this.background = background;
        return this;
    }

    public TxtPic3 setForeground(char foreground) {
        this.foreground = foreground;
        return this;
    }

    public TxtPic3 setSize(int size) {
        if (size < 1)
            size = 1;
        this.size = size;
        return this;
    }

    public TxtPic3 setFileName(String fileName) {
        try {
            Paths.get(fileName);
        } catch(Exception ex) {
            fileName = "out.txt";
        }
        this.fileName = fileName;
        return this;
    }

    public TxtPic3 createTxtPic() {
        return new TxtPic3(background, foreground, size, fileName);
    }

    private void genArt() {
        for (int i = 0; i < size; i++) {
            int count = i + 1;
            int start = (size - count) / 2;
            for (int j = 0; j < size; j++) {
                if (j < start || count == 0) {
                    art += background;
                } else {
                    art += foreground;
                    count--;
                }
            }
            art += "\n";
        }
    }

    private void toFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(art);
        writer.close();
    }

    public boolean save() {
        genArt();
        try {
            toFile();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}
