package tamrin62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isValidDate(int year, int month, int day) {
        Pattern pattern = Pattern.compile("([1-9]{4})/(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1])");
        String date = year + "/" + month + "/" + day;
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            year = Integer.parseInt(matcher.group(1));
            month = Integer.parseInt(matcher.group(2));
            day = Integer.parseInt(matcher.group(3));
            if (month > 6 && day < 31) {
                return true;
            } else if (month == 12 && day < 29) {

                return true;
            } else if (month < 6 && day <= 31) {
                return true;
            }
        }
        return false;

    }

    public int getmontlastDay(int month) {
        if (month <= 6) {
            return 31;
        } else if (month > 6 && month < 12) {
            return 30;
        } else {
            return 29;
        }
    }

    public String toString() {
        String name = "";

        switch (month) {
            case 1:
                name = "Farvardin";
                break;
            case 2:
                name = "Ordibehesht";
                break;
            case 3:
                name = "Khordad";
                break;
            case 4:
                name = "Tir";
                break;
            case 5:
                name = "Mordad";
                break;
            case 6:
                name = "Shahrivar";
                break;
            case 7:
                name = "Mehr";
                break;
            case 8:
                name = "Aban";
                break;
            case 9:
                name = "Azar";
                break;
            case 10:
                name = "Dey";
                break;
            case 11:
                name = "Bahman";
                break;
            case 12:
                name = "Esfand";
                break;

        }
        name = (day + "-" + name + "-" + year);
        return name;
    }

    public String nextDate() {

        String name = "";

        switch (month) {
            case 1:
                name = "Farvardin";
                if (day >= 1 || day <= 30) {
                    day += 1;
                }
                break;
            case 2:
                name = "Ordibehesht";
                if (day >= 1 || day <= 30) {
                    day += 1;
                }
                break;
            case 3:
                name = "Khordad";
                if (day >= 1 || day <= 30) {
                    day += 1;
                }
                break;
            case 4:
                name = "Tir";
                if (day >= 1 || day <= 30) {
                    day += 1;
                }
                break;
            case 5:
                name = "Mordad";
                if (day >= 1 || day <= 30) {
                    day += 1;
                }
                break;
            case 6:
                name = "Shahrivar";
                if (day >= 1 || day <= 30) {
                    day += 1;
                }
                break;
            case 7:
                name = "Mehr";
                if (day >= 1 || day <= 29) {
                    day += 1;
                }
                break;
            case 8:
                name = "Aban";
                if (day >= 1 || day <= 29) {
                    day += 1;
                }
                break;
            case 9:
                name = "Azar";
                if (day >= 1 || day <= 29) {
                    day += 1;
                }
                break;
            case 10:
                name = "Dey";
                if (day >= 1 || day <= 29) {
                    day += 1;
                }
                break;
            case 11:
                name = "Bahman";
                if (day >= 1 || day <= 29) {
                    day += 1;
                }
                break;
            case 12:
                name = "Esfand";
                if (day >= 1 || day <= 28) {
                    day += 1;
                }
                break;

        }
        name = (day + "-" + name + "-" + year);
        return name;
    }
}
