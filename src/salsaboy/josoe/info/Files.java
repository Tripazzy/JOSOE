package salsaboy.josoe.info;

import salsaboy.josoe.User;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Files {
    private static RandomAccessFile file;
    static {
        try {
            file = new RandomAccessFile(Files.class.getResource("files.dat").toString(), "r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static String read(int location, User asking) throws IOException {
        if (asking.filesegs.contains(location)) {
            file.seek((long) (location));
            return file.readLine();
        } else {
            return "ERR®´å∂";    //This is the error for reading something the user doesn't own.
        }
    }
}
