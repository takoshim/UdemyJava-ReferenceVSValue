package com.takeo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 10;
    int anotherIntValue = myIntValue;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        int[] myIntArray = new int[5];
        for (int i=0; i<myIntArray.length; i++) {
            myIntArray[i] = i;
        }
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntValue: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntValue: " + Arrays.toString(anotherIntArray));

        for (int i=0; i<anotherIntArray.length; i++) {
            anotherIntArray[i] = i + 1;
        }

        System.out.println("myIntValue: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntValue: " + Arrays.toString(anotherIntArray));
    }
}
