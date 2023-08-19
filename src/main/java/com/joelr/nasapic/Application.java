package com.joelr.nasapic;

import com.joelr.nasapic.ImageViewer.ImageViewer;
import com.joelr.nasapic.controller.NasaPicController;
import com.joelr.nasapic.model.NasaPic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

/*
		███╗   ██╗ █████╗ ███████╗ █████╗     ██╗███╗   ███╗ █████╗  ██████╗ ███████╗
		████╗  ██║██╔══██╗██╔════╝██╔══██╗    ██║████╗ ████║██╔══██╗██╔════╝ ██╔════╝
		██╔██╗ ██║███████║███████╗███████║    ██║██╔████╔██║███████║██║  ███╗█████╗
		██║╚██╗██║██╔══██║╚════██║██╔══██║    ██║██║╚██╔╝██║██╔══██║██║   ██║██╔══╝
		██║ ╚████║██║  ██║███████║██║  ██║    ██║██║ ╚═╝ ██║██║  ██║╚██████╔╝███████╗
		╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝    ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝ ╚══════╝
		 ██████╗ ███████╗    ████████╗██╗  ██╗███████╗    ██████╗  █████╗ ██╗   ██╗
		██╔═══██╗██╔════╝    ╚══██╔══╝██║  ██║██╔════╝    ██╔══██╗██╔══██╗╚██╗ ██╔╝
		██║   ██║█████╗         ██║   ███████║█████╗      ██║  ██║███████║ ╚████╔╝
		██║   ██║██╔══╝         ██║   ██╔══██║██╔══╝      ██║  ██║██╔══██║  ╚██╔╝
		╚██████╔╝██║            ██║   ██║  ██║███████╗    ██████╔╝██║  ██║   ██║
		 ╚═════╝ ╚═╝            ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚═════╝ ╚═╝  ╚═╝   ╚═╝

	This program is an attempt to connect to a publicly available NASA API
    and display an image from that information.

 */

@SpringBootApplication
public class Application {
	private static final NasaPicController nasaPicController = new NasaPicController();
	private static ImageViewer imageViewer = null;

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(Application.class, args);

		NasaPic nasaPic = nasaPicController.getNasaPic();
		System.out.println(nasaPic.toString());
		imageViewer = new ImageViewer();

	}
}
