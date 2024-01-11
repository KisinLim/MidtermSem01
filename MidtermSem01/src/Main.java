import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a short date in the format YYYY-MM-DD: ");
        String shortDate = Input.nextLine();
        String[] dateParts = shortDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        String monthName = " ";
        if (month == 1) {
            monthName = "January";
        } else if (month == 2) {
            monthName = "February";
        } else if (month == 3) {
            monthName = "March";
        } else if (month == 4) {
            monthName = "April";
        } else if (month == 5) {
            monthName = "May";
        } else if (month == 6) {
            monthName = "June";
        } else if (month == 7) {
            monthName = "July";
        } else if (month == 8) {
            monthName = "August";
        } else if (month == 9) {
            monthName = "September";
        } else if (month == 10) {
            monthName = "October";
        } else if (month == 11) {
            monthName = "November";
        } else if (month == 12) {
            monthName = "December";
        }
        String[] dayOfWeekNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayOfWeek = (year + year/4 - year/100 + year/400 + (13*month + 8)/5 + day) % 7;
        String dayOfWeekName = dayOfWeekNames[dayOfWeek];
        System.out.printf("%s %d, %d (%s)", monthName, day, year, dayOfWeekName);
    }
}
