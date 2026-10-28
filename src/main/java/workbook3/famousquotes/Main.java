package workbook3.famousquotes;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "The way to get started is to quit talking and begin doing. - Walt Disney",
                "Opportunities don't happen. You create them. - Chris Grosser",
                "Success is not final; failure is not fatal: it is the courage to continue that counts. - Winston Churchill",
                "The secret of getting ahead is getting started. - Mark Twain",
                "Risk comes from not knowing what you're doing. - Warren Buffett",
                "Price is what you pay. Value is what you get. - Warren Buffett",
                "If you can dream it, you can do it. - Walt Disney",
                "Don't be afraid to give up the good to go for the great. - John D. Rockefeller",
        };

        Scanner read = new Scanner(System.in);
        String again = "yes";
        while (again.equalsIgnoreCase("yes")) {
            try {
                System.out.println("Enter number from 0 - 7");
                String answer = read.nextLine();
                int number = Integer.parseInt(answer);
                System.out.println(quotes[number]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Pick a number in the right range.");
            }
            System.out.println("Want another quote? yes/no");
            String answer = read.nextLine();

        }
            }
            }



