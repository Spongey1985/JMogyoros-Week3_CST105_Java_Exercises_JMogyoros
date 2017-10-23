package prgmexercise3;

/*
Program: Guess My Number
GuessMyNumber.java
Author: Jay S Mogyoros
Summary: Pick a number between 1 and 10000 and attempt to guess the correct number
Date: October 23, 2017
 */

import java.util.Scanner;

public class GuessMyNumber {
	
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);

   int a = 1 + (int) (Math.random() * 9999),
       guess, 
       count = 0;

   System.out.println("Guess an integer between 1 and 10000");

   while((guess = input.nextInt()) != a){
     if (guess > a)
     {  
       System.out.println("LOWER!");
     }
     else
     {
       System.out.println("HIGHER");
     }
     count++;
   }

   System.out.println("YOU WIN "+ count +" tries!");
  }

}