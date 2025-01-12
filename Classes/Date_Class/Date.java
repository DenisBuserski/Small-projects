package EXERCISE.programmr_com.Classes.Date_Class;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
       this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 32) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 13) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 10000) {
            this.year = year;
        }
    }

    public void DisplayDate()
    {
        System.out.println(getDay()+"/"+getMonth()+"/"+getYear());
    }
}
