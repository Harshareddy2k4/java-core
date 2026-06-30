package com.javaintro;
public class Block1 {
//patterns
    public static void main(String[] args) {

        System.out.println("\u0054\u0068\u0061\u006E\u006B\u0073 \u0928\u092E\u0938\u094D\u0924\u0947");
      for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2 - i; j++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");

            for (int j = 0; j < 3 - 2 * i; j++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");

            System.out.println();
        }

    
        for (int i = 4; i >= 1; i--) {

            for (int j = 0; j < 5 - i; j++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}