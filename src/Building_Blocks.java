/*
https://www.codewars.com/kata/55b75fcf67e558d3750000a3/train/java

Write a class Block that creates a block (Duh..)

##Requirements

The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.

Define these methods:

`getWidth()` return the width of the `Block`

`getLength()` return the length of the `Block`

`getHeight()` return the height of the `Block`

`getVolume()` return the volume of the `Block`

`getSurfaceArea()` return the surface area of the `Block`
 */

public class Building_Blocks {
    int width;
    int length;
    int height;

    Building_Blocks(int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    int getWidth() {
        return width;
    }

    int getLength() {
        return length;
    }

    int getHeight() {
        return height;
    }

    int getVolume() {
        return getWidth() * getLength() * getHeight();
    }

    int getSurfaceArea() {
        return getWidth() * getLength() * 2
                + getHeight() * getLength() * 2
                + getWidth() * getHeight() * 2;
    }
}
