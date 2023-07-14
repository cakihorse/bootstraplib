package fr.cakihorse.bootstraplib;

import javax.swing.*;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Download {



    public static void start(String url, String outputFilePath) {

        try (BufferedInputStream bis = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            byte data[] = new byte[1024];
            int byteContent;
            while ((byteContent = bis.read(data, 0, 1024)) != -1) {
                fos.write(data, 0, byteContent);

            }
            //System.exit(1);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace(System.out);
        }
    }
}
