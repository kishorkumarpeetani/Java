public class LeapYearCheck {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please provide a year as argument");
            return;
        }

        int year = Integer.parseInt(args[0]);

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}