package BinaryImageLinkedList;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */

import java.io.File;
import java.io.IOException;

public class Main {
    static void pixelSize (int [][] pixel){

    }
    public static void main(String[] args) throws IOException {
        EncodeImage e = new EncodeImage();
        int[][] pixels = e.loadGrayPixelsFromFile(new File("c:/Data/seven.png"));
//      Converting the images pixels to binary numbers
        e.convertToBinary(pixels);
        e.encode(pixels);


        System.out.println( "\t");
        System.out.println( "\t");
        int size = 28;
        DecodeImage [] d = new DecodeImage[size];
        if(size<= 28){
            for (int i = 0; i <size ; i++) {
                d[i] = new DecodeImage();
            }
        }
        /*d[0].push(0);
        d[1].push(5);
        d[0].push(5);
        d[2].push(7);*/

        d[0].push(3);
        d[0].push(4);
        d[0].display();
        d[1].display();
        d[2].display();
    }


}
