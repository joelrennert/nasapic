package com.joelr.nasapic.ImageViewer;

import com.joelr.nasapic.model.NasaPic;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageViewer extends JFrame {

    private NasaPic nasaPic = new NasaPic();
    private String imageUrl = nasaPic.getUrl();

    public ImageViewer() {
        super("NASA ASTRONOMY PICTURE OF THE DAY");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.setBackground(Color.black);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        this.setSize(900, 600);
        this.setLocationRelativeTo(null);

        // new panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Image image = null;
        URL url = null;
        URI uri = null;
        try {
//            url = new URL("https://i.imgur.com/b75ZXR0.jpg");   // <- Works
              url = new URL("https://apod.nasa.gov/apod/image/2308/ElephantTrunkBatSquidSeahorse1024.jpg");

//            uri = url.toURI();
//            url = new URL(uri.getPath());         // example hmm need to look into URI more, see API notes on hover
//            url = new URL(nasaPic.getUrl());                      // <- hmmmm needs work (bad url)
//            url = new URL(imageUrl);                              // <- doesnt work (bad url)
            image = ImageIO.read(url);
        } catch (MalformedURLException ex) {
            System.out.println("URL is bad");
        } catch (IOException ex) {
            System.out.println("Cannot load image");
        }

        // Add image to panel
        JLabel nasaImage = new JLabel(new ImageIcon(image));
        panel.add(nasaImage, BorderLayout.CENTER);
        this.getContentPane().add(panel, BorderLayout.CENTER);
//        this.pack();          // does not resize
        this.setVisible(true);
    }

}
