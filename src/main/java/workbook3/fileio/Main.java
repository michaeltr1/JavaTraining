package workbook3.fileio;
import java.time.LocalDate;
import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reading and files");

        LocalDate today = LocalDate.now();
        String fileName = "whyjava" + today.getDayOfWeek() + "-" + today.getDayOfMonth() + "-of" + today.getMonth() + ".txt";

        try {
            // create poem.txt (it's made fresh each time the program runs)
            FileWriter fileWriter = new FileWriter("poem.txt");
            fileWriter.write("Roses are red\n");
            fileWriter.write("Violets are blue\n");
            fileWriter.write("Java is tricky\n");
            fileWriter.write("But I'm learning it too\n");
            fileWriter.close();

            // create the date-named file (reusing the variable with a new writer)
            fileWriter = new FileWriter(fileName);
            fileWriter.write("I want to learn java to create my own softwares to automate more of my work.\n");
            fileWriter.write("Coding can send me on nice vacations.\n");
            fileWriter.write("Lambos n stuff\n");
            fileWriter.close();

            // read poem.txt
            FileReader fileReader = new FileReader("poem.txt");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;
            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }
            bufReader.close();

            // read the date-named file
            System.out.println();
            fileReader = new FileReader(fileName);
            bufReader = new BufferedReader(fileReader);

            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }
            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // folder named after the current year and month, like 2026-10
        String folderName = today.format(DateTimeFormatter.ofPattern("yyyy-MM"));
        File folder = new File(folderName);
        folder.mkdirs();
        System.out.println("2026-10/zoon_screenshot.png");
        // screenshot name with today's date in it, like zoom_screenshot_2026-10-27.png
        String imageName = "zoom_screenshot_" + today + ".png";
        File image = new File(folder, imageName);
        System.out.println(image.getPath());

        // any other format needs a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate otherBirthDay = LocalDate.parse("10/17/2022", formatter);
        System.out.println(otherBirthDay);

        System.out.println("Today is: " + today);
        LocalTime time = LocalTime.now();
        System.out.println("The time is: " + time);
        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now, it is:" + rightNow);

        // date parts
        LocalDate date = LocalDate.now();
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Day of Year: " + date.getDayOfYear());
        System.out.println("Month Name: " + date.getMonth());
        System.out.println("Month Value: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());

        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
        System.out.println("Nanosecond: " + time.getNano());
    }
}