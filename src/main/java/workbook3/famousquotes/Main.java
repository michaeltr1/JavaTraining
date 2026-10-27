package workbook3.famousquotes;

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

        Scanner scanner = new Scanner(System.in);
        String again = "yes";
        while (again.equalsIgnoreCase("yes")) {
        try {
            //My 8 quotes

            System.out.println("Enter number from |1 - 8|");
            String answer = read.nextLine();

            String answer2 = read.nextLine();

            if (answer.equalsIgnoreCase("yes")) ;
            {
                System.out.println(quotes[0]);
            }
        }
    }
}
