package lab4.date;

import java.util.Scanner;

public class MyDate {
    public static final String [] dayString = {
        "UNKNOWN",
        "First", 
        "Second",
        "Third",
        "Fifth",
        "Sixth",
        "Seventh",
        "Eighth",
        "Ninth",
        "Tenth",
        "Eleventh",
        "Twelfth",
        "thirteenth",
        "fourteenth",
        "fifteenth",
        "sixteenth",
        "seventeenth",
        "eighteenth",
        "nineteenth",
        "twentieth",
        "twenty first",
        "twenty second",
        "twenty third",
        "twenty fourth",
        "twenty fifth",
        "twenty sixth",
        "twenty seventh ",
        "twenty eighth",
        "twenty ninth",
        "thirtieth",
        "thirty first",
    };
    public static final String [] monthString = {
        "UNKNOWN",
        "january",
        "february",
        "march",
        "april",
        "may",
        "june",
        "july",
        "august",
        "september",
        "october",
        "november",
        "december",
    };

    private int day, month, year;

    public MyDate() {

    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return "Ngay " + day + " Thang " + month + " Nam " + year;
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ngay: ");
        day = scanner.nextInt();
        System.out.println("Thang: ");
        month = scanner.nextInt();
        System.out.println("Nam: ");
        year = scanner.nextInt();
    }

    public void print(MyDate myDate) {
        System.out.println(myDate);
    }

    public void print() {
        String day = dayString[this.day];
        String month = monthString[this.month];
        System.out.println(month + " the " + day + ", " + year);
    }

    public void print(String formatter) {
        switch (formatter) {
            case "dd/mm/yyyy":
                System.out.println(day + "/" + month + "/" + year);
                break;
            case "yyyy-mm-dd":
                System.out.println(year + "-" + month + "-" + day);
                break;
            default:
                System.out.println("Unknown formatter");
                break;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(String dayS) {
        for (int i = 0; i<32; i++) {
            if (dayS == dayString[i]) {
                day = i;
            }
        }
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(String monthS) {
        for (int i = 0; i<32; i++) {
            if (monthS == monthString[i]) {
                month = i;
            }
        }
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDate() {
        return day + "/" + month + "/" + year;
    }
}
