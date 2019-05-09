package lab4.date;
import lab4.date.MyDate;
//
public class DateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(11, 11, 1998);
        MyDate date2 = new MyDate(3, 5, 2019);

        date1.print();
        date1.print(date1);
        date1.print("yyyy-mm-dd");

        DateUtils.Compare(date1, date2);
	}
}