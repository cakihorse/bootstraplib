package fr.cakihorse.bootstraplib;

import java.awt.*;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Downlaod {



    public static void start(String url, String outputFilePath) {

        try (BufferedInputStream bis = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            byte data[] = new byte[1024];
            int byteContent;
            while ((byteContent = bis.read(data, 0, 1024)) != -1) {
                fos.write(data, 0, byteContent);
            }
            
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
