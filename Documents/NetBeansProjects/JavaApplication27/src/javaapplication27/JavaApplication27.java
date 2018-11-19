/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;


public class JavaApplication13 {
public static void printheader(){
    System.out.println("**************");
    System.out.println("draw triangle");
    System.out.println("**************");
}
public static int askline(){
    System.out.println("how many lines?  ");
int line;
Scanner sc= new Scanner(System.in);
line = sc.nextInt();
    return line;
}
public static String askcharacter()
{
    Scanner sc = new Scanner (System.in);
     
     String character;
    System.out.println("which character to use  ");
    character  =sc.nextLine();
    return character;
}
public static void printline(int space,int charcount, String charToprint){
    int i;
    for(i=1;i<=space;i++){
        System.out.print(" ");
    }
    for (i=1;i<=charcount;i++){
        System.out.print(charToprint);
    }
    System.out.println(" ");
}
    public static void main(String[] args) {
       int i;
       int line;
       int space ;
       int charcount ;
       String charToprint;
       line=askline();
    String character = askcharacter();
    for(i=0;i<=line;i++){
        space =line-i;
        charcount=(i*2)-1;
       printline(space, charcount, character);
        
      
    }
       
    }
    
}
