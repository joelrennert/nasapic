package com.joelr.nasapic.ImageViewer;

import com.joelr.nasapic.controller.NasaPicController;
import com.joelr.nasapic.model.NasaPic;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageViewer extends JFrame {

    private final NasaPicController nasaPicController = new NasaPicController();
    private final NasaPic nasaPic = nasaPicController.getNasaPic();
    private final String imageUrl = nasaPic.getUrl();

    public ImageViewer() {

        super("NASA ASTRONOMY PICTURE OF THE DAY");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.setBackground(Color.black);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(new BorderLayout());

        Image image = null;
        URL url;

        try {
            url = new URL(imageUrl);
            image = ImageIO.read(url);
        } catch (MalformedURLException ex) {
            System.out.println("URL is bad or null");
        } catch (IOException ex) {
            System.out.println("Cannot load image");
        }

        JLabel nasaImage = new JLabel(new ImageIcon(image));
        panel.add(nasaImage, BorderLayout.CENTER);
        this.getContentPane().add(panel, BorderLayout.CENTER);
        this.setVisible(true);

    }

}
