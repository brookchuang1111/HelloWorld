/******************************************************************************
 *  Name:
 *
 *  Description:  Reads in an image from a file, converts it to grayscale, and
 *  displays it on the screen.
 *
 *  Execution:    java Grayscale filename
 *
 *  % java Grayscale image.jpg
 *
 ******************************************************************************/

import java.awt.Color;

public class Grayscale {

    public static void main(String[] args) {
        Picture picture = new Picture(args[0]);
        int width  = picture.width();
        int height = picture.height();

        // convert to grayscale
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = picture.get(col, row);
		// Use the luminance library to get the gray scale
                Color gray = _______;
                picture.set(col, row, gray);
            }
        }
        picture.show();
    }

}

