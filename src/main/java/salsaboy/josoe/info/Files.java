package salsaboy.josoe.info;

import salsaboy.josoe.Error;
import salsaboy.josoe.User;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Files {
    private static RandomAccessFile file;
    static {
        try {
            file = new RandomAccessFile(Files.class.getResource("files.dat").toString(), "r");
        } catch (FileNotFoundException e) {
            final String message = "A file is missing. Please re-install JOSOE. Unfortunately, you will lose all files.";
            JOptionPane.showMessageDialog (null, message, "ERROR", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }
    public static String read(int location, User asking) throws IOException {
        if (asking.filesegs.contains(location)) {
            file.seek((long) (location));
            return file.readLine();
        } else {
            //This is the error for reading something the user doesn't own. No readers should accept this.
            return Error.FILE_DOESNT_BELONG_TO_USER;
        }
    }
}
