package fr.cakihorse.bootstraplib;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Frame {

    public static void newWindow(String title, int w, int h, Boolean isUndecorated, Boolean isResizable, Boolean isWithBackground, String imgUrl) {
        JFrame frame = new JFrame();

        if (isWithBackground = true && imgUrl != null) {
            // Créer le label pour afficher l'image de fond
            JLabel fondLabel = new JLabel();
            fondLabel.setIcon(new ImageIcon(imgUrl)); // Spécifiez le chemin de votre image ici
            fondLabel.setLayout(new BorderLayout());

            // Ajouter d'autres composants ou manipulations de la fenêtre ici

            // Ajouter le label de l'image de fond à la fenêtre
            frame.setContentPane(fondLabel);
        }
        //Définit un titre pour notre fenêtre
        frame.setTitle(title);
        //Définit sa taille : 400 pixels de large et 100 pixels de haut
        frame.setSize(w, h);
        //Nous demandons maintenant à notre objet de se positionner au centre
        frame.setLocationRelativeTo(null);
        //Termine le processus lorsqu'on clique sur la croix rouge
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (isUndecorated = true) {
            frame.setUndecorated(true);
        }

        if (isResizable = true) {
            frame.setResizable(true);
        }else
        {
            frame.setResizable(false);
        }



        //Et enfin, la rendre visible
        frame.setVisible(true);

        //TODO : fermer la fenêtre lors de la fin du dl
    }




}
