package lab3;
//
import java.util.Scanner;
//
public class MyDate {
    public static final String [] dayString = {
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
        "Thirteenth",
        "Fourteenth",
        "Fifteenth",
        "Sixteenth",
        "Seventeenth",
        "Eighteenth",
        "Nineteenth",
        "Twentieth",
        "Twenty first",
        "Twenty second",
        "Twenty third",
        "Twenty fourth",
        "Twenty fifth",
        "Twenty sixth",
        "Twenty seventh ",
        "Twenty eighth",
        "Twenty ninth",
        "Thirtieth",
        "Thirty first",
    };
    public static final String [] monthString = {
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December",
    };

    private int day, month, year;

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
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void print(MyDate myDate) {
        System.out.println(myDate);
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
