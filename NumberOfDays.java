import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the year:");
        int year = input.nextInt();
        System.out.println("Please Enter the month:");
        int month = input.nextInt();

        String monthName = "";
        int monthDays = 0;

        switch (month) { 
            case 1: 
                monthName = "January";
                monthDays = 31;
                break;
            case 2:
                monthName = "February";
                if(year % 4 == 0){
                    monthDays = 29;
                } else {
                    monthDays = 28;
                }
                break;
            case 3:
                monthName = "March";
                monthDays = 31;
                break;
            case 4:
                monthName = "April";
                monthDays = 30;
                break;
            case 5:
                monthName = "May";
                monthDays = 31;
                break;
            case 6:
                monthName = "June";
                monthDays = 30;
                break;
            case 7: 
                monthName = "July";
                monthDays = 31;
                break;
            case 8:
                monthName = "August";
                monthDays = 31;
                break;
            case 9:
                monthName = "September";
                monthDays = 30;
                break;
            case 10:
                monthName = "October";
                monthDays = 31;
                break;
            case 11:
                monthName = "November";
                monthDays = 30;
                break;
            case 12:
                monthName = "December";
                monthDays = 31;
                break;
                
        }
        System.out.println(monthName + " " + year + " had " + monthDays + " days.");
    }
}
