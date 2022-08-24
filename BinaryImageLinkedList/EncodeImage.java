package BinaryImageLinkedList;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;

public class EncodeImage {

//    static int rows = 28;
// static   LinkedList []l = new LinkedList[rows];
    public EncodeImage(){

    }


    //          To read the image and convert into it's appropriate pixels:
    public static int[][] loadGrayPixelsFromFile(File file) throws IOException {

        BufferedImage image = ImageIO.read(file);
        Raster raster = image.getData();

        int[][] pixels = new int[image.getWidth()][image.getHeight()];


        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                pixels[y][x] = raster.getSample(x, y, 0);
            }
        }

        return pixels;
    }



    public  void convertToBinary(int[][] pixels) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                if (pixels[i][j] > 0)
                    pixels[i][j] = 1;
            }
        }

    }


    int pixelSize(int[][] pixel){
        int size = 0;
        for (int i = 0; i <pixel.length ; i++) {
            size++;
        }
        return size;
    }


    void encode(int[][] pixels){

//        Initializing the counter to keep track of similar elements
        int counter = 0;
//      Calculating the rows.
        int rows = pixelSize(pixels);

//        Creating a linked list for every row in the array to store its corresponding values
        LinkedList []l = new LinkedList[rows];
            for (int i = 0; i <rows ; i++) {
                l[i] = new LinkedList();
            }

// Traversing though the rows and columns to match the elements .
        for (int i = 0; i < rows; i++) {
            int firstValue = pixels[i][0];
            counter = 1;
            for (int j = 1; j < pixels[i].length ; j++) {
                if(firstValue == pixels[i][j] ){
                    counter++;
                }else{
                    l[i].push(counter);
                    firstValue = pixels[i][j];
                    counter =1;
                }
            }
            l[i].push(counter);

            System.out.println(i  + " Row " );
            l[i].display();

        }
    }



}
