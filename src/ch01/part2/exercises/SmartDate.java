package ch01.part2.exercises;

import edu.princeton.cs.algs4.StdOut;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class SmartDate extends Date {
    private final int month;
    private final int day;
    private final int year;

    public SmartDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
        if (!validateDate()) {
            throw new RuntimeException("Please provide a valid date");
        }
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    private boolean validateDate() {
        return checkDay() && checkMonth();
    }

    private boolean checkMonth() {
        return month > 0 && month < 13;
    }

    private boolean checkDay() {
        if (day <= 0) return false;
        boolean isValid = true;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                isValid = day < 32;
                break;
            case 2:
                if (isLeapYear(year)) {
                    isValid = day < 30;
                } else {
                    isValid = day < 29;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                isValid = day < 31;
                break;
            default:
                break;
        }
        return isValid;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    private String dayOfTheWeek() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Calendar calendar = Calendar.getInstance();
        Date date;

        try {
            date = new SimpleDateFormat("MM/dd/yyyy").parse(this.toString());
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return days[dayOfWeek - 1];
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartDate smartDate = (SmartDate) o;
        return month == smartDate.month && day == smartDate.day && year == smartDate.year;
    }

    public int hashCode() {
        return Objects.hash(month, day, year);
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        SmartDate date = new SmartDate(m, d, y);
        StdOut.println(date);

    }
}
