package com.demo;

import java.util.Scanner;

public class StringEncodeDecode {

        public static void main(  String [] args )
        {
            Scanner input = new Scanner(System.in);

            System.out.println(" ");
            System.out.print( "Press 1 for Encoding, 2 for Decoding: " );
            int x = input.nextInt();
            String temp = input.nextLine();

            System.out.println(" ");
            System.out.print( "Enter message: ");
            String message = input.nextLine();
            System.out.println(" ");



            if ( x == 1)
            {

                encodeMessage( message );
            }

            else if ( x == 2 )
            {   

                decodeMessage( message );
            }

            else
                System.out.print("Invalid response");

        }


        public static void encodeMessage(String message)
        { 
            for (int i = 0; i < message.length(); i++)
            {
                char x = message.charAt(i);
                System.out.print((char)(27 - x));

             }
        }


        public static void decodeMessage (String message)
        {
            for (int i = 0; i < message.length(); i++)
            {
                char x = message.charAt(i);
                System.out.print((char)(27 - x));

            }
        }
}
