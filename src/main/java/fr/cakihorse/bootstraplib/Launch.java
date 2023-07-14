package fr.cakihorse.bootstraplib;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Launch {

    public static void start(String outPutPath, Boolean isOnlinuxorMacos) {
        try {
            File jarFile = new File(outPutPath);

            if (Desktop.isDesktopSupported() && jarFile.exists()) {
                Desktop.getDesktop().open(jarFile);

                System.exit(1);
            } else {
                System.out.println("Impossible de lancer le fichier JAR.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
