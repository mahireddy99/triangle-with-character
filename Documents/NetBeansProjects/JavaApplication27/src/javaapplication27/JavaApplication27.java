package javaapplication27;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication27 {

    public static void displaywelcomemessage() {
        System.out.println("PROJECT 02B ");
        System.out.println("STUDENT ID :  1794805");
        System.out.println("STUDENT NAME :  MAHENDER REDDY");
    }

    public static int asknumber(String question) {
        int elements;
        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        elements = sc.nextInt();
        return elements;

    }

    public static void fillwithRandom(int[] arrayvector, int elements) {
        Random mn = new Random();
        int i;
        for (i = 0; i < elements; i++) {
        arrayvector[i] = elements;

        arrayvector[i] = mn.nextInt(6) + 5;

        }
    }

    public static void displayarray(int[] arrayvector, int elements) {
        
       for (int i=0;i<elements;i++){
           System.out.print("----");
       }
       
      
          System.out.println(" ");
          System.out.print("|");
        for (int i = 0; i < elements; i++) {
        System.out.print(arrayvector[i] + " ");
        System.out.print("|");
        }
        System.out.println(" ");
      for (int i=0;i<elements;i++){
           System.out.print("----");
       }
       
        System.out.println(" ");

    }

    public static void displayTriangle(int arrayvector) {
        int i;
        int j;
        for (i = 0; i < arrayvector; i++) {
        for (j = 0; j <= i; j++) {
        System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        displaywelcomemessage();

        int elements = asknumber("how many elements? ");
        int[] arrayvector = new int[elements];

        fillwithRandom(arrayvector, elements);
        displayarray(arrayvector, elements);

        for (int i = 0; i < elements; i++) {
        System.out.println("Triangle " + (i + 1));
        displayTriangle(arrayvector[i]);
        }

    }

}
