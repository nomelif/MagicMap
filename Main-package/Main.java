/*

 By Théo Friberg under GNU GPL v. 3


 Using MagicMap:

 MagicMap is invoked by typing java MagiMap.class -cli [path to input file] [path to output file]
 */

/***********************************************
 *                  IMPORTS                    *
 ***********************************************/

// Image-related

import java.awt.image.BufferedImage;

// IO-related

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/***********************************************
 * Main-class *
 ***********************************************/

public class Main {

	/**
	 * @param args
	 * 
	 */

	// Main-function

	public static void main(String[] args) {

		// See if invoked with -cli -argument

		if (args.length > 0) {

			// Application is invoked with -cli -argument

			if (args[0] == "-cli") {

				// Does the application get the right arguments?

				boolean right_args = false;

				if (args.length > 2) {

					// If the output-image's name is of type name.extension

					if (args[2].split(System.getProperty("file.separator2"))[args[2]
							.split(System.getProperty("file.separator2")).length - 1]
							.split("\\.").length > 1) {

						// Get the extension of the output-file

						String format = args[2].split(System
								.getProperty("file.separator2"))[args[2]
								.split(System.getProperty("file.separator2")).length - 1]
								.split("\\.")[args[2].split(System
								.getProperty("file.separator2"))[args[2]
								.split(System.getProperty("file.separator2")).length - 1]
								.split("\\.").length - 1];

						// Try opening the input-image

						BufferedImage img = null;

						try {

							// Open input-image

							img = ImageIO.read(new File(args[1]));

							/*
							 * Image processing here
							 */

							try {
								File outputfile = new File(args[2]);
								ImageIO.write(img, format, outputfile);
							} catch (IOException e) {
								System.err.println("Can't save image to '"
										+ args[0] + "'.");
							}

						} catch (IOException e) {

							// Something went wrong:

							System.err.println("Can't open image '" + args[0]
									+ "'.");

							// Tell that something went wrong

							right_args = false;

						}
					}

				} else {

					// Too few arguments, application was invoked incorrectly

					right_args = false;
				}

				// If the application wasn't invoked correctly

				if (right_args == false) {

					System.out
							.println("Usage: java MagicMap.class -cli [input file] [output file]");
				}

			}
		}

	}

}
