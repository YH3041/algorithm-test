package core.practice;



public class FindleapYear {
    public static void main(String[] args) {
        FindleapYear findleapYear = new FindleapYear();

        System.out.println(findleapYear.findLeap(1999));
    }

    public int findLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
